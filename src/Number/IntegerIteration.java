package Number;

/*
 *Below is the way to get the numeric value from a string having integers 
 */
public class IntegerIteration {
	public static void main(String[] args) {
		String num = "1234";
		for (int i=0; i<num.length();i++){
			int s = Character.getNumericValue(num.charAt(i)); //using build in function
			int x = num.charAt(i) - '0'; // without build in function
			System.out.println("xxx:" + x);
			System.out.println(s);
		}
	}

}
