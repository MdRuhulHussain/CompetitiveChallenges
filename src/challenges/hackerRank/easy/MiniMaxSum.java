package challenges.hackerRank.easy;

import java.util.Arrays;
import java.util.List;

/*
 * Given five positive integers, find the minimum and maximum values that can be calculated 
 * by summing exactly four of the five integers. Then print the respective minimum and maximum
 * values as a single line of two space-separated long integers.
 * e.g. Input = {1,2,3,4,5} : Output = 10 14
 */
public class MiniMaxSum {
	
	public static void main(String args[]) {
		List<Integer> arr = Arrays.asList(1,3,4,42,8);
		miniMaxSum(arr);
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	        long totalSum = 0L;
	        int min = Integer.MAX_VALUE;
	        int max = arr.get(0);
	        for(int i=0;i<arr.size();i++){
	            int currNum = arr.get(i);
	            if(min>currNum)
	                min = currNum;
	            else if(max<currNum)
	                max = currNum;
	            totalSum += currNum;
	        }
	        System.out.println((totalSum-max)+" "+(totalSum-min));
	    }

}
