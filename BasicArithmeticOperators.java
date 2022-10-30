public class BasicArithmeticOperators {
    public static void main(String[] args) {
        int a = 500, b = 10, myvar; 
        // +, -, *, /, %
        myvar = a + b; // 510
        System.out.println(myvar);

        myvar = a - b; // 490
        System.out.println(myvar);

        myvar = a * b; // 5000
        System.out.println(myvar);

        myvar = a / b; // 50
        System.out.println(myvar);

        myvar = a % b; // 0
        System.out.println(myvar);

        // ++myvar, myvar++, --myvar, myvar--
        System.out.println(myvar++); // 0 because I'm returning first and incrementing after
        System.out.println(++myvar); // 2 because I'm incrementing first and returning after

        System.out.println(myvar--); // 2 becuase I'm decrementing after returning myvar's value
        System.out.println(--myvar); // 0 because I'm decrementing before returning myvar's value

        // +=, -=, *=, /=, %=
        myvar += 4; // myvar = myvar + 4 = 4
        System.out.println(myvar);

        myvar -= 4; // myvar = myvar - 4 = 0
        System.out.println(myvar);

        myvar *= 4; // myvar = myvar * 4 = 0
        System.out.println(myvar);

        myvar /= 4; // myvar = myvar / 4 = 0
        System.out.println(myvar);

        myvar %= 4; // myvar = myvar % 4 = 0
        System.out.println(myvar);

    }
}
