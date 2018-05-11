package Number;

/*A number can always be represented as a sum of squares of other numbers. 
 * Note that 1 is a square and we can always break a number as (1*1 + 1*1 + 1*1 + …). 
 * Given a number n, find the minimum number of squares that sum to X.

Examples:

Input:  n = 100
Output: 1
100 can be written as 102. Note that 100 can also be 
written as 52 + 52 + 52 + 52, but this
representation requires 4 squares.

Input:  n = 6
Output: 3*/
public class GetMinimumSquare {
	
	public static int getMinSquare(int n){
		if (n < 3)
			return n;
		int res = n;
		
		for(int i = 1; i<= n; i++){
			int temp = i * i;
			if (temp > n){
				break;
			}else { 
				res = Math.min(res, 1+getMinSquare(n - temp));
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(getMinSquare(13));
		System.out.println(getMinSquare(9));
		System.out.println(getMinSquare(6));
	}

}
