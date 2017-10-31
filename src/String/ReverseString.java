package String;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {
	public static String reverseString_1(String s) {
		int len = s.length();
		if (s == null || len <1)
			return s;
		
		String leftStr = s.substring(0, len / 2);
		String rightStr = s.substring(len / 2,len);
		return reverseString_1(rightStr) + reverseString_1(leftStr);
		
	}
	
	public static String reverseString_iterative(String s) {
		char[] ca = s.toCharArray();
		int len = s.length();
		for (int i=0; i < (len/2) ; i++) {
			char temp = ca[i];
			ca[i] = ca[len - 1 - i];
			ca[len - 1 - i] = temp;
		}
		return String.valueOf(ca);
	}
	
	public static String reverseString_iterative2(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i=s.length() -1; i>=0; i--){
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	@Test
	public void test() {
		//Assert.assertTrue(reverseString_1("vishal").compareTo("lahsiv") == 0);
		Assert.assertTrue(reverseString_iterative("vishal").compareTo("lahsiv") == 0);
		Assert.assertTrue(reverseString_iterative2("vvishal").compareTo("lahsivv") == 0);
		
	}
	

}
