package Number;

public class SqrtNumber {
	public static int mySqrt(int n){
		if (n == 0 || n == 1){
			return n;
		}
	
		int i=1;
		int result = 1;
		while (result < n){
			if (result == n){
				return result;
			}
			i++;
			result = i*i;
		}
		return i-1;
	}
	
	public static int mysqrt_1(int n){
		if (n == 0)
			return n;
		int start = 1, end = n, ans = 0;
		
		while(start < end){
			int mid = (start + end) / 2;
			if (mid * mid == n){
				return mid;
			}
			if (mid * mid < n){
				start = mid + 1;
				ans = mid;
			}else {
				end = mid -1;
			}
		}
		return ans;
	}

	/*Here is the equation you need.

	sqrt(n+1) = (sqrt(n) + num/sqrt(n) )/2

	The first sqrt number should be the input number / 2.

	Using the equation, we can come up with a Java Square Root method by ourselves.*/
	public static double sqrt(int number){
		double t;
		 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	public static void main(String[] args) {
		int number = 8;
		System.out.println(sqrt(2));
		System.out.println(mySqrt(number) + "\n");
		System.out.println(mysqrt_1(number));
		System.out.println(sqrt(2));
		
	}
}
