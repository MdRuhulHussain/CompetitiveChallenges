package challenges.leetcode.easy;

import java.util.Arrays;

/*
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from 
 * three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
 * Example : Input: nums = [2,1,2]; Output: 5
 * Explanation: You can form a triangle with three side lengths: 1, 2, and 2.
 */
public class LargestPerimeterTriangle {
	
	public static void main(String args[]) {
		int[] nums = {1,4,4,2,1,10};
		System.out.println(largestPerimeter(nums));
		
		int[] nums2 = {1,4,4,2,1,10};
		System.out.println(largestPerimeterOptimized(nums2));
	}
	
	public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length-1, temp = 0;
        for(int i=0;i<nums.length/2;i++){
            temp = nums[i];
            nums[i] = nums[x];
            nums[x] = temp;
            x--;
        }
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]<(nums[j]+nums[k]))
                        return (nums[i]+nums[j]+nums[k]);
                }
            }
        }
        return 0;
    }
	
	public static int largestPerimeterOptimized(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length-1, temp = 0;
        for(int i=0;i<nums.length/2;i++){
            temp = nums[i];
            nums[i] = nums[x];
            nums[x] = temp;
            x--;
        }
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]<nums[j]+nums[j+1])
                    return (nums[i]+nums[j]+nums[j+1]);
            }
        }
        return 0;
    }

}
