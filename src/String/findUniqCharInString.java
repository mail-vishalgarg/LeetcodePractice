package String;

public class findUniqCharInString {

	public static int firstUniqchar(String s){
		System.out.println((int)'a');
		int[] freq = new int[26];
		for(int i=0; i< s.length()-1; i++){
			System.out.println("char value :" + (int)s.charAt(i));
			int charValueInInt = (int)s.charAt(i) -'a';
			System.out.println("Char value in integer :" + charValueInInt);
			freq[charValueInInt]++;
		}
		for(int y=0; y<s.length()-1;y++){
			if ((freq[s.charAt(y) - 'a']) == 1){
				return y;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//firstUniqchar("abcabcdbb");
		System.out.println(firstUniqchar("abcabcbbd"));
	}
}
