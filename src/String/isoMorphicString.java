package String;

/*Two strings str1 and str2 are called isomorphic if there is a one to one mapping possible for every 
character of str1 to every character of str2. 
And all occurrences of every character in ‘str1’ map to same character in ‘str2’

Examples:

Input:  str1 = "aab", str2 = "xxy"
Output: True
'a' is mapped to 'x' and 'b' is mapped to 'y'.

Input:  str1 = "aab", str2 = "xyz"
Output: False
One occurrence of 'a' in str1 has 'x' in str2 and 
other occurrence of 'a' has 'y'.*/

import java.util.HashMap;
import java.util.Map;

public class isoMorphicString {

	/*Here the logic is :create two Hashmap, one for string1 and second for String2.
	 *Map each element from String 1 to String2 in one hash and map each element from string2 to string1.
	 *now compare the value of elements.
	 */
	public static boolean isValidIsomorphic(String s, String t){
		if (s.length() != t.length()){
			return false;
		}
		Map<Character, Character> maps = new HashMap<Character, Character>();
		Map<Character, Character> mapt = new HashMap<Character, Character>();
		Character a = null, b=null;
		for(int i = 0; i<s.length(); i++){
			a = maps.get(s.charAt(i));
			b = mapt.get(t.charAt(i));
			
			if ((a == null) && (b == null)){
				maps.put(s.charAt(i), t.charAt(i));
				mapt.put(t.charAt(i), s.charAt(i));
			}else if((a != (Character)t.charAt(i)) &&(b !=(Character)s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isValidIsomorphic("xyy", "egg"));
		System.out.println(isValidIsomorphic("xyy", "eg"));
		System.out.println(isValidIsomorphic("aab", "egg"));
	}
}
