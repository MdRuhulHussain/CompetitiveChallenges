package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the 
 * list of integers that are present in each array of nums sorted in ascending order.
 * Example : Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
 * Output: [3,4]
 * Explaination : The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and 
 * nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
 */
public class IntersectionOfMultipleArrays {
	
	public static void main(String args[]) {
		int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
		List<Integer> res = intersection(nums);
		for(int n : res)
			System.out.print(n+" ");
	}
	
	public static List<Integer> intersection(int[][] nums) {
        List<Integer> intersectionArr = new ArrayList<>();
        if(nums.length==1){
            for(int n : nums[0])
                intersectionArr.add(n);
            Collections.sort(intersectionArr);
            return intersectionArr;
        }
        for(int i=0;i<nums[0].length;i++){
            boolean found = false;
            for(int j=1;j<nums.length;j++){
                found = false;
                for(int k=0;k<nums[j].length;k++){
                    if(nums[0][i]==nums[j][k]){
                        found = true;
                        break;
                    }
                        
                }
                if(!found)
                    break;
            }
            if(found)
                intersectionArr.add(nums[0][i]);
        }
        Collections.sort(intersectionArr);
        return intersectionArr;
    }

}
