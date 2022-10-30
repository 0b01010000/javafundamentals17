package exercises;

import java.util.Arrays;

public class EvenOddArray {
    public static void main(String[] args) {
        // 2, 4, 8, 20, 1, 5, 7, 11
        int[] numbers = {1, 2, 5, 4, 7, 8, 11, 20};

        System.out.println(Arrays.toString(evenOddArray(numbers)));
    }

    private static int[] evenOddArray(int[] numbers) {
        int size = numbers.length;
        int[] nums = new int[size];

        int j = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) nums[j++] = numbers[i];
        }

        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 != 0) nums[j++] = numbers[i];
        }

        return nums;

    }
}
