public class Employee {
	private String firstName;
	private String surname;
	private Integer age;

	Employee(String firstName, String surname, Integer age) {
		this.firstName = firstName;
		this.surname = surname;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}

	public Integer getAge() {
		return age;
	}

	public String toString() {
		String fmt = String.format("[Name: %s, Surname: %s, Age: %d]", 
						firstName, surname, age);
		return fmt;
	}
}