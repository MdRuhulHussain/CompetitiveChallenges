package challenges.leetcode.easy;

/*
 * The Tribonacci sequence Tn is defined as follows: 
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * Given n, return the value of Tn.
 * Example 1: Input: n = 4; Output: 4
 * Explanation: T_3 = 0 + 1 + 1 = 2, T_4 = 1 + 1 + 2 = 4
 * Example 2: Input: n = 25; Output: 1389537
 */
public class NthTribonacciNumber {
	
	public static void main(String args[]) {
		int n = 37;
		System.out.println(tribonacci(n));
	}
	
	public static int tribonacci(int n) {
        int a = 0, b = 1, c = 1, temp = 0;
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        for(int i=3;i<=n;i++){
            temp = c;
            c = a+b+c;
            a = b;
            b = temp;
        }
        return c;
    }

}
