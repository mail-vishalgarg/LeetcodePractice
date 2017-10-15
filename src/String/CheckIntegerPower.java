package String;


public class CheckIntegerPower {
	public static boolean isValidPower(int num, int target) {
		if (target == 0) {
			return false;
		}
		int pow = 1;
		while (pow < num) {
			pow = pow * target;
		}
		return (pow == num);
	}

	public static void main(String[] args) {
		System.out.println(isValidPower(27, 3));
	}
}
