package Array;

import java.util.Arrays;

/*
 * The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, 
 * first we reverse [1,2,3,4], it becomes[4,3,2,1]; then we reverse[5,6,7], 
 * it becomes[7,6,5], finally we reverse the array as a whole, 
 * it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].
 * 
 * Reverse is done by using two pointers, one point at the head and the 
 * other point at the tail, after switch these two, these two pointers move 
 * one position towards the middle.
 */

public class RotateArray {
	public static void rotateArray(int[] arr, int k){
		if (arr == null || arr.length < 2){
			return;
		}
		k = k%arr.length;

		reverse(arr, 0, arr.length - k -1);
		reverse(arr, arr.length -k, arr.length -1);
		reverse(arr, 0, arr.length -1);
	}
	
	public static void reverse(int[] arr,int start,int tail){
		while(start < tail){
			int temp = arr[start];
			arr[start] = arr[tail];
			arr[tail] = temp;
			start++;
			tail--;
		}
		
	}
	//Below solution is without hash but have one extra storage.
	
	public static void rotate_2(int[] nums, int k) {
		if (nums.length <= 1) {
			return;
		}
		//step each time to move
		int step = k % nums.length;
		int[] tmp = new int[step];
		for (int i = 0; i < step; i++) {
			tmp[i] = nums[nums.length - step + i];
		}
		for (int i = nums.length - step - 1; i >= 0; i--) {
			nums[i + step] = nums[i];
		}
		for (int i = 0; i < step; i++) {
			nums[i] = tmp[i];
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(arr,k);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = {1,2,3,4,5,6,7};
		rotate_2(arr1, k);
		System.out.println(Arrays.toString(arr1));
	}
	
	
}
