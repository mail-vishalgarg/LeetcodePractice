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
		return reverseString_1(leftStr) + reverseString_1(rightStr);
		
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
	
	@Test
	public void test() {
		//Assert.assertTrue(reverseString_1("vishal").compareTo("lahsiv") == 0);
		Assert.assertTrue(reverseString_iterative("vishal").compareTo("lahsiv") == 0);
	}
	

}
