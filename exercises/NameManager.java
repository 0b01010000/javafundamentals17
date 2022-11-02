public class NameManager {
	private String fullName = "Taffarel Oliveira";

	public String getFirstName() {
		/*int indexOfSpace = fullName.indexOf(" ");
		int firstName = fullName.substring(0, indexOfSpace);*/
		String[] values = fullName.split(" ");
        return values[0];
	}

	public String getSurname() {
		// int indexOfSpace = fullName.indexOf(" ");
		// int surname = fullName.substring(indexOfSpace + 1, fullName.length());
		String[] values = fullName.split(" ");
        return values[values.length - 1];
	}
}