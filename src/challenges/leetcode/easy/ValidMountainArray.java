package challenges.leetcode.easy;

/*
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if: arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * e.g the arr {0,2,3,4,5,2,1,0} is a valid Mountain array 
 * while the arr {0,2,3,3,5,2,1,0} is not a valid mountain array
 */
public class ValidMountainArray {
	
	public static void main(String args[]) {
		int[] arr = {};
		System.out.println(validMountainArray(arr));
	}
	
	public static boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        boolean flag = false, increased = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i])
                return false;
            else if(arr[i-1]<arr[i]){
              increased = true;
                if(flag)
                    return false;
                continue;
            } else {
                flag = true;
            }
        }
        if(flag && increased)
          return true;
        return false;
    }

}
