package String;

/* Given a string, find the length of the longest substring without 
 * repeating characters. 
 * 
 * For example, the longest substring without repeating letters 
 * for "abcabcbb" is "abc", which the length is 3. 
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class LongestSubstrWithoutRepeatChars {

	public static int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int maxLen = 0;
		int currStrStartIndex = 0;
		for (int i = 0; i < s.length(); ++i) {
			// if duplicate char found
			if (map.containsKey(s.charAt(i))) {
				// keep the highest of 
				//  -  duplicate chars index
				//  -  currStrStartIndex which may be higher because of other char
				currStrStartIndex = Math.max(currStrStartIndex, map.get(s.charAt(i)) + 1);
			}
			
			map.put(s.charAt(i), i);
			
			// at each loop maxLength is the max of 
			//  -  curr maxLength
			//  -  currIndex minus currStrStartIndex and one
			
			maxLen = Math.max(maxLen, i +1 - currStrStartIndex);
			System.out.println("Max Len: " + maxLen);
		}
		return maxLen;
	}

	public static void lengthOfLongestSubstring_2(String s){
		char[] charArray = s.toCharArray();
		
		//Intialization
		String longestSubstring = null;
		int longestSubstringLength = 0;
		//Creating LinkedHashMap with Characters as keys 
		//and position as values
		LinkedHashMap<Character,Integer> charPosMap = new LinkedHashMap<Character,Integer>();
		for(int i=0; i< charArray.length;i++){
			char ch = charArray[i];
			if (!charPosMap.containsKey(ch)){
				charPosMap.put(ch, i);
			} else{
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			if (charPosMap.size() > longestSubstringLength){
				longestSubstringLength = charPosMap.size();
				longestSubstring = charPosMap.keySet().toString();
			}
		}
		System.out.println("Input String:" + s);
		System.out.println("Longest Substring:" + longestSubstring);
		System.out.println("Longest Substring lenght: "+ longestSubstringLength);
	}
	// Below method seems best for this solution.
	public static int lengthofLongestSubstring_3(String s){
		int maxLength = 0;
		int i =0, j = 0;
		HashSet<Character> set = new HashSet<>();
		
		while (j < s.length()){
			if (!set.contains(s.charAt(j))){
				set.add(s.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j-i);
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		lengthOfLongestSubstring_2("vishalishal");
		
		System.out.println("-----------------------");
		System.out.println(lengthOfLongestSubstring("dvdf"));
		System.out.println(lengthOfLongestSubstring("vishal"));
		System.out.println(lengthOfLongestSubstring("aab"));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("c"));
		System.out.println(lengthOfLongestSubstring("bbbbbbbbb"));
		System.out.println(lengthOfLongestSubstring(""));
		System.out.println(lengthOfLongestSubstring(null));
		
		System.out.println("------------------------------------");
		System.out.println("Third Method output:");
		System.out.println("------------------------------------");
		System.out.println(lengthofLongestSubstring_3("abcabcdd"));
		System.out.println(lengthofLongestSubstring_3("bbbb"));
	}
}