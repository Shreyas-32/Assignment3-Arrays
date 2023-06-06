public class Question_3 {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            // Find the next greater element to swap with
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }

            // Swap the elements
            swap(nums, i, j);
        }

        // Reverse the remaining elements
        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
