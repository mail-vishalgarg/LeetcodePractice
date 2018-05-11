package String;

public class ValidParenthesesEquation {

	public static boolean isValidEquation(String s){
		int openParantheses = 0;
		for (int i=0; i<s.length(); i++){
			if (s.charAt(i) == '('){
				openParantheses++;
			}else if (s.charAt(i) == ')'){
				openParantheses--;
			}
			
			if (openParantheses < 0){
				return false;
			}
		}
		
		if (openParantheses == 0){
			return true;
		} else{
			return false;
		}		
	}
	
	public static void main(String[] args) {
		System.out.println(isValidEquation("3+(4*5)"));
	}
}
