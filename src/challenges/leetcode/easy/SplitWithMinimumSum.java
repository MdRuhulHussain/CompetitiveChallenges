package challenges.leetcode.easy;

/*
 * Given a positive integer num, split it into two non-negative integers num1 and num2 such that:
 * The concatenation of num1 and num2 is a permutation of num.
 * In other words, the sum of the number of occurrences of each digit in num1 and num2 is equal to the number 
 * of occurrences of that digit in num. num1 and num2 can contain leading zeros.
 * Return the minimum possible sum of num1 and num2.
 * Example : Input: num = 4325; Output: 59
 * Explanation: We can split 4325 so that num1 is 24 and num2 is 35, giving a sum of 
 * 59. We can prove that 59 is indeed the minimal possible sum.
 */
public class SplitWithMinimumSum {
	
	public static void main(String args[]) {
		int num = 3052037;
		System.out.println(splitNum(num));
	}
	
	public static int splitNum(int num) {
        int[] digitsFrequency = new int[10];
        while(num>0){
            if(num%10>1)
                digitsFrequency[num%10] = digitsFrequency[num%10]+1;
            else if(num%10==0)
                digitsFrequency[1] = digitsFrequency[1]+1;
             else
                digitsFrequency[0] = digitsFrequency[0]+1;
            num/=10;
        }
        int num1 = 0, num2 = 0;
        boolean switchFlag = false;
        int countOf0 = digitsFrequency[1];
        while(countOf0>0){
            if(switchFlag){
                num2 = num2*10+0;
                switchFlag = false;
            }
            else{
                num1 = num1*10+0;
                switchFlag = true;
            }
            countOf0--;
        }
        int countOf1 = digitsFrequency[0];
        while(countOf1>0){
            if(!switchFlag){
                num1 = num1*10+1;
                switchFlag = true;
            }
            else{
                num2 = num2*10+1;
                switchFlag = false;
            }
            countOf1--;
        }
        for(int i=2;i<10;i++){
            int count = digitsFrequency[i];
            while(count>0){
                if(switchFlag){
                    num2 = num2*10+i;
                    switchFlag = false;
                }
                else {
                    num1 = num1*10+i;
                    switchFlag = true;
                }
                count--;
            }
        }
        return (num1+num2);
    }

}
