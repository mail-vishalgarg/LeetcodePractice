package BitWise;

import java.util.ArrayList;
import java.util.HashMap;
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
	
	public static void uniqOneNumber(int[] nums){
		ArrayList<Integer> store = new ArrayList<Integer>();
		
		for (int i=0; i<nums.length; i++){
			if (!store.contains(nums[i])){
				store.add(nums[i]);
			}
		}
		System.out.println(store.size());
		for (int y=0; y<store.size(); y++){
			System.out.println(store.get(y));
		}
	}
	
	public static void singleNumber2(int[] nums){
		int size = nums.length;
		int temp = 0;
		int result = 0;
		int arr1[] = new int[size];
		for(int i=0; i<size; i++){
			boolean flag = true;
			temp = nums[i];
			for(int j=0; j<size; j++){
				if (temp == nums[j]){
					if (i != j){
						flag = false;
						break;
					}
				}
			}
			if (flag == true){
				result = temp;
			}
		}
		
		System.out.println("Single non repeated number is: " + result);
	}
	
	public static void singleNumber3(int[] nums){
		HashMap<Integer, Integer> uniqEle = new HashMap<Integer, Integer>();
		int count = 1;
		for (int i=0; i<nums.length; i++){
			if(uniqEle.containsKey(nums[i])){
				uniqEle.put(nums[i], count++);
				count = 1;
			} else {
				uniqEle.put(nums[i], 1);
			}
		}
		
		System.out.println("complete Hash value");
		for (int j: uniqEle.keySet()){
			System.out.println(j + " => " + uniqEle.get(j) );
		}
		for(int k :uniqEle.keySet()){
			if (uniqEle.get(k) == 1){
				System.out.println(k);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 1, 2, 3, 4, 1, 4 };
		System.out.println(singleNumber(numbers) + "\n");
		
		uniqNumber(numbers);
		
		System.out.println("-------------------------");
		int[] numbers2 = new int[] { 2, 1,2, 3, 4, 1, 4 };
		uniqOneNumber(numbers2);
		
		System.out.println("----------------------------");
		singleNumber2(numbers2);
		
		System.out.println("===============================");
		singleNumber3(numbers2);
	}
}
