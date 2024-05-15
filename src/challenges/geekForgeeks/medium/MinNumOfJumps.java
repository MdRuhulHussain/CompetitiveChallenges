package challenges.geekForgeeks.medium;

/*
 * Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
 * Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
 * Note: Return -1 if you can't reach the end of the array.
 * Example 1: Input: N = 11 , arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ; Output: 3 
 * Explanation: First jump from 1st element to 2nd element with value 3. Now, from here we jump to 5th element with value 9, and from here we will jump to the last. 
 * Example 2: Input : N = 6, arr = {1, 4, 3, 2, 6, 7}; Output: 2 
 * Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
 */
public class MinNumOfJumps {
	
	public static void main(String args[]) {
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(minJumps(arr));
	}
	
	public static int minJumps(int[] arr){
        // your code here
        int i=0, jump = 0;
        if(arr.length==1)
            return 0;
        if(arr[0]==0)
            return -1;
        while(i<arr.length){
            if(arr[i]==0)
                return -1;
            int currIndex = i;
            int nextIndex = i;
            i=arr[i];
            int max = 0;
            if(i>=arr.length-1-currIndex){
                jump++;
                break;
            }
            for(int j=1;j<=i && currIndex+j<arr.length;j++){
                if(arr[currIndex+j]+j>max){
                    max = arr[currIndex+j]+j;
                    nextIndex = currIndex+j;
                }
                    
            }
            i=nextIndex;
            jump++;
        }
        return jump;
    }

}
