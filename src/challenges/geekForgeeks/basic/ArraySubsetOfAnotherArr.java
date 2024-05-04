package challenges.geekForgeeks.basic;

import java.util.HashMap;
import java.util.Map;

/*
 * Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m, where both arrays may contain duplicate elements. The task is to determine whether array a2 is a subset of array a1. It's important to note that both arrays can be sorted or unsorted. Additionally, each occurrence of a duplicate element within an array is considered as a separate element of the set.
 * Example 1: Input: a1[] = {11, 7, 1, 13, 21, 3, 7, 3}, a2[] = {11, 3, 7, 1, 7}
 * Output: Yes
 * Explanation:
 * a2[] is a subset of a1[]
 * Example 3: Input: a1[] = {10, 5, 2, 23, 19}; a2[] = {19, 5, 3}
 * Output: No
 * Explanation: a2[] is not a subset of a1[]
 */
public class ArraySubsetOfAnotherArr {
	
	public static void main(String args[]) {
		long a1[] = {1, 2, 3, 4, 4, 5, 6};
		long a2[] = {1, 2, 4};
		System.out.println(isSubset(a1, a2, a1.length, a2.length));
	}
	
	public static String isSubset( long a1[], long a2[], long n, long m) {
        Map<Long, Integer> a1Freq = new HashMap<>();
        Map<Long, Integer> a2Freq = new HashMap<>();
        for(long num : a1){
            if(a1Freq.containsKey(num))
                a1Freq.put(num, a1Freq.get(num)+1);
            else
                a1Freq.put(num, 1);
        }
        for(long num : a2){
            if(a2Freq.containsKey(num))
                a2Freq.put(num, a2Freq.get(num)+1);
            else
                a2Freq.put(num, 1);
        }
        for(long key : a2Freq.keySet()){
            if(!a1Freq.containsKey(key))
                return "No";
            else if(a1Freq.get(key)<a2Freq.get(key))
                return "No";
        }
        return "Yes";
        
    }

}
