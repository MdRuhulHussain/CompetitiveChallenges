package challenges.leetcode.easy;

import java.util.Arrays;

/*
 * Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
 * Return the positive integer k. If there is no such integer, return -1.
 * Example 1: Input: nums = [-1,2,-3,3], Output: 3
 * Explanation: 3 is the only valid k we can find in the array.
 * Example 2: Input: nums = [-1,10,6,7,-7,1], Output: 7
 * Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
 * Example 3: Input: nums = [-10,8,6,7,-2,-3], Output: -1
 * Explanation: There is no a single valid k, we return -1.
 */

public class LargestPositiveWNegative {
	
	public static void main(String args[]) {
		int[] nums = {-1,10,6,7,-7,1};
		System.out.println(findMaxK(nums));
	}
	
	public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==0)
                return nums[j];
            else if(nums[i]>0)
                return -1;
            else if(nums[i]+nums[j]>0)
                j--;
            else
                i++;
        }
        return -1;
    }

}
