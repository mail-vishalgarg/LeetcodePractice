package Number;

public class ValidNumber {

	public boolean isNumber(String s){
		int i=0, n = s.length();
		
		while (i<n && Character.isWhitespace(s.charAt(i))) i++; //check if string has white space at leading position
		if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
		boolean isNumeric = false;
		
		while(i<n && Character.isDigit(s.charAt(i))){
			i++;
			isNumeric = true;
		}
		
		if (i < n && s.charAt(i) == '.'){
			i++;
			while(i < n && Character.isDigit(s.charAt(i))){
				i++;
				isNumeric = true;
			}
		}
		while(i<n && Character.isWhitespace(s.charAt(i))) i++;
		return isNumeric = true && i == n;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "123.1";
		ValidNumber vNum = new ValidNumber();
		boolean isNumeric = vNum.isNumber(s);
		System.out.println("isNumeric = " + isNumeric);
		
	}
}
