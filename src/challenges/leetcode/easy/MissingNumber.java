package challenges.leetcode.easy;

/*
 * Given an array nums containing n distinct numbers in the range [0, n], return the only 
 * number in the range that is missing from the array.
 * e.g Input = [3,0,1], output = 2
 */
public class MissingNumber {
	
	public static void main(String args[]) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		int sum = nums.length*(nums.length+1)/2;
        for(int n : nums){
            sum-=n;
        }
        return sum;
	}

}
