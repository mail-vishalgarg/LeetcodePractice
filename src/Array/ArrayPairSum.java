package Array;

public class ArrayPairSum {

	public static int arrayPairSum_1(int[] nums){
		int[] hash = new int[10];
		for (int ele: nums){
			hash[ele]++;
		}
		
		int sum = 0;
		int p = 0;
		for (int i=0 ; i<10;i++){
			if (hash[i] == 0){
				continue;
			}
			while(hash[i] != 0){
				if (p % 2 == 0){
					sum = sum + i;
				}
				p++;
				hash[i]--;
			}
		}
		return sum;
			
	}
	
	public static void main(String[] args) {
		int[] nums = {1,4,3,2};
		int result = arrayPairSum_1(nums);
		System.out.println("RESULT:" + result);
	}
	
}
