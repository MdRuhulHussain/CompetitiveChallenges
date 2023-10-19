package challenges.hackerRank.easy;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Size of Input array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Please Enter elements of array");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		reverseArray(arr);
		for(int item : arr)
			System.out.println(item+" ");
		
	}
	
	public static int[] reverseArray(int[] arr) {
		
		int j = arr.length-1;
		int i = 0;
		int temp = 0;
		while(i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}

}
