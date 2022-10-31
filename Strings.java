public class Strings {
    public static void main(String[] args) {
        // Introducting the string
        String name1 = "john";
        String name2 = "Mark";

        int size = name1.length();
        String upper = name1.toUpperCase();
        System.out.println(upper + ", your name has " + size + " letters.");

        // Comparing strings
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals("john"));
        System.out.println(name1.repeat(5));
    }
}
