package Number;

/*A Product Array Puzzle
Given an array arr[] of n integers, construct a Product Array prod[] 
(of same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i]. 
Solve it without division operator and in O(n).

Example:
arr[] = {10, 3, 5, 6, 2}
prod[] = {180, 600, 360, 300, 900}*/

public class ProductArray {

	    /* Function to print product array for a given array
	       arr[] of size n */
	    void productArray(int arr[], int n) 
	    {
	        // Initialize memory to all arrays
	        int left[] = new int[n];
	        int right[] = new int[n];
	        int prod[] = new int[n];
	 
	        int i, j;
	 
	        /* Left most element of left array is always 1 */
	        left[0] = 1;
	 
	        /* Rightmost most element of right array is always 1 */
	        right[n - 1] = 1;
	 
	        /* Construct the left array */
	        for (i = 1; i < n; i++)
	            left[i] = arr[i -1] * left[i - 1];
	        
	        //Print left array
	        for (int l=0; l<left.length; l++){
	        	System.out.println("Left array:" + left[l]);
	        }
	 
	        /* Construct the right array */
	        for (j = n - 2; j >= 0; j--)
	            right[j] = arr[j + 1] * right[j + 1];
	 
	      //Print right array
	        for (int r=0; r<left.length; r++){
	        	System.out.println("Right array:" + right[r]);
	        }
	        /* Construct the product array using
	           left[] and right[] */
	        for (i = 0; i < n; i++)
	            prod[i] = left[i] * right[i];
	 
	        /* print the constructed prod array */
	        for (i = 0; i < n; i++)
	            System.out.print(prod[i] + " ");
	 
	        return;
	    }
	 
	    /* Driver program to test the aboe function */
	    public static void main(String[] args) 
	    {
	        ProductArray pa = new ProductArray();
	        int arr[] = {10, 3, 5, 6, 2};
	        int n = arr.length;
	        System.out.println("The product array is : ");
	        pa.productArray(arr, n);
	    }
	}
