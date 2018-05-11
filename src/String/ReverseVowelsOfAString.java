/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * 
 * Example 1:
 * Given s = "hello", return "holle".
 * 
 * Example 2:
 * Given s = "leetcode", return "leotcede"
 * 
 */

package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseVowelsOfAString {
	//iterative Solution
	public static String reverseVowels_1(String s) {
		if (s == null || s.length() == 0)
			return s;
		
		//covert and array to a HashSet by using Arrays.asList(<array Name>)
		HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		
		char[] sa = s.toCharArray();
		int len = sa.length;
		
		List<Integer> vowLoc = new ArrayList<Integer>();
		//capture all the vowels location first
		for (int i = 0; i < len; i++)
			if (vowels.contains(sa[i]))
				vowLoc.add(i);
		
		//swap characters on those vowels location
			
		int vowListSize = vowLoc.size();
		for (int i = 0; i < vowListSize /2 ; i++) {
			char temp  = sa[vowLoc.get(i)];
			sa[vowLoc.get(i)] = sa[vowLoc.get(vowListSize - 1 - i)];
			sa[vowLoc.get(vowListSize - 1 - i)] = temp;
		}
		
		return String.valueOf(sa);
			
		}
	
	public static String reverseVowels(String s) {
		return reverseVowels_1(s);
	}

	//Two pointer solution
	public static String reverseVowels_2(String s) {
		if (s == null || s.length() == 0)
			return s;

		HashSet<Character> vowels = new HashSet<Character>(
				Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

		char[] sa = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			while (start < end && !vowels.contains(sa[start]))
				start++;

			while (start < end && !vowels.contains(sa[end]))
				end--;

			char temp = sa[start];
			sa[start] = sa[end];
			sa[end] = temp;

			start++;
			end--;
		}
		System.out.println(String.valueOf(sa));
		return new String(sa);
	}
	
	@Test
	public void test() {
		Assert.assertTrue(reverseVowels_2("vishal").compareTo("vashil") == 0,"Test1");
		Assert.assertTrue(reverseVowels_2("hello").compareTo("holle") == 0,"Test2");
		Assert.assertTrue(reverseVowels_2("leetcode").compareTo("leotcede") == 0,"Test3");
		Assert.assertTrue(reverseVowels_2("aA").compareTo("Aa") == 0,"Test4");
	}
}


