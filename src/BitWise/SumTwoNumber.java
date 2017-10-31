package BitWise;

/*Sum of two bits can be obtained by performing XOR (^) of the two bits. 
 * Carry bit can be obtained by performing AND (&) of two bits.
 * Above is simple Half Adder logic that can be used to add 2 single bits. 
 *
 *We can extend this logic for integers. If x and y don’t have set bits at same position(s),
 *then bitwise XOR (^) of x and y gives the sum of x and y. To incorporate common set bits also,
 *bitwise AND (&) is used. Bitwise AND of x and y gives all carry bits. We calculate (x & y) << 1 and
 *add it to x ^ y to get the required result.
 * 
 */
public class SumTwoNumber {
	public static int sum(int x, int y){
		while ( y != 0){
			System.out.println("X:" + Integer.toBinaryString(x));
			System.out.println("Y:" + Integer.toBinaryString(y));
			int carry = x & y;
			System.out.println("Carry:" + carry);
			x = x ^ y;
			System.out.println("XXX:"  + x);
			y = carry << 1;
			System.out.println("YYYY: " + y);
		}
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(2,3));
	}
}
