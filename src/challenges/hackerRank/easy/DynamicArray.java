package challenges.hackerRank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an integer n (the size of the dynamic array) and and the list of queries (integer List)
 * There are  types of queries, given as an array of strings for you to parse: 
 * Query: 1 x y
 * 		Let idx = ((x xor lastAnswer)%n), and then Append the integer y to arr[idx].
 * Query: 2 x y
 * 		Let idx = ((x xor lastAnswer)%n), and then Assign the value arr[idx][y%size(arr[idx])] to lastAnswer.
 * 		Store the new value of lastAnswer to the answer array
 */
public class DynamicArray {
	
	public static void main(String args[]) {
		int n = 2;
		List<List<Integer>> queries = new ArrayList<>();
		queries.add(Arrays.asList(1,0,5));
		queries.add(Arrays.asList(1,1,7));
		queries.add(Arrays.asList(1,0,3));
		queries.add(Arrays.asList(2,1,0));
		queries.add(Arrays.asList(2,1,1));
		
		List<Integer> res = dynamicArray(n, queries);
		res.forEach(x-> System.out.print(x+" "));
	}
	
	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
	    // Write your code here
	        List<Integer> res = new ArrayList<>();
	        List<List<Integer>> arr = new ArrayList<>();
	        int lastAnswer = 0;
	        // int j = 0;
	        for(int i=0;i<n;i++)
	            arr.add(new ArrayList<>());
	        for(List<Integer> query : queries){
	            int idx = (query.get(1) ^ lastAnswer)%n;
	           if(query.get(0) == 1){
	                if(arr.size() <= idx){
	                   arr.add(new ArrayList<>(Arrays.asList(query.get(2))));
	               }else
	                arr.get(idx).add(query.get(2));
	            //    j++;
	           } 
	           else{
	               int jIndx = (query.get(2)) % (arr.get(idx).size());
	               lastAnswer = arr.get(idx).get(jIndx);
	               res.add(lastAnswer);
	           }
	        }
	        return res;
	    }

}
