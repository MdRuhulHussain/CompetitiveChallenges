package challenges.leetcode.easy;

/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest 
 * integer. The returned integer should be non-negative as well.
 */
public class SquareRoot {
	
	public static void main(String args[]) {
		System.out.println(mySqrt(81));
	}
	
	public static int mySqrt(int x) {
        int msb = (int)(Math.log(x)/Math.log(2));
        int a = 1<<msb;
        long result = 0L;
        while(a!=0){
            long squared = (a+result)*(a+result);
            if(squared<=x){
                result+=a;
            }
            a/=2;
        }
        return (int)result;
    }

}
