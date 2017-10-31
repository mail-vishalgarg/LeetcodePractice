package Number;

public class RomanToInteger {

	public static int value(char c){
		if (c == 'I')
			return 1;
		if (c == 'V')
			return 5;
		if(c == 'X')
			return 10;
		if(c == 'L')
			return 50;
		if(c == 'D')
			return 100;
		if (c == 'M')
			return 1000;
		return -1;
	}
	
	public static int romanToInt(String s){
		int res = 0;
		for (int i=0; i<s.length(); i++){
			if ((i+1)<s.length()){
				if (value(s.charAt(i)) < value(s.charAt(i+1))){
					res = res + value(s.charAt(i+1)) - value(s.charAt(i));
					i++;
				}else {
					res = res + value(s.charAt(i));
				}
			} else {
				res = res + value(s.charAt(i));
				i++;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(romanToInt("VVV"));
	}
}
