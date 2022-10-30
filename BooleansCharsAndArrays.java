import java.util.Arrays;

public class BooleansCharsAndArrays {
    public static void main(String[] args) {
        boolean isEven = true;
        char myNameFirstLetterIs = 'T';
        int[] firstTenPrimeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        System.out.println("Is 2 even? " + isEven);
        System.out.println("My name first letter is " + myNameFirstLetterIs);
        System.out.println("The first ten prime numbers are " + setBuilderNotation(firstTenPrimeNumbers));

        System.out.println("The first prime number is " + firstTenPrimeNumbers[0]);
    }

    private static String setBuilderNotation(int[] numbers) {
        return  Arrays.toString(numbers)
                        .replace("[", "{")
                        .replace("]", "}");
    }
}
