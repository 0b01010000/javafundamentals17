public class CallVariableScope {
	public static void main(String[] args) {
		VariableScope object1 = new VariableScope(2); 
		VariableScope object2 = new VariableScope(2, 3);
		VariableScope object3 = new VariableScope(2, 3, 4, 10);

		System.out.println("The sum of " + object1.toString() + " is " + object1.add()); // 2 2
		System.out.println("The product of " + object1.toString() + " is " + object1.multiply()); // 2 2

		System.out.println("The sum of " + object2.toString() + " is " + object2.add()); // 2, 3 5
		System.out.println("The product of " + object2.toString() + " is " + object2.multiply()); // 2, 3 6

		System.out.println("The sum of " + object3.toString() + " is " + object3.add()); // 2, 3, 4, 10 19
		System.out.println("The product of " + object3.toString() + " is " + object3.multiply()); // 2, 3, 4, 10 240
	}
}