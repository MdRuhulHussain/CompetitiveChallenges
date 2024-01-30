package challenges.leetcode.easy;

/*
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * Return any array that satisfies this condition.
 * Example : Input : nums = {3,1,2,4} : Output = {4,2,1,3}
 * Explaination : Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */
public class SortArrayByParity {
	
	public static void main(String args[]) {
		int[] nums = {3,1,2,4};
		sortArrayByParity(nums);
		for(int n : nums)
			System.out.print(n+" ");
	}
	
	public static int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j){
            if(nums[i]%2==0)
                i++;
            else if(nums[j]%2!=0)
                j--;
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

}
