package challenges.hackerRank.easy;

import java.util.Arrays;

/*
 * Given an array of  distinct integers, transform the array into a zig zag sequence by permuting the array
 * elements. A sequence will be called a zig zag sequence if the first  elements in the sequence are in 
 * increasing order and the last  elements are in decreasing order, where k=(n+1)/2. You need to find the 
 * lexicographically smallest zig zag sequence of the given array.
 * Example. a = [2,3,5,1,4], Now if we permute the array as [1,4,5,3,2] or [1,2,5,4,3], the result is a zig
 * zag sequence.
 */
public class ZigZagSequence {
	
	public static void main(String args[]) {
		int[] a = {2,3,5,1,4};
		findZigZagSequence(a, a.length);
	}
	
	public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2-1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

}
