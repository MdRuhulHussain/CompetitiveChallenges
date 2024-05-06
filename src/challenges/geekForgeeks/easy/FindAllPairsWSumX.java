package challenges.geekForgeeks.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
 * Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then (u1,v1) should be printed first else second.
 * Example 1: Input: A[] = {1, 2, 4, 5, 7}, B[] = {5, 6, 3, 4, 8}, X = 9 
 * Output: 1 8, 4 5 , 5 4
 * Explanation: (1, 8), (4, 5), (5, 4) are the pairs which sum to 9.
 * Example 2: Input: A[] = {-1, -2, 4, -6, 5, 7}, B[] = {6, 3, 4, 0} , X = 8 
 * Output: 4 4 , 5 3
 */
public class FindAllPairsWSumX {
	
	public static void main(String args[]) {
		long A[] = {-1, -2, 4, -6, 5, 7};
		long B[] = {6, 3, 4, 0};
		long X = 8;
		pair[] pairs = allPairs(A, B, A.length, B.length, X);
		for(pair p : pairs)
			System.out.println("first = "+p.first+" second = "+p.second);
	}
	
	public static pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        List<long[]> li = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        for(long a : A){
            for(long b : B){
                if(a+b==X)
                    li.add(new long[]{a,b});
                else if(a+b>X)
                    break;
            }
        }
        pair[] pairs = new pair[li.size()];
        for(int i=0;i<li.size();i++){
            pair p = new pair(li.get(i)[0], li.get(i)[1]);
            pairs[i] = p;
        }
        return pairs;
        
    }

}

class pair {
	long first, second;
	public pair(long first, long second) {
		this.first = first;
		this.second = second;
	}
}
