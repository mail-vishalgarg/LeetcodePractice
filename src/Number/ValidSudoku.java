package Number;

public class ValidSudoku {
	public static boolean isValidSudoku(char[][] board){
		boolean[][] row = new boolean[9][9];
		boolean[][] col = new boolean[9][9];
		boolean[][] box = new boolean[9][9];
		
		for(int i =0; i<9; i++){
			for(int j =0; j <9; j++){
				if (board[i][j] == '.'){
					int num = board[i][j] - '1';
					int k = (i/3)*3+j/3;
					if (row[i][num] || col[j][num] || box[k][num]){
						return false;
					} else {
						row[i][num]=true; 
						col[j][num]=true;
						box[k][num] = true;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		char[] line0 = { '5', '3', '.', '.', '7', '.', '.', '.', '.' };
		char[] line1 = { '6', '.', '.', '1', '9', '5', '.', '.', '.' };
		char[] line2 = { '.', '9', '8', '.', '.', '.', '.', '6', '.' };
		char[] line3 = { '8', '.', '.', '.', '6', '.', '.', '.', '3' };
		char[] line4 = { '4', '.', '.', '8', '.', '3', '.', '.', '1' };
		char[] line5 = { '7', '.', '.', '.', '2', '.', '.', '.', '6' };
		char[] line6 = { '.', '6', '.', '.', '.', '.', '2', '8', '.' };
		char[] line7 = { '.', '.', '.', '4', '1', '9', '.', '.', '5' };
		char[] line8 = { '.', '.', '.', '.', '8', '.', '.', '7', '9' };
		
		char[][] board = { line0, line1, line2, line3, line4, line5, line6, line7, line8 };
		System.out.println(isValidSudoku(board));
		
	}

}
