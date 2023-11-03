package challenges.leetcode.easy;

/*
 * Add the digits of a number untill you are left with single digit
 * e.g - 457 => 4+5+7 => 16 => 7
 */
public class AddDigitsOfNum {
	
	public static void main(String args[]) {
		System.out.println(addDigits(457));
	}
	
	public static int addDigits(int num) {
		while(num>9){
            int finalDigit = 0;
            while(num>0){
                finalDigit += num%10;
                num /= 10;
            }
            num = finalDigit;
        }
        return num;
	}

}
