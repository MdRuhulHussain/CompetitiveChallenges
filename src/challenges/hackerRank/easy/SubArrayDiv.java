package challenges.hackerRank.easy;

import java.util.Arrays;
import java.util.List;

/*
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.Lily
 * decides to share a contiguous segment of the bar selected such that: The length of the segment matches 
 * Ron's birth month, and, The sum of the integers on the squares is equal to his birth day.
 * Determine how many ways she can divide the chocolate.
 * e.g. Input : s = {2,2,1,3,2}, d=4, m=2; There are two segments meeting her criteria : {2,2} and {1,3}.
 * So, the Output = 2;
 */
public class SubArrayDiv {
	
	public static void main(String args[]) {
		int d = 5, m = 2;
		List<Integer> s = Arrays.asList(2,3,2,2,1,0,5,4,1,7,6);
		System.out.println(birthday(s, d, m));
	}
	
	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
        for(int i=0;i<=s.size()-m;i++){
            int sum = s.get(i);
            if(sum>d)
                continue;
            int j;
            for(j=i+1;j<(i+m);j++){
                sum+=s.get(j);
                if(sum>d){  
                    break;
                }
            }
            if(sum==d && j-i == m)
                count++;
        }
        return count;
	}

}
