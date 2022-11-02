public class VariableScope {
	private int[] nums;

	VariableScope(int... nums) {
		this.nums = nums;
	}

	public int add() {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return sum;
	}

	public int multiply() {
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			product *= nums[i];
		}

		return product;
	}

	public String toString() {
		String newStr = "";
		int size = nums.length;

		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				newStr = newStr + nums[i] + " ";
			} else {
				newStr = newStr + nums[i] + ", ";
			}
		}

		return newStr;
	}
}