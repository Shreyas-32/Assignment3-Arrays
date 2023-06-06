import java.util.ArrayList;
import java.util.List;

public class Question_7 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> missingRanges = new ArrayList<>();


        if (lower < nums[0]) {
            missingRanges.add(getRange(lower, nums[0] - 1));
        }


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] > 1) {
                missingRanges.add(getRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }


        if (upper > nums[nums.length - 1]) {
            missingRanges.add(getRange(nums[nums.length - 1] + 1, upper));
        }

        return missingRanges;
    }

    private static String getRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "," + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println(result.toString());
    }
}
