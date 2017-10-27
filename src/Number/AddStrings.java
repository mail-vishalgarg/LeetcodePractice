package Number;

import org.testng.Assert;

/** ---------------------------------------------
 * Given two non-negative integers num1 and num2 represented as string, 
 * return the sum of num1 and num2.
 * 
 * Note:
 * 
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library or convert 
 * ...the inputs to integer directly.
 * --------------------------------------------- */
public class AddStrings {

	public static String addStrings(String num1, String num2){
		System.out.println("NUMBERS:" + num1 + " " + num2);
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = num1.length() - 1, j = num2.length() - 1; i >=0 || j>=0 || carry == 1; i--, j-- ){
			int x = i <0 ? 0 : num1.charAt(i) - '0';
			int y = j <0 ? 0 : num2.charAt(j) - '0';
			sb.append((x + y + carry)%10);
			//System.out.println("StringBuilder: " + sb);
			carry = (x + y + carry)/10;
			//System.out.println("CARRY:" + carry);
		}
		return sb.reverse().toString();
		
	}
	
	public static void main(String[] args) {
        System.out.println(addStrings("99", "13"));
    }
}
