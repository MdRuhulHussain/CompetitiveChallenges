package challenges.leetcode.easy;

/*
 * Given a sorted array of distinct integers and a target value, return the index if the 
 * target is found. If not, return the index where it would be if it were inserted in order.
 * e.g. Input : nums = {1,3,5,6}, target = 2; Output = 1 (since 2 is not available, it needs to
 * be inserted after 1, i.e at index 1
 * Input : nums = {1,3,5,6}, target = 3, Output = 1 (3 is present at index 1}
 */
public class SearchOrInsert {
	
	public static void main(String args[]) {
		int[] nums = {1,3,5,6};
		int search = 2;
		System.out.println(searchInsert(nums, search));
	}
	
	public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int mid = 0;
        if(target<nums[start])
            return 0;
        else if(target>nums[end])
            return nums.length;
        while(start<end){
            mid = start + (end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start = mid+1;
            else
                end = mid;
        }
        if(nums[mid]<target)
            return mid+1;
        // else if(nums[mid]>target)
        //     return mid-1;
        return mid;
    }

}
