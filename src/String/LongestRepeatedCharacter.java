package String;

public class LongestRepeatedCharacter {

	public static int longestRepeatedChar(String s){
		if (s.isEmpty())
			return 0;
		int longest = 0;
		int length = 1;
		
		int repeatCharIndex = 0;
		for (int i = 0; i<s.length() -1; i++){
			if (s.charAt(i) == s.charAt(i+1)){
				length++;
				if (length > longest){
					longest = length; //to get the longest repeated length
					repeatCharIndex = i; //To get the repeated character
				}
				
			}else {
				length = 1;
			}
		}
		
		if (length > longest)
			longest = length;
		System.out.println(s.charAt(repeatCharIndex));
		return longest;
	}
	public static void main(String[] args) {
		System.out.println(longestRepeatedChar("abcccaaaabbd"));
	}
}
