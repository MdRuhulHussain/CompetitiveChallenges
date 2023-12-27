package challenges.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/rank-transform-of-an-array/description/
 * Given an array of integers arr, replace each element with its rank. The rank represents how large the 
 * element is. The rank has the following rules:
 * Rank is an integer starting from 1.
 * The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
 * Rank should be as small as possible.
 * Example: Input arr = {40,10,20,30}. Output = {4,1,2,3}.
 * Input arr = {100,100,100}. Output = {1,1,1}
 */
public class RankTransformOfArray {
	
	public static void main(String args[]) {
		int[] arr = {37,12,28,9,100,56,80,5,12};
		int[] res = arrayRankTransform(arr);
		for(int num : res)
			System.out.print(num+" ");
	}
	
	public static int[] arrayRankTransform(int[] arr) {
        if(arr.length==0)
            return arr;
        Map<Integer, Integer> valRank = new HashMap<>();
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            res[i] = arr[i];
        Arrays.sort(arr);
        int rank = 1;
        valRank.put(arr[0], rank);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1])
                valRank.put(arr[i], rank);
            else
                valRank.put(arr[i], ++rank);
        }
        for(int i=0;i<res.length;i++){
            res[i] = valRank.get(res[i]);
        }
        return res;
    }

}
