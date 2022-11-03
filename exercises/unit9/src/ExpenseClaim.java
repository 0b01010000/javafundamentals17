public class ExpenseClaim {
	int id;
	int employeeId;
	String dateOfClaim;
	double totalAmount;
	boolean approved;
	boolean paid;

	ExpenseClaim(int id, int employeeId, String dateOfClaim, double totalAmount) {
		this.id = id;
		this.employeeId = employeeId;
		this.dateOfClaim = dateOfClaim;
		this.totalAmount = totalAmount;
		this.approved = false;
		this.paid = false;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public void setPaid(boolean paid) {
		if (paid && !approved) {
			System.out.println("This item cannot be paid as it has not yet been approved.");
		} else {
			this.paid = paid;
		}
	}

	public int getId() {
		return id;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getDateOfClaim() {
		return dateOfClaim;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public boolean getApproved() {
		return approved;
	}

	public boolean getPaid() {
		return paid;
	}
}