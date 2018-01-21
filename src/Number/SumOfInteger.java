package Number;

public class SumOfInteger {

	public static void sumOfInt(int num1){
		int sum = 0;
		while (num1 > 0){
			sum = sum + (num1 % 10);
			num1 = num1/10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		sumOfInt(123);
	}
}
