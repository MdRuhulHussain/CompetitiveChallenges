package challenges.leetcode.easy;

/*
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * A perfect square is an integer that is the square of an integer. In other words, it is the
 * product of some integer with itself.
 */
public class CheckPerfectSquare {
	
	public static void main(String args[]) {
		System.out.println(isPerfectSquare(39));
	}
	
	public static boolean isPerfectSquare(int num) {
        int msb = (int)(Math.log(num)/Math.log(2));
        int a = 1 << msb; //2^msb
        long result = 0L;
        while(a!=0){
            long check = (result+a)*(result+a);
            if(check<=num){
                if(check==num)
                    return true;
                result+=a;
            }
            a/=2; //a>>=1;
        }
        return false;
    }

}
