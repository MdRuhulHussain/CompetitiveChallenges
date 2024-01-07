package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/power-of-four/description/
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 * 
 */
public class PowerOfFour {
	
	public static void main(String args[]) {
		int n = 16;
		System.out.println(isPowerOfFour(n));
	}
	
	public static boolean isPowerOfFour(int n) {
        if(n<1)
            return false;
        while(n!=1){
            if(n%4!=0)
                return false;
            n/=4;
        }
        return true;
    }

}
