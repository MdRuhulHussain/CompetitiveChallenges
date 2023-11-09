package challenges.leetcode.easy;

/*
 * Given a positive integer num, return the number of positive integers less than or equal to
 *  num whose digit sums are even. The digit sum of a positive integer is the sum of all its
 *   digits. eg1 : 12 => for integers upto 12, these are the numbers with their digits sum is
 *   even - {2,4,6,8,11}. So the output will be 5
 */
public class CountEvenDigitsNumbers {
	
	public static void main(String[] args) {
		System.out.println(countEvenDigitsInteger(30));
	}
	
	public static int countEvenDigitsInteger(int num) {
		int count = 0;
        for(int i=2;i<=num;i++){
            int temp = i;
            int sum = 0;
            while(temp>0){
                sum += temp%10;
                temp/=10;
            }
            if(sum%2==0)
                count++;
        }
        return count;
	}

}
