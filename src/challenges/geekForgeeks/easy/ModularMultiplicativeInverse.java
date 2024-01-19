package challenges.geekForgeeks.easy;

/*
 * Given two integers ‘a’ and ‘m’. The task is to find the smallest modular multiplicative inverse of ‘a’ 
 * under modulo ‘m’. if it does not exist then return -1.
 * Input : a = 3, m = 11
 * Output: 4
 * Explanation: Since (4*3) mod 11 = 1, 4 is modulo inverse of 3.
 */
public class ModularMultiplicativeInverse {
	
	public static void main(String args[]) {
		int a = 10, m = 17;
		System.out.println(modInverse(a, m));
	}
	
	public static int modInverse(int a, int m)
    {
      //Your code here
      for(int i=1;i<=m;i++){
          if(a*i%m==1)
            return i;
      }
      return -1;
    }

}
