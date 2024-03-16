package challenges.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 * Example 1: Input: nums = [0,1]; Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
 * Example 2: Input: nums = [0,1,0]; Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 */
public class ContigousArray {
	
	public static void main(String args[]) {
		int[] nums = {0,1,1,0,1,1,1,0};
		System.out.println(findMaxLength(nums));
	}
	
	public static int findMaxLength(int[] nums) {
        if(nums[0]==0)
            nums[0]=-1;
        else
            nums[0]=1;
        int maxLength = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=nums[i-1]-1;
            else
                nums[i]=nums[i-1]+1;
            if(nums[i]==0)
                maxLength=i+1;
        }
        Map<Integer, Integer> sumIndex = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(sumIndex.containsKey(nums[i])){
                if(i-sumIndex.get(nums[i])>maxLength)
                    maxLength = i-sumIndex.get(nums[i]);
            }
            else
                sumIndex.put(nums[i], i);
        }
        return maxLength;
    }

}
