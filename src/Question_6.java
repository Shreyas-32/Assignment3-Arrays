public class Question_6 {
    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // Perform bitwise XOR operation
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int result = singleNumber(nums);
        System.out.println(result);
    }
}
