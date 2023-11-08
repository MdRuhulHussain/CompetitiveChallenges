package challenges.leetcode.easy;

/*
 * Check if number is happy : return true for happy number, else false
 * A number is called happy when we get 1 on adding the square of its digits
 * recursively.
 * e.g : num = 19 => 1^2 + 9^2 => 1+81 => 82 => 8^2 + 2^2 => 64+4 => 70 => 
 * 7^2 + 0^2 => 49 + 0 => 4^2 + 9^2 => 16+81 => 97 => 81+49 =>  130 =>
 * 1+9+0 => 10 => 1+0 => 1, So it is a happy number
 * 
 * e.g2 : num = 2 => false
 */
public class HappyNumbers {
	
	public static void main(String args[]) {
		System.out.println(isHappy(19));
	}
	
	public static boolean isHappy(int n) {
		while(n>6){
            int sum = 0;
            while(n>0){
                int remainder = n%10;
                sum += remainder*remainder;
                n/=10;
            }
            n = sum;
        }
        if(n==1)
            return true;
        return false;
	}

}
