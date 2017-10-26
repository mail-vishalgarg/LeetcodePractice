package String;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;



/** ---------------------------------------------
 * Given a string, find the first non-repeating character in it and 
 * return it's index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * 
 * Note: You may assume the string contain only lowercase letters.
 --------------------------------------------- */

public class FirstUniqueCharacterInAString {
	/* ---------------------------------------------
     * Simple O(n) solution
     * --------------------------------------------- */
	public static int firstUniqChar(String s) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			// It will put the value of occurance of lettes in
			// the string to freq[] array and increment by 1 if already present
			// in freq[]
			freq[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}
    
    
    @Test
    public void test() {
    	Assert.assertTrue(firstUniqChar("leetcode") == 0, "Test1 is not passed");
    	Assert.assertTrue(firstUniqChar("loveleetcode") == 2, "Test 2 is not passed");
    }
    
    @Test
    public void test2() {
    	Assert.assertTrue(firstUniqChar("loveleetcode") == 2, "Test 2 is not passed");
    }
}
