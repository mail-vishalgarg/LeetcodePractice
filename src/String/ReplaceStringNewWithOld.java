package String;
/*
 * Here need to replace a new string with the old string in the input string
 */

public class ReplaceStringNewWithOld {
	
	public static String replaceString(String inputStr, String newStr, String oldStr){
		int length = inputStr.length();
		int oldStrIndex = inputStr.indexOf(oldStr);
		int lengthOfOldStr = oldStr.length();
		System.out.println("OLD STR:" + oldStrIndex);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		String replacedString = "";
		
		//get the string from beginning to the old string
		for (int i =0; i<oldStrIndex; i++){
			sb.append(inputStr.charAt(i));
		}
		//append string with new string in stringBuilder
		replacedString = replacedString + sb.toString() + newStr;
				
		//get the string after old string in the input string and store it in string builder.
		for (int i = oldStrIndex + lengthOfOldStr; i<length -1;i++){
			sb2.append(inputStr.charAt(i));
		}
		
		replacedString = replacedString + sb2.toString();
		return replacedString;
		
	}
	
	public static void main(String[] args){
		String input = "this is the best day i have";
		String newStr = "good";
		String oldStr = "best";
		System.out.println(replaceString(input, newStr, oldStr));
		
	}

}
