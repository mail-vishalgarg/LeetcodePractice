package String;

public class NumberOfSegmentsInAString {
	public static int countSegments(String s){
		int res = 0;
		for (int i=0; i < s.length(); i++){
			System.out.println("CCCCC:"+ s.charAt(i) +":");
			if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i -1) == ' ')){
				res++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		String test = "Hello how are you there";
		System.out.println("count:" + countSegments(test));
	} 
}
