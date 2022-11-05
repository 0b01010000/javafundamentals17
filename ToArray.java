import java.util.Arrays;
import java.util.Scanner;

public class ToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, amountNumbers;
        int[] numbers;

        System.out.println("== Want to create an array of numbers ==");
        System.out.print("How many numbers does your array have? ");
        amountNumbers = scanner.nextInt();
        numbers = new int[amountNumbers];
        int i = 0;
        while (i < amountNumbers) {
            System.out.print("Type a number: ");
            number = scanner.nextInt();
            numbers[i] = number;
            i++;
        }
        scanner.close();
        System.out.println("Your array was created: " + Arrays.toString(numbers));
    }
}
