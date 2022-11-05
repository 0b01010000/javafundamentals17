import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.printf("%d in binary is %s!", number, toBinary(number));
    }

    public static String toBinary(int n) {
        StringBuffer newStr = new StringBuffer("");

        int tmp = n;
        while (tmp != 0) {
            newStr.append( tmp % 2);
            tmp = tmp / 2;
        }
        return newStr.reverse().toString();
    }
}
