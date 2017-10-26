package Array;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr){
		int n = arr.length;
		for (int i=1; i<n; i++){
			int key = arr[i];
			int j = i - 1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j -1;
			}
			arr[j+1] = key;
		}
	}
	
	//Second method is better
	public static void insertionSort2(int[] s){
		int n = s.length;
		int i, j;
		
		for(i = 1; i < n; i++){
			j = i;
			while(j >0 && (s[j] < s[j-1])){
				int temp = s[j];
				s[j] = s[j-1];
				s[j-1] = temp;
				j = j -1;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] num = {3,2,5,1,9,6};
		insertionSort(num);
		System.out.println(Arrays.toString(num));
		
		System.out.println("--------------");
		int[] num2 = {3,2,5,1,9,6};
		insertionSort2(num2);
		System.out.println(Arrays.toString(num2));
		
	}
}
