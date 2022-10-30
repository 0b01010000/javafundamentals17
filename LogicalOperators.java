public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(12)); // Fizz
        System.out.println(fizzBuzz(10)); // Buzz
        System.out.println(fizzBuzz(15)); // FizzBuzz
    }

    private static String fizzBuzz(int n) {
         // if n is divisible by 3 and 5
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        // if n is divisible by 3
        else if (n % 3 == 0)          return "Fizz";
        // if n is divisible by 5
        else if (n % 5 == 0)          return "Buzz";
        // n cannot be divided by 3 nor 5
        else                          return "Not divisible by 3 nor 5";
    }
}
