package challenges.geekForgeeks.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllPairsWSumX {
	
	public static void main(String args[]) {
		long A[] = {-1, -2, 4, -6, 5, 7};
		long B[] = {6, 3, 4, 0};
		long X = 8;
		pair[] pairs = allPairs(A, B, A.length, B.length, X);
		for(pair p : pairs)
			System.out.println(p.first+" "+p.second);
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
