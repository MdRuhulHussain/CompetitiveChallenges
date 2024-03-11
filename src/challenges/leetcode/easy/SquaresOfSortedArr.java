package challenges.leetcode.easy;

/*
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * Example 1: Input: nums = [-4,-1,0,3,10]; Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
 * Example 2: Input: nums = [-7,-3,2,3,11]; Output: [4,9,9,49,121]
 */
public class SquaresOfSortedArr {
	
	public static void main(String args[]) {
		int[] nums = { -7,-3,2,3,11};
		sortedSquares(nums);
		for(int num : nums)
			System.out.print(num+" ");
	}
	
	public static int[] sortedSquares(int[] nums) {
        nums[0] = nums[0]*nums[0];
        int j = 0, temp = 0;
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
            j = i;
            while(j-1>=0 && nums[j]<nums[j-1]){
                temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
        return nums;
    }

}
