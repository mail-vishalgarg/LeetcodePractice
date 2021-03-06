package Array;

import java.util.Arrays;

public class SortArrayComparator {
	public static void main(String[] args) {
		double[][] array= {
				{1, 5},
				{13, 1.55},
				{12, 100.6},
				{12.1, .85} };
		java.util.Arrays.sort(array, new java.util.Comparator<double[]>() {
			public int compare(double[] a, double[] b){
				return(Double.compare(a[0], b[0]));
			}
		});
		
		for (double[] arr: array){
			System.out.println(Arrays.toString(arr));
		}
	}
}
