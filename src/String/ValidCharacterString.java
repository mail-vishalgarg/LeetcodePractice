package String;

public class ValidCharacterString {
	public static boolean isValidString(String s){
		int len = s.length();
		for(int i = 0; i < len; i++){
			if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
				System.out.println("getClass: " + s.getClass() + " Other:" + String.class);
				//output - getClass: class java.lang.String 
				//            Other: class java.lang.String
				if (s.getClass() == String.class){
					System.out.println("this is a string");
				}
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isValidString("1234"));
	}
}
