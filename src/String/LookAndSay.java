package String;

public class LookAndSay {

	public static String lookandsay(String number){
		StringBuilder result = new StringBuilder();
		
		char repeat = number.charAt(0);
		int times = 1;
		number = number.substring(1) + " ";
		
		for (char actual : number.toCharArray()){
			if (actual != repeat){
				result.append(times + "" + repeat);
				times = 1;
				actual = repeat;
			}else {
				times++;
			}
			
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String num = "1";
		for (int i = 0; i<10; i++){
			System.out.println(num);
			num = lookandsay(num); 
		}
	}
}
