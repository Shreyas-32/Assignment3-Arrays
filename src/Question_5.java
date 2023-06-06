import java.util.Arrays;

public class Question_5 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the least significant digit to the most significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit by one
                return digits; // No carry, return the updated array
            } else {
                digits[i] = 0; // Set the digit to 0 and continue to the next digit
            }
        }

        // If all digits are 9, a new digit 1 needs to be added at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
