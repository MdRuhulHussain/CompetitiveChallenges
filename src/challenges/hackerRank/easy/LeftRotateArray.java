package challenges.hackerRank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotateArray {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements");
		List<Integer> arr = new ArrayList<>();
		for(int i = 0;i< n;i++) {
			arr.add(sc.nextInt());
		}
		
		System.out.println("Enter the number of rotation you want to perform");
		int d = sc.nextInt();
		List<Integer> result = rotateLeft(d, arr);
		
		for(int i=0;i<result.size();i++)
			System.out.print(result.get(i)+" ");

	}
	
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
	    // Write your code here
	    List<Integer> result = Arrays.asList(new Integer[arr.size()]);
	    for(int i=0;i<arr.size();i++){
	        if(i-d<0)
	            result.set(i-d+arr.size(), arr.get(i));
	        else
	            result.set(i-d,arr.get(i));
	    }
	    return result;
	}

}
