package challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * You are given an integer n that consists of exactly 3 digits.
 * We call the number n fascinating if, after the following modification, the resulting number contains all 
 * the digits from 1 to 9 exactly once and does not contain any 0's:
 * Concatenate n with the numbers 2 * n and 3 * n.
 * Return true if n is fascinating, or false otherwise.
 * Concatenating two numbers means joining them together. For example, the concatenation of 121 and 371 is 121371.
 * Example : Input: n = 192, Output: true
 * Explanation: We concatenate the numbers n = 192 and 2 * n = 384 and 3 * n = 576. The resulting number is 
 * 192384576. This number contains all the digits from 1 to 9 exactly once.
 */
public class FascinatingNumber {
	
	public static void main(String args[]) {
		int n = 192;
		System.out.println(isFascinating(n));
	}
	
	public static boolean isFascinating(int n) {
        Set<Integer> distinct9 = new HashSet<>();
        int[] nums = {n, 2*n, 3*n};
        for(int num : nums){
            while(num>0){
                int rem = num%10;
                if(rem==0 || distinct9.contains(rem))
                    return false;
                distinct9.add(rem);
                num/=10;
            }
        }
        if(distinct9.size()==9)
            return true;
        return false;
        
    }

}
