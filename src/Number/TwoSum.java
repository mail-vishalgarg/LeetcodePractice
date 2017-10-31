package Number;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers, 
 * return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * 
 * Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

public class TwoSum {

	//Brute Force solution with O(n2)
	public static int[] twoSum_1(int[] arr,int target){
		int[] pair = new int[2];
		for (int i=0; i <arr.length -1; i++){
			for(int j=i+1; j<arr.length; j++){
				if (arr[j] + arr[i] == target){
					pair[0] = i;
					pair[1] = j;
				}
			}
		}
		return pair;
	}
	
	public static int[] twoSum_2(int[] arr,int target){
		int startIndex = 0;
		
		int[] pair = new int[2];
		while (startIndex < arr.length){
			for (int i=1; i<arr.length; i++){
				int nextVal = target - arr[startIndex];
				if (arr[i] == nextVal){
					pair[0] = startIndex;
					pair[1] = i;
				}
			}
			startIndex++;
		}
		return pair;
	}
	
	
	public static int[] twoSum_3(int[] arr,int target){
		int[] index = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i =0; i<arr.length; i++){
			if(hm.containsKey(target - arr[i])){
				index[0] = hm.get(target - arr[i]);
				index[1] = i;
			} else{
				hm.put(arr[i], i);
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum_1(arr, 22)));
		System.out.println(Arrays.toString(twoSum_2(arr, 22)));
		System.out.println(Arrays.toString(twoSum_3(arr, 22)));
	}
}
