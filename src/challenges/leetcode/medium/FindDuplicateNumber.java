package challenges.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * There is only one repeated number in nums, return this repeated number.
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * Example 1: Input: nums = [1,3,4,2,2]; Output: 2
 * Example 2: Input: nums = [3,1,3,4,2]; Output: 3
 * Example 3: Input: nums = [3,3,3,3,3]; Output: 3
 */
public class FindDuplicateNumber {
	
	public static void main(String args[]) {
		int[] nums = {2,5,3,3,3,4,8};
		System.out.println(findDuplicate(nums));
		
		System.out.println(findDuplicateOptimized(nums));
	}
	
	public static int findDuplicate(int[] nums) {
        
         Set<Integer> unique = new HashSet<>();
         for(int num : nums){
             if(unique.contains(num))
                 return num;
             unique.add(num);
         }
         return 0;
    }
	
	public static int findDuplicateOptimized(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow!=fast);
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
	}
	

}
