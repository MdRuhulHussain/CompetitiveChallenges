package challenges.scaler.easy;

/*
 * Given an integer n, find the smallest number whose digits product is equal to n
 * e.g. input = 100, Output = 455 => 4*5*5; input = 1000, output = 5558 => 5*5*5*8
 * input = 81000, output = 555899 => 5*5*5*8*9*9
 * The approach to solve is to find the highest divisor (unit digit only) of number, to reduce the
 * number of divisor or the digits.
 */
public class SmallestNumDigitsProduct {
	
	public static void main(String args[]) {
		System.out.println(getSmallestNumberDigitsProductToN(81000));
	}
	
	public static int getSmallestNumberDigitsProductToN(int n) {
		
		String smallestNum = "";
		for(int i=9;i>1;i--) {
			while(n % i == 0) {
				n/=i;
				smallestNum = i+smallestNum;
			}
		}
		
		if(n != 1)
			return -1;
		
		return Integer.parseInt(smallestNum);
		
	}

}
