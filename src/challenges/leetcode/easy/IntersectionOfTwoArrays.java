package challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/* https://leetcode.com/problems/intersection-of-two-arrays/description/
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the 
 * result must be unique and you may return the result in any order.
 * Example : Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 */
public class IntersectionOfTwoArrays {
	
	public static void main(String args[]) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		int[] intersectionArr = intersection(nums1, nums2);
		for(int num : intersectionArr)
			System.out.print(num+" ");
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(!mySet.contains(nums1[i])){
                        mySet.add(nums1[i]);
                        nums2[j] = -1;
                    }
                    break;
                }
            }
        }
        int[] intersection = new int[mySet.size()];
        int i = 0;
        for(int n : mySet)
            intersection[i++] = n;

        return intersection;
    }

}
