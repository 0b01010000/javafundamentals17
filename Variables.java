import java.util.Arrays;
import java.util.List;

public class Variables {
    public static void main(String[] args) {
        int i = 1;
        int j;
        j = 2;
        System.out.println(i + " " + j);

        byte a = -127; // ... 127
        short b = -32_768; // ... 32,757
        int c = -2_147_483_647; // ... 2_147_483_647
        long d = -9_223_372_036_854_775_808L; // 9_223_372_036_854_775_807;

        double pi = 3.14;
        float pi2 = 3.14f;

        char letter = 'A';
        String name = "Super";

     
        System.out.println(i + ", " + j + ", " + a + ", " + 
                    b + ", " + c + ", " + d + ", "
                     + pi + ", " + pi2 + ", " + letter + ", " + name);
    }
}
