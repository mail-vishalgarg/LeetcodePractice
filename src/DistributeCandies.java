import java.util.HashSet;
import java.util.Set;

/*Given an integer array with even length, where different numbers in this array represent
different kinds of candies. Each number means one candy of the corresponding kind. 
You need to distribute these candies equally in number to brother and sister. 
 the maximum number of kinds of candies the sister could gain.*/

/*Input: candies = [1,1,2,2,3,3]
Output: 3
Explanation:
There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
The sister has three different kinds of candies. 
*/

// LOGIC:- Here we have to check kinds of candies first and then will do distribution in brother and sister.
public class DistributeCandies {
	public static int distributeCandies(int[] candies) {
		int total = candies.length;
		Set<Integer> kinds = new HashSet<Integer>();
		for (int i = 0; i < total; i++) {
			kinds.add(candies[i]);
		}
		if (kinds.size() > total / 2) {
			return total / 2;
		} else {
			return kinds.size();
		}
	}
	
	public static void main(String[] args) {
		int[] candies = new int[]{1,1,2,2,3,3};
		System.out.println(distributeCandies(candies));
	}

}
