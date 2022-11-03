public class ExpenseItem {
	private int id;
	private int claimId;
	private String expenseType;
	private String description;
	private double amount;

	ExpenseItem(int id, int claimId, String expenseType, String description, double amount) {
		this.id = id;
		this.claimId = claimId;
		this.expenseType = expenseType;
		this.description = description;
		this.amount = amount;
	}

	public String toString() {
		String format = String.format("ID: %d %n ClaimID: %d %n ExpenseType: %s %n Description: %s %n Amount: %.2f %n", 
						id, claimId, expenseType, description, amount);
		return format;
	}
}