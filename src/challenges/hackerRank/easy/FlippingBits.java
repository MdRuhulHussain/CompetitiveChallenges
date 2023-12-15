package challenges.hackerRank.easy;

/*
 * You will be given a list of 32 bit unsigned integers. Flip all the bits ( and ) and return
 * the result as an unsigned integer.
 * e.g. Input = 9 => 00000000000000000000000000001001 (in binary form), After flipping it'll be
 * 11111111111111111111111111110110 which is equivalent to 4294967286 in decimal. 
 * So, the output will be 4294967286
 * 
 */
public class FlippingBits {
	
	public static void main(String args[]) {
		System.out.println(flippingBits(1));
	}
	
	public static long flippingBits(long n) {
	   return Math.abs((1L<<32L) - (n+1));
	}

}
