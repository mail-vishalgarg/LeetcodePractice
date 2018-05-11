package Array;

public class RotateArrayRowToCol {

	 public static void transpose() {

	        final int[][] original = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
	        //Original.length will give length of the two dimensional array or you can say no. of rows.
	        //original[0].length will give length of a row. or you can say no. of columns.
	        System.out.println("Original length:" + original.length  +" "  +original[0].length);
	        for (int i = 0; i < original.length; i++) {
	            for (int j = 0; j < original[i].length; j++) {
	                System.out.print(original[i][j] + " ");
	            }
	            System.out.print("\n");
	        }
	        System.out.print("\n\n matrix transpose:\n");
	        // transpose
	        if (original.length > 0) {
	            for (int i = 0; i < original[0].length; i++) {
	                for (int j = 0; j < original.length; j++) {
	                    System.out.print(original[j][i] + " ");
	                }
	                System.out.print("\n");
	            }
	        }
	    }
	 
	 //Below one is not working right now.
	 public static void transpose_2() {
		final int[][] original = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println("Original length:" + original.length + " " + original[0].length);
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n matrix transpose:\n");
		// transpose
		for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
            	int temp = original[i][j];
            	//System.out.println("temp: " + temp);
            	original[i][j] = original[j][i];
            	//System.out.println(original[i][j] + " = " + original[j][i]);
            	original[j][i] = temp;
				System.out.print(original[j][i] + " ");
			}
			System.out.print("\n");
		}
	}
	 
	 public static void main(String[] args) {
		transpose();
		System.out.println("______________________________");
		transpose_2();
	}
	 
}
