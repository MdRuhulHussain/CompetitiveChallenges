package challenges.leetcode.easy;

public class SplitWithMinimumSum {
	
	public static void main(String args[]) {
		int num = 4325;
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
