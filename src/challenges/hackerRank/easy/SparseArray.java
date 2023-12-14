package challenges.hackerRank.easy;

import java.util.ArrayList;
import java.util.Arrays;
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
		List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
		List<String> queries = Arrays.asList("aba", "xzxb", "ab");
		List<Integer> res = matchingStrings(strings, queries);
		for(int num : res)
			System.out.print(num+" ");
	}
	
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
	    // Write your code here
	        List<Integer> res = new ArrayList<>();
	        for(String query : queries){
	            int count = 0;
	            for(String string : strings){
	                if(string.equals(query))
	                    count++;
	                    
	            }
	            res.add(count);
	        }
	        return res;
	    }

}
