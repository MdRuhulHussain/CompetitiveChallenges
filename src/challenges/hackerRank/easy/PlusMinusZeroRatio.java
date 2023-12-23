package challenges.hackerRank.easy;

import java.util.Arrays;
import java.util.List;

/*
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. 
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 * e.g. Input = {1,2,0,-1,-1}, since there are two positive numbers so, -> 2/5, for negative 2/5, for zero -> 1/5
 * Output = 0.400000 \n 0.400000 \n 0.200000
 */
public class PlusMinusZeroRatio {
	
	public static void main(String args[]) {
		List<Integer> arr = Arrays.asList(-4,3,-9,0,4,1);
		plusMinus(arr);
	}
	
	public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	        float pos = 0, neg = 0, zero = 0;
	        for(int num : arr){
	            if(num>0)
	                pos++;
	            else if(num<0)
	                neg++;
	            else
	                zero++;
	        }
	        System.out.println(pos/arr.size());
	        System.out.println(neg/arr.size());
	        System.out.println(zero/arr.size());
	    }

}
