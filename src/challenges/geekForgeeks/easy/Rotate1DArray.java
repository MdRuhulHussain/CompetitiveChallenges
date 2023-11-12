package challenges.geekForgeeks.easy;

public class Rotate1DArray {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6};
		rotateArray(arr, arr.length);
		
		for(int num : arr)
			System.out.print(num+" ");
	}
	
	public static void rotateArray(int[] arr, int n) {
		int temp = arr[n-1];
        for(int i=n-1; i>0;i--)
            arr[i] = arr[i-1];
        arr[0] = temp;
	}

}
