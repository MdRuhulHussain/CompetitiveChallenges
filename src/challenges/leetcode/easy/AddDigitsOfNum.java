package challenges.leetcode.easy;

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
