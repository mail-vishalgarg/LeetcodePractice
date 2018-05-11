package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReverseVowelsOfString2 {

	public static String reverseVowels(String s){
		HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		
		//Store the location of vowels in the string
		List<Integer> vowLoc = new ArrayList<Integer>();
		
		//Convert a String to array
		char[] sa = s.toCharArray();
		int len = sa.length;
		
		for (int i=0; i<len;i++){
			if (vowels.contains(sa[i])){
				vowLoc.add(i);	
			}
		}
		
		//Swap the vowels at this locations
		int vowListSize = vowLoc.size();
		for (int j=0;j<vowListSize/2;j++){
			char temp = sa[vowLoc.get(j)];
			sa[vowLoc.get(j)] = sa[vowLoc.get(vowListSize - 1 - j)];
			sa[vowLoc.get(vowListSize - 1 - j)] = temp;
		}
		return String.valueOf(sa);
	}
	
	public static String reverseVowels2(String s){
		//Create a HashSet of vowels
		HashSet<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
		
		//Convert String to Array
		char[] sa = s.toCharArray();
		int start = 0;
		int end = sa.length - 1;
		
		while(start < end){
			while(start < end && !vowels.contains(sa[start])){
				start++;
			}
			while(start < end && !vowels.contains(sa[end])){
				end--;
			}
			
			char temp = sa[start];
			sa[start] = sa[end];
			sa[end] = temp;
			start++;
			end--;
		}
		return String.valueOf(sa);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseVowels("bebo"));
		System.out.println(reverseVowels2("bobi"));
	}
}
