public class IfAndSwitchStatements {
    public static void main(String[] args) {
        int letterInLowerCase = 97;
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c ", letterInLowerCase + i);
        }
        System.out.println();

        int letterInUpperCase = 65;
        for (int i = 0; i < 26; i++) {
            System.out.printf("%c ", letterInUpperCase + i);
        }
        System.out.println();

        for (int i = 97; i <= 102; i++) {
            System.out.printf("%c ", charToByte((char) i));
        }
        System.out.println("...");

        for (char i = 65; i <= 70; i++) {
            System.out.printf("%c ", charToByteWithSwitchStatement(i));
        }
        System.out.println("...");
    }

    private static byte charToByte(char ch) {
        byte number = Byte.MIN_VALUE;
        if (ch == 'a')      number = 97;
        else if (ch == 'b') number = 98;
        else if (ch == 'c') number = 99;
        else if (ch == 'd') number = 100;
        else if (ch == 'e') number = 101;
        else if (ch == 'f') number = 102;
        /* continue... */
        return number;
    }
    private static byte charToByteWithSwitchStatement(char ch) {
        byte number;
        switch(ch) {
            case 'A':
                number = 65;
                break;
            case 'B':
                number = 66;
                break;
            case 'C':
                number = 67;
                break;
            case 'D':
                number = 68;
                break;
            case 'E':
                number = 69;
                break;
            case 'F':
                number = 70;
                break;
            default:
                number = Byte.MIN_VALUE;
                break;
        }
        return number;
    }
}
