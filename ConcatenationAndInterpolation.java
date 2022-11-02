public class ConcatenationAndInterpolation {
	public static void main(String[] args) {
		String name = args[0];
		String lastName = args[1];

		// concatenation
		String greeting1 = "In: Hello, " + name + " " + lastName + "!";
		// Interpolation
		String greeting2 = String.format("Con: Hello, %s %s!", name, lastName);

		System.out.println(greeting1);
		System.out.println(greeting2);
	}
}