package challenges.leetcode.easy;

/*
 * You are given an integer array nums and an integer k.
 * In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x 
 * where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.
 * The score of nums is the difference between the maximum and minimum elements in nums.
 * Return the minimum score of nums after applying the mentioned operation at most once for each index in it.
 * Example : Input: nums = [1,3,6], k = 3; Output: 0
 * Explanation: Change nums to be [4, 4, 4]. The score is max(nums) - min(nums) = 4 - 4 = 0.
 */
public class SmallestRangeI {
	
	public static void main(String args[]) {
		int[] nums = {1,5,9,13};
		int k = 5;
		System.out.println(smallestRangeI(nums, k));
	}
	
	public static int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0];
        for(int num : nums){
            if(num>max)
                max = num;
            else if(num<min)
                min = num;
        }
        if(min+k>=max-k)
            return 0;
        return (max-min-k-k);
    }

}
