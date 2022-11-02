public class TernaryOperator {
	public static void main(String[] args) {
		withoutTernaryOperator();
		withTernaryOperator();
	}

	public static void withoutTernaryOperator() {
		String fullName = "Sandra Burnside";
		int indexOfSpace = fullName.indexOf(" ");
		String name = fullName.substring(0, indexOfSpace);
		int size = name.length();
		boolean evenLength;

		if (size % 2 == 0) {
			evenLength = true;
		} else {
			evenLength = false;
		}

		System.out.println("== Without Ternary Operator ==");
		System.out.println("Name: " + name);
		System.out.println("The name's length ("+ size +") is even: " + evenLength); 
	}

	public static void withTernaryOperator() {
		String fullName = "Sandra Burnside";
		int indexOfSpace = fullName.indexOf(" ");
		String name = fullName.substring(0, indexOfSpace);
		int size = name.length();
		// boolean evenLength = size % 2 == 0;
		boolean evenLength = size % 2 == 0 ? true : false;

		System.out.println();
		System.out.println("== With Ternary Operator ==");
		System.out.println("Name: " + name);
		System.out.println("The name's length ("+ size +") is even: " + evenLength);  

	}
}
