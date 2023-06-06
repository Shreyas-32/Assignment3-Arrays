import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question_2 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(nums); // Sort the array in ascending order

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1; // Pointer for the third element
                int right = n - 1; // Pointer for the fourth element

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        // Found a valid quadruplet, add it to the result list
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicate values for the third and fourth elements
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++; // Move the left pointer to the right
                        right--; // Move the right pointer to the left
                    } else if (sum < target) {
                        left++; // Move the left pointer to the right
                    } else {
                        right--; // Move the right pointer to the left
                    }
                }
            }
        }

        return quadruplets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println(result);
    }
}
