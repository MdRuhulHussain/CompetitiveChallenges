package challenges.leetcode.easy;

/*
 * Given a 1-indexed arr nums of length n, An element nums[i] of nums is called special if 
 * i divides n, i.e. n % i == 0. Return the sum of the squares of all special elements of nums.
 * e.g. Input = {1,2,3,4} => Output = 21 {as 1 divides 4, 2 divides 4, 4 divides 4, doing sqr
 * sum of the number at these indices -> 1^2+2^2+4^4 => 21
 * e.g. Input = {1,2,4,3} => Output = 21 {as 1 divides 4, 2 divides 4, 4 divides 4, doing sqr
 * sum of the number at these indices -> 1^2+2^2+4^4 => 14
 */
public class SumOfSpecialElemSquare {
	
	public static void main(String args[]) {
		int[] arr = {2,7,1,19,18,3};
		System.out.println(sumOfSquares(arr));
	}
	
	public static int sumOfSquares(int[] nums) {
        int len = nums.length;
        int sumOfSqr = 0;
        for(int i=0;i<len;i++){
            if(len%(i+1)==0)
                sumOfSqr += nums[i]*nums[i];
        }
        return sumOfSqr;
    }

}
