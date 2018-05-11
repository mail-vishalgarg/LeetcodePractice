package Number;

public class PowerOfThree {

	public static boolean isPowerOfThree(int num){
		if ((num == 0) ||(num == 2)){
			return false;
		}
		if((num == 1) || (num == 3)){
			return true;
		}
		
		if( num % 3 == 0){
			return isPowerOfThree(num / 3);
		}
		return false;
	}
	
	//Iterative solution
	public static boolean isPowerOfThree_2(int n){
		if (n > 1){
			while( n % 3 == 0){
				n /= 3;
			}
		}
		return ( n == 1);
	}
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfThree_2(0));
	}
}
