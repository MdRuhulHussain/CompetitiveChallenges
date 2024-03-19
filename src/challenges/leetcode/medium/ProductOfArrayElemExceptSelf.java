package challenges.leetcode.medium;

/*
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * Example 1: Input: nums = [1,2,3,4]; Output: [24,12,8,6]
 * Example 2: Input: nums = [-1,1,0,-3,3]; Output: [0,0,9,0,0]
 */
public class ProductOfArrayElemExceptSelf {
	
	public static void main(String args[]) {
		int[] nums = {1,2,3,4};
		int[] prod = productExceptSelf(nums);
		for(int ele : prod)
			System.out.print(ele+" ");
	}
	
	public static int[] productExceptSelf(int[] nums) {
        int[] leftProd = new int[nums.length];
        int[] rightProd = new int[nums.length];
        leftProd[0] = 1;
        rightProd[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++)
            leftProd[i] = leftProd[i-1]*nums[i-1];
        for(int i=nums.length-2;i>=0;i--)
            rightProd[i] = rightProd[i+1]*nums[i+1];
        for(int i=0;i<nums.length;i++)
            nums[i] = leftProd[i]*rightProd[i];
        return nums;
    }

}
