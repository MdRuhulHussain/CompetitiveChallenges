package challenges.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * Example 1: Input: nums = [3,2,3]; Output: 3
 * Example 2: Input: nums = [2,2,1,1,1,2,2]; Output: 2
 */
public class MajorityElement {
	
	public static void main(String args[]) {
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
		
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
         int count=0, majority = 0;
         Map<Integer, Integer> freq = new HashMap<>();
         for(int num : nums){
             if(freq.containsKey(num))
                 freq.put(num, freq.get(num)+1);
             else
                 freq.put(num, 1);
             if(freq.get(num)>count){
                 count = freq.get(num);
                 majority = num;
             }
         }
         return majority;
	}
	
	public int majorityElementOptimized(int[] nums) {
        int count = 0, majority = 0;
        for(int num : nums){
            if(count==0)
                majority = num;
            if(majority == num)
                count++;
            else
                count--; 
        }
        return majority;
	}

}
