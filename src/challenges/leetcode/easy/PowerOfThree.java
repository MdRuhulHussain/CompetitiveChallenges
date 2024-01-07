package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/power-of-three/description/
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 * An integer n is a power of three, if there exists an integer x such that n == 3x.
 * Example, Input : n = -1, output = false. Input : n = 9, output = true
 */
public class PowerOfThree {
	
	public static void main(String args[]) {
		int n = 9;
		System.out.println(isPowerOfThree(n));
		
		System.out.println(isPowerOfThreeWithoutLoopOrRecursion(n));
	}
	
	public static boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        while(n!=1){
            if(n%3==0)
                n/=3;
            else
                return false;
        }
        return true;
    }
	
	public static boolean isPowerOfThreeWithoutLoopOrRecursion(int n) {
		if(n<1)
            return false;
        double m = Math.log10(n)/Math.log10(3);
        if(Math.floor(m)==m)
            return true;
        return false;
	}

}
