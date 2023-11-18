package challenges.leetcode.medium;

/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the 
 * range [1, n] inclusive. There is only one repeated number in nums, return this repeated
 *  number.
 *  The input {2,2,2,2} should return output as 2
 */

public class FindDuplicate {
	
	public static void main(String args[]) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
	public static int findDuplicate(int[] nums) {
		int[] arr = new int[nums.length];
        for(int num : nums){
            if(arr[num]==num)
                return num;
            arr[num] = num;
        }
        return 0;
	}

}
