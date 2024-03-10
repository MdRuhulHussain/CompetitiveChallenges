package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * You are given an array nums consisting of positive integers.Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
 * The frequency of an element is the number of occurrences of that element in the array.
 * Example 1: Input: nums = [1,2,2,3,1,4]; Output: 4
 * Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
 * So the number of elements in the array with maximum frequency is 4.
 * Example 2: Input: nums = [1,2,3,4,5]; Output: 5
 * Explanation: All elements of the array have a frequency of 1 which is the maximum.
 * So the number of elements in the array with maximum frequency is 5.
 */
public class CountElementWMaxFrequency {
	
	public static void main(String args[]) {
		int[] nums = {1,2,2,3,1,4};
		System.out.println(maxFrequencyElements(nums));
	}
	
	public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 1, max = 0;
        for(int num : nums){
            if(freq.containsKey(num))
                freq.put(num, freq.get(num)+1);
            else
                freq.put(num, 1);

            if(freq.get(num)>max){
                max = freq.get(num);
                count=1;
            }
            else if(freq.get(num)==max)
                count++;
        }
        return count*max;
    }

}
