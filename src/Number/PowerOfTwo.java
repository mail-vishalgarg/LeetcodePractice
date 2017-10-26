package Number;

/*
 * Given an integer, write a function to determine if it is a power of two.
 */

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n, int target){
		if(n == 0) {
			return false;
		}
		if ((n == 1) || (n == 2)){
			return true;
		}
		if (n % target == 0)
			return isPowerOfTwo(n / target, target);
		return false;
		
	}
	
	/*
	 * Bit Manipulation
	 * Power of 2 means only one bit of n is '1', 
	 * so use the trick n&(n-1)==0 to judge whether that is the case
	 */
	
	public static boolean isPowerOfTwo_1(int n){
		return ((n & (n-1)) == 0 && n > 0);
	}
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8,2));
		System.out.println(isPowerOfTwo(16,3) + "\n");
		System.out.println("Second Method");
		System.out.println(isPowerOfTwo_1(8));
	}
}
