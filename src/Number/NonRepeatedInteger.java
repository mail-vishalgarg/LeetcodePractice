package Number;

/**
 * Input ={1,1,2,2,3,4}
 * Output = {1,2,3,4}
 */

public class NonRepeatedInteger {
	//This solution works for sorted array only
	public static void nonRepeatedInt(int[] num){
		int lui = 0;
		for (int i=0; i<num.length -1; i++){
			if (num[i] != num[i+1]){
				num[lui + 1] = num[i+1];
				lui++;
			} 
		}
		for(int i=0; i<=lui; i++){
			System.out.println(num[i]);
		}
		
	}
	
	public static void nonRepeatedUniqInt(int[] num){
		int lui = 0;
		for (int i=1; i<num.length; i++){
			if (num[i] == num[i-1]){
				lui = i+1;
			} 
		}
		for(int i=lui; i<=num.length-1; i++){
			System.out.println(num[i]);
		}
		
	}
	
	public static void main(String[] args) {
		int[] num = {1,2,2,2,3,4};
		nonRepeatedInt(num);
		System.out.println("----------");
		nonRepeatedUniqInt(num);
	}
}
