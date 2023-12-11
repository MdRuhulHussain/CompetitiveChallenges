package challenges.hackerRank.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
 * There is a collection of input strings and a collection of query strings. For each query 
 * string, determine how many times it occurs in the list of input strings. Return an array 
 * of the results. Example stringList = {"ab", "ab", "abc"}, queries = {"ab", "abc", "bc"}
 * There are  instances of "ab",1  of "abc" and 0 of "bc". For each query, add an element to
 * the return array, result = [2,1,0]
 */
public class SparseArray {
	
	public static void main(String args[]) {
		String[] strings = {"aba", "baba", "aba", "xzxb"};
		String[] queries = {"aba", "xzxb", "ab"};
		int[] res = matchingStrings(strings, queries);
		for(int num : res)
			System.out.println(num);
	}
	
	public static int[] matchingStrings(String[] strings, String[] queries) {
	    int n,q,count=0;
	    String s1="";
	    String s2="";
	    List<Integer> li=new ArrayList<Integer>();
	    n=strings.length;
	    q=queries.length;
	    for(int i=0;i<q;i++)
	    {
	        count=0;
	        s1=queries[i];
	        for(int j=0;j<n;j++)
	        {
	            s2=strings[j];
	            if(s1.equals(s2))
	            count++;
	        }
	        li.add(count);
	    }
	    int[] res=new int [li.size()];
	    for(int i=0;i<li.size();i++)
	    res[i]=li.get(i);
	    return res;
	    }

}
