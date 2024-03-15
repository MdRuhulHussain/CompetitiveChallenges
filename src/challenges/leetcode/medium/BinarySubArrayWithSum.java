package challenges.leetcode.medium;

/*
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
 * A subarray is a contiguous part of the array.
 * Example 1: Input: nums = [1,0,1,0,1], goal = 2; Output: 4
 * Explanation: The 4 subarrays are shown below :
 * [1,0,1], [1,0,1,0], [0,1,0,1], [1,0,1]
 * Example 2: Input: nums = [0,0,0,0,0], goal = 0; Output: 15
 */
public class BinarySubArrayWithSum {

	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1};
		int goal = 2;
		System.out.println(numSubarraysWithSum(nums, goal));
	}
	
	public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==goal)
                    count++;
                else if(sum>goal)
                    break;
            }
        }
        return count;
    }

}
