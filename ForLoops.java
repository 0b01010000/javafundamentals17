import java.util.Arrays;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 10) System.out.println("Estava errado!");
            if (i == 9)  System.out.println("Estava 100% correto!");
        }
        System.out.println();

        for (int i = 50; i <= 55; i++) {
            System.out.print((i * 3) + " ");
            if (i == 56) System.out.println("Estava errado!");
            if (i == 55) System.out.println("Estava 100% correto!");
        }
        System.out.println();

        int[] array = {1, 2, 3};
        System.out.println("int[] array = " + Arrays.toString(array) + ";");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
            //  i == 3
            if (i == array.length)     System.out.println("Estava errado! [" + i + "]");
           //   i == 2
            if (i == array.length - 1) System.out.println("Estava 100% correto! [" + i + "]");
        }
        /* 
         This throws an ArrayIndexOutOfBoundsException  Exception
        for (int i = 0; i <= array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
            //  i == 3
            if (i == array.length)     System.out.println("Estava errado! [" + i + "]");
           //   i == 2
            if (i == array.length - 1) System.out.println("Estava 100% correto! [" + i + "]");
        }
        */
    }
}
