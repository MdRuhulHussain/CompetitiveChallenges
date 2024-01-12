package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/minimum-common-value/description/
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer 
 * common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
 * Example : Input: nums1 = [1,2,3], nums2 = [2,4]
 * Output: 2
 * Explanation: The smallest element common to both arrays is 2, so we return 2.
 */
public class MinCommonValue {
	
	public static void main(String args[]) {
		int[] nums1 = {1,2,3,6};
		int[] nums2 = {2,3,4,5};
		System.out.println(getCommon(nums1, nums2));
	}
	
	public static int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j])
                return nums1[i];
            else if(nums1[i]<nums2[j])
                i++;
            else
                j++;
        }
        return -1;
    }

}
