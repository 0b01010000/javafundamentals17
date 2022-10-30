public class WhileLoops {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Counter 01");
        while (counter < 5) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    
        counter = 0;
        System.out.println("Counter 02");
        while (counter < 5) {
            System.out.print(counter++ + " ");
        }
        System.out.println();

        counter = 0;
        System.out.println("Counter 03");
        while (counter < 5) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();

        counter = 0;
        System.out.println("Counter 04");
        while (counter < 5) {
            System.out.print(++counter + " ");
        }
        System.out.println();
        System.out.println();

        int[] array = {1, 2, 3};
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        i = 0;
        while (i < array.length) {
            if (array[i] == 1)      System.out.println("ONE");
            else if (array[i] == 2) System.out.println("TWO");
            else if (array[i] == 3) System.out.println("THREE");
            else                    System.out.println("It is not ONE, TWO or THREE.");
            i++;
        }
        System.out.println();

        int number = 0;
        while (number <= 20) {
            if (number % 2 == 0) System.out.print(number + " ");
            number++;
        }
        System.out.println();
    }
}
