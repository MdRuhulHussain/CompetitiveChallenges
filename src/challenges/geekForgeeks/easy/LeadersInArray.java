package challenges.geekForgeeks.easy;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is a leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 
 * Example 1: Input: n = 6, A[] = {16,17,4,3,5,2}; Output: 17 5 2
 * Explanation: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next leader is 5. The right most element 
 * is always a leader so it is also included.
 * Example 2: Input: n = 5, A[] = {1,2,3,4,0}; Output: 4 0
 * Explanation: 0 is the rightmost element and 4 is the only element which is greater than all the elements to its right.
 */
public class LeadersInArray {
	
	public static void main(String args[]) {
		int[] arr = {16, 17, 5, 4, 3, 5, 2};
		ArrayList<Integer> res = leaders(arr, arr.length);
		for(int r : res)
			System.out.print(r+" ");
	}
	
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        int max = arr[n-1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                res.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }

}
