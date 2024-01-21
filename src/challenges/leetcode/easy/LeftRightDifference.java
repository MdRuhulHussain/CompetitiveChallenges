package challenges.leetcode.easy;

/*
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|. Where:
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such 
 * element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such 
 * element, rightSum[i] = 0.
 * Return the array answer.
 * Example : Input: nums = [10,4,8,3]; Output: [15,1,11,22]
 * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
 * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */
public class LeftRightDifference {
	
	public static void main(String args[]) {
		int[] nums = {10,4,8,3};
		int[] answer = leftRightDifference(nums);
		for(int num : answer)
			System.out.print(num+" ");
	}
	
	public static int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        int leftSum = 0, rightSum = 0;
        int[] answer = new int[nums.length];
        for(int num : nums)
            totalSum += num;
        int i=0;
        for(int num : nums){
            answer[i] = Math.abs(leftSum - (totalSum-num-leftSum));
            leftSum += num;
            i++;
        }
        return answer;
    }

}
