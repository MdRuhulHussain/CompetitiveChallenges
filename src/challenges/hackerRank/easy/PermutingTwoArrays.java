package challenges.hackerRank.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * There are two -element arrays of integers, A and B. Permute them into some A`  and B` such 
 * that the relation A`[i] + B`[i] >= k  holds for all  where 0 <= i < n
 * Return "YES" if some permutation A`, B` satisfying the relation exists, else "NO"
 * e.g. A = [0,1], B=[0,2] and k = 1; A valid A` and B` satisfying given condition is - 
 * A`=[1,0], B=[0,2], since for i=0, 1+0>=1 and for i=1, 0+2>=1
 */
public class PermutingTwoArrays {
	
	public static void main(String args[]) {
		int k = 10;
		List<Integer> A = Arrays.asList(2,1,3);
		List<Integer> B = Arrays.asList(7,8,9);
		System.out.println(twoArrays(k, A, B));
	}
	
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	    // Write your code here
	    Collections.sort(A, Collections.reverseOrder());
	    Collections.sort(B);
	    for(int i=0;i<A.size();i++){
		    if(A.get(i)+B.get(i)<k)
		       return "NO";
	    }
	    return "YES";
	}

}
