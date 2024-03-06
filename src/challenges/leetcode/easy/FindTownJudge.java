package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
 * If the town judge exists, then:
 * The town judge trusts nobody. Everybody (except for the town judge) trusts the town judge. There is exactly one person that satisfies properties 1 and 2.
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 * Example 1: Input: n = 2, trust = [[1,2]]; Output: 2
 * Example 2: Input: n = 3, trust = [[1,3],[2,3]]; Output: 3
 * Example 3: Input: n = 3, trust = [[1,3],[2,3],[3,1]]; Output: -1
 */
public class FindTownJudge {
	
	public static void main(String args[]) {
		int[][] trust = {{1,3},{2,3},{1,4},{2,4},{3,4}};
		int n =  4;
		System.out.println(findJudge(n, trust));
	}
	
	public static int findJudge(int n, int[][] trust) {
        Map<Integer, Integer> freq = new HashMap<>();
        int max = 0, person = 0;
        if(n==1)
            return 1;
        for(int i=0;i<trust.length;i++){
            if(freq.containsKey(trust[i][1]))
                freq.put(trust[i][1], freq.get(trust[i][1])+1);
            else
                freq.put(trust[i][1], 1);
            if(freq.get(trust[i][1])>max){
                max = freq.get(trust[i][1]);
                person = trust[i][1];
            }
        }
        if(max==n-1){
            for(int i=0;i<trust.length;i++){
                if(trust[i][0]==person)
                    return -1;
            }
            return person;
        }
        return -1;
    }
}
