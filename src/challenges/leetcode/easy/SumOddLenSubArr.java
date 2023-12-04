package challenges.leetcode.easy;

/*
 * Given an array of positive integers arr, return the sum of all possible odd-length 
 * subarrays of arr.
 * e.g. Input arr = {1,2} , Output = 3 => OddLength SubArrays => {1}, {2} => 1+2=>3
 * Input arr = {10,11,12}, Output = 66 => OddLength SubArrays => {10},{11},{12},{10,11,12}
 * => 10+11+12+(10+11+12) => 66
 * Input arr = {1,4,2,5,3}, Output = 58 => OddLength SubArrays => {1},{4},{2},{5},{3},{1,4,2},
 * {4,2,5},{2,5,3},{1,4,2,5,3} => 1+4+2+5+3+(1+4+2)+(4+2+5)+(2+5+3)+(1+4+2+5+3) => 58
 */
public class SumOddLenSubArr {
	
	public static void main(String args[]) {
		int[] arr = {1,4,2,5,3};
		System.out.println(sumOddLengthSubArraysNaiveSol(arr));
	}
	
	public static int sumOddLengthSubArraysNaiveSol(int[] arr) {
		int sum = 0;
		 for(int i=1;i<=arr.length;i+=2){
             for(int j=0;j<=arr.length-i;j++){
                 for(int k=j;k<(i+j);k++){
                     sum+=arr[k];
                 }
             }
         }
		 return sum;
	}
	
	

}
