package challenges.geekForgeeks.medium;

import java.util.ArrayList;

/*
 * Given an unsorted array A of size N that contains only non negative integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.
 * In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.
 * Note:- You have to return an ArrayList consisting of two elements left and right. In case no such subarray exists return an array consisting of element -1.
 * Example 1: Input: N = 5, S = 12, A[] = {1,2,3,7,5}; Output: 2 4
 * Explanation: The sum of elements from 2nd position to 4th position is 12.
 * Example 2: Input: N = 10, S = 15, A[] = {1,2,3,4,5,6,7,8,9,10}; Output: 1 5
 * Explanation: The sum of elements from 1st position to 5th position is 15.
 */
public class SubArraySum {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,7,5};
		int s = 12;
		ArrayList<Integer> res = subarraySum(arr, arr.length, s);
		for(int num : res)
			System.out.print(num+" ");
	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> li = new ArrayList<>();
        int sum = 0, beg = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            while(sum>s){
                if(beg==i){
                    sum = arr[i];
                    break;
                }
                if((sum-=arr[beg++]) == 0)
                    break;
            }
            if(sum == s){
                li.add(beg+1);
                li.add(i+1);
                return li;
            }
            
        }
        li.add(-1);
        return li;
        
    }

}
