import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Employee o   = new Employee("John", "Joe", 100);
		Employee oo  = new Employee("Mark", "Rufalo", 100);
		Employee ooo = new Employee("Chloe", "Grace", 100);

		Employees employees = new Employees(3);

		employees.addEmployee(o);
		employees.addEmployee(oo);
		employees.addEmployee(ooo);
		employees.addEmployee(ooo);

		System.out.println(Arrays.toString(employees.getEmployees()));
		System.out.println(employees.findBySurname("Rufalo").getFirstName());
		System.out.println(employees.findBySurname("Bella"));

		for (Employee employee : employees.getEmployees()) {
			System.out.println(employee.getSurname());
		}
	}
}