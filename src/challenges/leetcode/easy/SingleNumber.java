package challenges.leetcode.easy;

/*
 * The given array contains every number twice, except one number. which is once only. Find that number with linear runtime complexity and constant
 * space complexity
 * e.g Input = {2,2,3,1,1} output = 3
 */
public class SingleNumber {
	
	public static void main(String args[]) {
		
		int[] nums = {4,2,1,2,1};
		System.out.println(findSingleNumber(nums));
	}
	
	public static int findSingleNumber(int[] nums) {
		int zorVal = nums[0];
        for(int i=1;i<nums.length;i++){
            zorVal = zorVal^nums[i];
        }

        return zorVal;
	}

}
