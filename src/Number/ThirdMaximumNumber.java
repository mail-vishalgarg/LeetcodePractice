package Number;
/** ---------------------------------------------
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 * 
 * Example 1: Input: [3, 2, 1] ;   Output: 1
 * Explanation: The third maximum is 1.
 * 
 * Example 2: Input: [1, 2] ;    Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * 
 * Example 3: Input: [2, 2, 3, 1]  ;  Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * 
 * Both numbers with value 2 are both considered as second maximum.
 * --------------------------------------------- */

public class ThirdMaximumNumber {
	public static int thirdMaxNumber(int[] s){
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		
		for (int i = 0; i<s.length; i++){
			if (s[i] == max1 || s[i] == max2 || s[i] == max3){
				continue;
			}
			if (s[i] > max1 || max1 == 0){
				max3 = max2;
				max2 = max1;
				max1 = s[i];
			} else if (s[i] > max2 || max2 == 0){
				max3 = max2;
				max2 = s[i];
			} else if(s[i] > max3 || max3 == 0){
				max3 = s[i];
			}
		}
		return max3 == 0?max1 : max3;
		/*if (max3 == null){
			return max1;
		}else {
			return max3;
		}*/
	}
	
	public static void main(String[] args) {
		int[] arr = {2,2,3,4};
		System.out.println(thirdMaxNumber(arr));
	}
}
