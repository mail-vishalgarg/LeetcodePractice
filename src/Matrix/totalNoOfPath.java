package Matrix;
/* Find total no. of paths from (0,0) to (m-1,n-1) in a (m,n) matrix and only right and down moves are allowed.
 * 
 */
public class totalNoOfPath {
	//Below is the Dynamic programming (memoization ) approach. it is top down approach.
	public static int noOfPath(int m, int n){
		int count[][] = new int[m+1][n+1];
		if (m == 0 && n==0){
			return 0;
		}
		if(m == 0 || n == 0){
			return 1;
		}
		count[m][n]= noOfPath(m-1,n) + noOfPath(m,n-1);
		
		//if diagonal movement allowed, need to add + noOfPath(m-1,n-1) in above line
		//To print the matrix 
		/*for (int i=0; i<count.length; i++){
			for (int j=0; j<count[0].length; j++){
				System.out.print(count[i][j] + " ");
			}
			System.out.print("\n");
		}*/
		return count[m][n];
	}
	
	//Below is the Iterative solution 
	public static int noOfPath_1(int m, int  n){
		int arr[][] = new int[m+1][n+1];
		//setting the firs column value
		for (int i=1; i<=m ;i++){
			arr[i][0] = 1;
		}
		
		//setting the first row value
		for(int j=1; j<=n; j++){
			arr[0][j] = 1;
		}
		
		for(int i=1; i<=m; i++){
			for (int j=1; j<=n; j++){
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		return arr[m][n];
	}
	
	public static void main(String[] args){
		
		int[][] mat = {{0,0,0},{0,0,0},{0,0,0}};
		int row = mat.length;
		int col = mat[0].length;
		System.out.println("ROW:" + row + " Col:" + col);
		System.out.println(noOfPath(row, col));
		System.out.println("-------------------------");
		System.out.println(noOfPath_1(row, col));
		
		
	}

}
