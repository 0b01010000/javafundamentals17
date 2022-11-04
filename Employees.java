public class Employees {

	private Employee[] employees;

	Employees(int size) {
		this.employees = new Employee[size];
	}

	public void addEmployee(Employee employee) {
		int firstEmptyPosition = -1;

		for (int i = 0; i < employees.length; i++) {
			if (firstEmptyPosition == -1 && employees[i] == null) {
				firstEmptyPosition = i;
				break;
			}
		}

		if (firstEmptyPosition == -1) {
			System.out.println("Sorry, but this array is full!");
		} else {
			employees[firstEmptyPosition] = employee;
		}
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public Employee findBySurname(String surname) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSurname().equals(surname)) {
				return employees[i];
			}
		}

		return null;
	}
}