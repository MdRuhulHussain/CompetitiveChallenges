package challenges.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * SingleNumber II from leetcode
 * Given an integer array nums where every element appears three times except for one, which
 *  appears exactly once. Find the single element and return it.
 * e.g Input = {2,2,3,2} => Output = 3;
 */
public class SingleNumberII {
	
	public static void main(String args[]) {
		int[] nums = {0,1,0,1,0,1,99};
		System.out.println(findSingleNumberII(nums));
	}
	
	public static int findSingleNumberII(int[] nums) {
		Map<Integer, Integer> numsCount = new HashMap<>();
        numsCount.put(nums[0], 1);
        for(int i=1;i<nums.length;i++){
            int n = nums[i];
            int currNCount = numsCount.get(n)!=null?numsCount.get(n):0;
            numsCount.put(n, currNCount+1);
            if(currNCount+1 == 3)
                numsCount.remove(n);
        }

        return numsCount.keySet().iterator().next();
	}

}
