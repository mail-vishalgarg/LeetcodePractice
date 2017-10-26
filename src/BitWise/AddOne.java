package BitWise;

/*Write a program to add one to a given number. You are not allowed to use operators like ‘+’, ‘-‘, ‘*’, ‘/’, ‘++’, ‘–‘ …etc.

Examples:
Input: 12
Output: 13

Input: 6
Output: 7*/
public class AddOne {
	/*We know that the negative number is represented in 2’s complement form on most of the architectures. We have the following lemma hold for 2’s complement representation of signed numbers.
	Say, x is numerical value of a number, then
	~x = -(x+1) [ ~ is for bitwise complement ]
	(x + 1) is due to addition of 1 in 2’s complement conversion
	To get (x + 1) apply negation once again. So, the final expression becomes (-(~x)).
*/
	public static int addOne(int x)
	{
	   return (-(~x));
	}
	 
	/* Driver program to test above functions*/
	public static void main(String[] args) {
	  System.out.println(addOne(13));
	  }

	
}
