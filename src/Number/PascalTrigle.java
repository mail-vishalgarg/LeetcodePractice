package Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given numRows, generate the first numRows of Pascal's triangle.
* 
* For example, given numRows = 5,
* Return
* 
* [
*      [1],
*     [1,1],
*    [1,2,1],
*   [1,3,3,1],
*  [1,4,6,4,1]
* ]
*/

public class PascalTrigle {
	public static int[] generatePascalRows(int row){
		if (row == 0){
			int[] result = {1};
			return result;
		}
		if (row == 1){
			int[] result = {1,1};
			return result;
		}
		int[] previous = {1,1};
		for (int i = 2; i<=row; i++){
			int[] next = new int[i + 1];
			next[0] = 1;
			for (int r=1; r <i; r++){
				next[r] = previous[r-1] + previous[r];
			}
			next[i] = 1;
			previous = next;
		}
		return previous;
	}
	
	public static List<List<Integer>> generatePascalTringale(int row){
		List<List<Integer>> listoflist = new ArrayList<List<Integer>>();
		if (row == 0){
			return listoflist;
		}
		
		listoflist.add(new ArrayList<Integer>(Arrays.asList(1)));
		List<Integer> next, prev = null;
		for ( int i = 2; i <= row; i++){
			next = new ArrayList<Integer>(Arrays.asList(1));
			for (int r = 1; r <i-1; r++){
				next.add(prev.get(r-1) + prev.get(r));
			}
			next.add(1);
			prev = next;
			listoflist.add(next);
		}
		return listoflist;
		
	}
	public static void main(String[] args){
		System.out.println(generatePascalTringale(5));
		int[] result = generatePascalRows(3);
		for (int i : result)
			System.out.print(i + " ");
	}
}
