package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/power-of-two/description/
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 * Example: Input : n = 16. Output = true
 */
public class PowerOfTwo {
	
	public static void main(String args[]) {
		System.out.println(isPowerOfTwoUsingLoop(8));
	}
	
	public static boolean isPowerOfTwoUsingLoop(int n) {
		if(n<1)
            return false;
        while(n!=1){
            if(n%2==0)
                n/=2;
            else
                return false;
        }
        return true;
	}

}
