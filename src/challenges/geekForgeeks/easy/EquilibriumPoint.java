package challenges.geekForgeeks.easy;

/*
 * Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.
 * Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 
 * Example 1: Input: n = 5 , A[] = {1,3,5,2,2} ; Output: 3 
 * Explanation: equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 
 * Example 2: Input: n = 1, A[] = {1}; Output: 1
 * Explanation: Since there's only element hence its only the equilibrium point.
 */
public class EquilibriumPoint {
	
	public static void main(String args[]) {
		long[] arr = {1,3,5,2,2};
		System.out.println(equilibriumPoint(arr, arr.length));
	}
	
	public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
            return 1;
        long totalSum = 0, sumL = 0, sumR=0;
        for(long num : arr){
            totalSum += num;
        }
        // sumL = arr[0];
        sumR = totalSum-arr[0];
        if(sumL==sumR)
            return 1;
        for(int i=1;i<n-1;i++){
            sumL+=arr[i-1];
            sumR-=arr[i];
            if(sumL==sumR)
                return i+1;
        }
        return -1;
    }

}
