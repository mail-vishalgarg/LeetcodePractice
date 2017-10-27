package BitWise;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers, every element appears twice except for one.
 * Find that single one. Note: Your algorithm should have a linear runtime
 * complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
	
	/*LOGIC: XOR will return 1 only on two different bits. 
	 * So if two numbers are the same, XOR will return 0. Finally only one number left.
	 *	A ^ A = 0 and A ^ B ^ A = B.
	*/		
	public static int singleNumber(int[] nums) {
		for (int i = 1; i<nums.length;i++){
			nums[0] = nums[0] ^ nums[i];
		}
		return nums[0];
	}
	//Below method is to get the uniq Integer. it is not related to the above problem
	public static void uniqNumber(int[] nums){
		Set<Integer> uniq = new HashSet<Integer>();
		for (int i=0; i<nums.length; i++){
			uniq.add(nums[i]);
		}
		for (int y: uniq)
			System.out.println("uniq integer:" + y);
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 2, 1, 3, 4, 1, 4 };
		System.out.println(singleNumber(numbers) + "\n");
		
		uniqNumber(numbers);
	}
}
