// always start a class with a capital letter
public class CallNameManager {
	public static void main(String[] args) {
		NameManager n = new NameManager();

		System.out.println("My name is " + n.getFirstName());
		System.out.println("My surname is " + n.getSurname());
	}
}