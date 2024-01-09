package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArraysII {
	
	public static void main(String args[]) {
		int[] nums1 = {4,9,5,9};
		int[] nums2 = {9,4,9,8,4};
		
		int[] intersectionArr = intersect(nums1, nums2);
		for(int num : intersectionArr)
			System.out.print(num+" ");
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    li.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        int[] intersection = new int[li.size()];
        int i = 0;
        for(int n : li)
            intersection[i++] = n;
        return intersection;
    }

}
