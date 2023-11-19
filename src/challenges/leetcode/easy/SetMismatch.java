package challenges.leetcode.easy;

/*
 * You have a set of integers s, which originally contains all the numbers from 1 to n. 
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another 
 * number in the set, which results in repetition of one number and loss of another number.
 */
public class SetMismatch {
	
	public static void main(String args[]) {
		int[] nums = {1,2,2,4};
		int[] output = findErrorNums(nums);
		for(int num : output)
			System.out.print(num+" ");
	}
	
	public static int[] findErrorNums(int[] nums) {
		int[] arr = new int[nums.length+1];
        int[] output = new int[2];
        int sum = 0;
        for(int num : nums){
            if(arr[num] == num){
                output[0] = num;
            }
            sum+=num;
            arr[num] = num;
        }
        output[1] = ((nums.length*(nums.length+1)/2)-(sum-output[0]));
        return output;
	}

}
