package challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * You are given an integer array nums with the following properties: nums.length == 2 * n. 
 * nums contains n + 1 unique elements. Exactly one element of nums is repeated n times.
 * Return the element that is repeated n times.
 * Example : Input: nums = [1,2,3,3]; Output: 3
 */
public class NRepeatedElementInSize2n {
	
	public static void main(String args[]) {
		int[] nums = {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(nums));
	}
	
	public static int repeatedNTimes(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        int repeated = 0;
        for(int num : nums){
            if(uniqueNums.contains(num)){
                repeated = num;
                break;
            }
            uniqueNums.add(num);
        }
        return repeated;
    }

}
