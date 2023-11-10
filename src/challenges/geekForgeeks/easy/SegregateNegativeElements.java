package challenges.geekForgeeks.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an unsorted array arr[] of size N having both negative and positive integers. The 
 * task is place all negative element at the end of array without changing the order of 
 * positive element and negative element.
 */
public class SegregateNegativeElements {
	
	public static void main(String args[]) {
		int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
		segregateElements(arr, arr.length);
		
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}
	
	public static void segregateElements(int[] arr, int n) {
		int j = 0;
        List<Integer> negativeNums = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr[j] = arr[i];
                j++;
            }
            else{
                negativeNums.add(arr[i]);
            }
        }
        for(int i=0;i<negativeNums.size();i++){
            arr[j] = negativeNums.get(i);
            j++;
        }
	}

}
