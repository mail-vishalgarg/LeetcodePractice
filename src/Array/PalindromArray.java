package Array;

import java.util.Arrays;

/** Check an integer array is palindrome or not
 * @author vishgarg
 */
public class PalindromArray {
	public static boolean isPalindrome(int[] num){
		int length = num.length;
		int mid = length/2;
		System.out.println("MID:" + mid);
		for(int i=mid + 1; i< length-1; i++){
			int temp = num[i];
			num[i] = num[i+1];
			num[i+1] = temp;
		}
		
		
		for (int i=0; i <mid; i++){
			if (num[i] == num[mid + 1 + i]){
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,3,2,1};
		System.out.println(isPalindrome(num));
		System.out.println(Arrays.toString(num));
	}
}
