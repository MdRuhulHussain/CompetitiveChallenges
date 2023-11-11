package challenges.geekForgeeks.easy;

import java.util.Arrays;

/*
 * Given two arrays a[] and b[] of size n and m respectively. The task is to find the number
 *  of elements in the union between these two arrays.
 */
public class UnionOfTwoArrays {
	
	public static void main(String args[]) {
		int[] a = {85, 25, 1, 32, 54, 6};
		int[] b = {85, 2};
		
		System.out.println(doUnion(a, a.length, b, b.length));
		
	}
	
	public static int doUnion(int[] a, int n, int[] b, int m) {
		int[] arr = new int[m+n];
        int i = 0;
        for(int num : a)
            arr[i++] = num;
        for(int num : b)
            arr[i++] = num;
            
        Arrays.sort(arr);
        int count = 1;
        for(i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1])
                count++;
        }
        return count;
	}

}
