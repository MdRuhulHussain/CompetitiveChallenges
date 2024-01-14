package challenges.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/count-complete-subarrays-in-an-array/description/
 * You are given an array nums consisting of positive integers.
 * We call a subarray of an array complete if the following condition is satisfied:
 * -> The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
 * Return the number of complete subarrays.
 * Example : Input: nums = [1,3,1,2,2]
 * Output = 4
 * Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
 */
public class CountCompleteSubArrays {
	
	public static void main(String args[]) {
		int[] nums = {1,3,1,2,2};
		System.out.println(countCompleteSubarrays(nums));
	}
	
	public static int countCompleteSubarrays(int[] nums) {
        
        Set<Integer> distinctVal = new HashSet<>();
        for(int n : nums)
            distinctVal.add(n);
        int size = distinctVal.size();
        if(size == 1)
            return (nums.length*(nums.length+1))/2;
        if(size == nums.length)
            return 1;
        Set<Integer> temp = new HashSet<>();
        temp.addAll(distinctVal);
        int count = 0;
        for(int i=0;i<=nums.length-size;i++){
            for(int j=i;j<nums.length;j++){
                temp.remove(nums[j]);
                if(temp.size()==0){
                    count+= nums.length-j;
                    break;
                }
            }
            temp.addAll(distinctVal);
        }
        return count;
    }

}
