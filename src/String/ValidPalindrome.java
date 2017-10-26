package String;
/*
 * Given a string, determine if it is a palindrome, considering only 
 * alphanumeric characters and ignoring cases.
 * 
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 
 * Note:
 * Have you consider that the string might be empty? 
 * This is a good question to ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
	public static boolean isValidPalindrom(String s) {
		int fw = 0;
		int len = s.length();
		int bw = len - 1;

		if (s == null)
			return false;

		if (len < 2)
			return true;

		while (fw <= bw) {
			while (fw < len && !isValidCharacter(s.charAt(fw))) {
				fw++;
			}
			while (bw > 0 && !isValidCharacter(s.charAt(bw))) {
				bw--;
			}

			if (fw < len && bw > 0)
				if (Character.toLowerCase(s.charAt(fw)) != Character.toLowerCase(s.charAt(bw)))
					return false;

			fw++;
			bw--;
		}
		return true;

	}
		
	public static boolean isValidCharacter(Character c){
		return Character.isAlphabetic(c) || Character.isDigit(c);
	}
	
	public static void main(String[] args) {
		System.out.println(isValidPalindrom("A man, a plan, a canal: Panama"));
		System.out.println(isValidPalindrom("race a car"));
	}
	
}
