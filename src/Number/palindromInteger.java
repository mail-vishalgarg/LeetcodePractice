package Number;

public class palindromInteger {
	public static boolean isPalindrom(int num){
		int original = num;
		System.out.println("Org:" + original);
		int rev=0;
		while (num > 0){
			int x = num %10;
			rev = rev * 10 + x;
			num = num/10;
			System.out.println("NUM:" + num + " " + rev);
		}
		return (rev == original);
	}
	
	public static void main(String[] args) {
		int num = 12321;
		System.out.println(isPalindrom(num));
	}
}
