package Array;

import java.util.Arrays;
/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) 
 * to hold additional elements from nums2. The number of elements initialized in 
 * nums1 and nums2 are m and n respectively.
 */

public class MergeSortedArray {
	public static void merge(int[] num1, int m, int[] num2, int n){
		int p1=0, p2 = 0;
		if (n < 1)
			return;
		
		while(p1 < m){
			if (num1[p1] < num2[p2]){
				p1++;
			} else {
				int tmp = num1[p1];
				num1[p1] = num2[p2];
				num2[p2] = tmp;
				p1++;
				
				while (p2 < n -1 && num2[p2] > num2[p2 +1]){
					int tmp1 = num2[p2];
					num2[p2] =num2[p2 +1];
					num2[p2 + 1] = tmp1;
					p2++;
				}
				p2 = 0;
			}
		}
		
		while(p2 < n){
			num1[p1] = num2[p2];
			p1++;
			p2++;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {2,4,5,8,0,0,0};
		int[] arr2 = {1,6,9};
		/*Arrays.sort(arr1);
		Arrays.sort(arr2);*/
		merge(arr1, 4, arr2, 3);
		System.out.println("----------------------------");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
