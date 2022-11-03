public class Main {
	public static void main(String[] args) {
		ExpenseClaim expenseClaim = new ExpenseClaim(10, 12, "03/11/2022", 202.41);
		expenseClaim.setApproved(true);
		expenseClaim.setPaid(true);
		System.out.println("== Expense Claim ==");
		System.out.println("ID: " + expenseClaim.getId());
		System.out.println("EmployeeID: " + expenseClaim.getEmployeeId());
		System.out.println("DateOfClaim: " + expenseClaim.getDateOfClaim());
		System.out.println("TotalAmount: " + expenseClaim.getTotalAmount());
		System.out.println("Approved: " + expenseClaim.getApproved());
		System.out.println("Paid: " + expenseClaim.getPaid());

		System.out.println();

		System.out.println("== Expense Item ==");
		ExpenseItem expenseItem = new ExpenseItem(102, 202, "hotel", "local to do meetings", 500);
		System.out.println(expenseItem);
	}
}
