public class MyClass {
	public static void main(String[] args) {
		System.out.println(whoIsOlder(17, 19)); // 19
		System.out.println(whoIsOlder(21, 18)); // 21
		System.out.println(whoIsOlder(40, 45)); // 45

		System.out.println();

		System.out.println(longerThan5("amor")); // false
		System.out.println(longerThan5("live")); // false
		System.out.println(longerThan5("testing")); // true

	}

	public static int whoIsOlder(int a1, int a2) {
		/*if (a1 > a2) return a1;
		else return a2;*/
		return a1 > a2 ? a1 : a2;
	}

	public static boolean longerThan5(String s) {
		int size = s.length();

		/*if (size >= 6) return true;
		else return false;*/

		// return size >= 6 ? true : false;

		return size >= 6;
	}
}