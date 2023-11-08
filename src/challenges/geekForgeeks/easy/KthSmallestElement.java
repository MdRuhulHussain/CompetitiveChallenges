package challenges.geekForgeeks.easy;

import java.util.Arrays;

public class KthSmallestElement {
	
	public static void main(String args[]) {
		int[] arr = {7,3,9,5,8,13};
		int k = 3;
		System.out.println(getKthSmallestElement(arr, k));
	}
	
	public static int getKthSmallestElement(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}

}
