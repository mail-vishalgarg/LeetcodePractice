package Number;


/** divide two numbers without using multiplication, + and - operators
 * @author vishgarg
 *
 */
public class DivideTwoNumbers {
	public static int division(int dividend, int divisor){
		int sum= 0, count = -1;
		int reminder = 0;
		while(sum <= dividend){
			sum = sum + divisor;
			count++;
		}
		reminder = dividend - (count * divisor);
		System.out.println("reminder:" + reminder);
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(division(4,2));
	}
}
