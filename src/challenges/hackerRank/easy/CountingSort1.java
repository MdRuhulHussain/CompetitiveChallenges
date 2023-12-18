package challenges.hackerRank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * the counting sort, does not require comparison. Instead, you create an integer array whose
 * index range covers the entire range of values in your array to sort. Each time a value 
 * occurs in the original array, you increment the counter at that index. At the end, run 
 * through your counting array, printing the value of each non-zero valued index that number
 * of times.for the input = [1,1,3,2,1] : The output = [0,3,1,1,0,0,0,.....99th index]
 */ 
public class CountingSort1 {
	
	public static void main(String args[]) {
		List<Integer> arr = Arrays.asList(1,1,3,2,1);
		List<Integer> res = countingSort(arr);
		for(int n : res)
			System.out.print(n+" ");
	}
	
	public static List<Integer> countingSort(List<Integer> arr) {
	    // Write your code here
	    List<Integer> frequencyArr = new ArrayList<>();
	    for(int i=0;i<100;i++)
	        frequencyArr.add(0);
	    for(int num : arr){
	        frequencyArr.set(num, frequencyArr.get(num)+1);
	    }
	        
	    return frequencyArr;
	}

}
