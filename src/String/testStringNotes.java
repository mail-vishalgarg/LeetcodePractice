package String;

import java.util.HashSet;

public class testStringNotes {

	public static void main(String[] args) {
		String s = "abccccdd";
		
		HashSet<Character> hs = new HashSet<Character>();
		int count = 0;
		for(int i=0; i<s.length(); i++){
			if (hs.contains(s.charAt(i))){
				hs.remove(s.charAt(i));
				count++;
			} else {
				hs.add(s.charAt(i));
			}
		}
		if (!hs.isEmpty()){
			System.out.println(count * 2 + 1);
		} else{
			System.out.println(count * 2);
		}
		
		System.out.println(hs);
		
		
		/*String s = "xyz";
		String t = "abc";
		
		Map<Character, Character> maps = new HashMap<Character, Character>();
		Map<Character, Character> mapt = new HashMap<Character, Character>();
		
		for (int i =0; i <s.length(); i++){
			maps.put(s.charAt(i), t.charAt(i));
		}
		
		for(int j=0; j<t.length(); j++){
			mapt.put(t.charAt(j),s.charAt(j));
		}
		
		for(Character x: maps.keySet()){
			System.out.println("key:" +x + " Value:" + maps.get(x));
		}
		
		for(Character x: mapt.keySet()){
			System.out.println("key:" +x + " Value:" + mapt.get(x));
		}
		
		for (int i =0; i<s.length();i++){
			System.out.println("SSSS:" + maps.get(s.charAt(i)));
			System.out.println("TTTT:" + mapt.get(t.charAt(i)));
		}*/
			
		//=========================================================================
		/*String s = "abcde";
		String t = "abcd";
		int freq[] = new int[26];
		
		for (int i=0; i< s.length(); i++){
			//freq[(int)(s.charAt(i) - 'a')] = freq[(int)(s.charAt(i) - 'a')] + 1;
			freq[(int)(s.charAt(i) - 'a')]++;
		}
		
		for (int j=0; j<t.length();j++){
			freq[(int)(t.charAt(j) - 'a')]--;
		}
		
		for (int i=0; i <s.length(); i++){
			if (freq[i] != 0){
				System.out.println((char)(i + 'a'));
			}
		}*/
		
		/*for (int i=0; i<s.length(); i++){
			System.out.println(s.charAt(i));
			System.out.println(s.indexOf(s.charAt(i)));
		}
		System.out.println("---------------------------------");
		System.out.println("value of a:" + (int)'a');
		for (int j=0; j<s.length(); j++){
			System.out.println((int)s.charAt(j) - 'a');
		}
		System.out.println("---------------------------------");
		//To convert a string to array use toCharArray()
		char[] array_s = s.toCharArray();
		for (char c: array_s){
			System.out.println(c);
		}*/
	} 
}
