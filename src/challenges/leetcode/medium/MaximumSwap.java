package challenges.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given an integer num. You can swap two digits at most once to get the maximum valued number.
 * Return the maximum valued number you can get.
 * Example 1: Input: num = 2736; Output: 7236
 * Explanation: Swap the number 2 and the number 7.
 * Example 2: Input: num = 9973; Output: 9973
 * Explanation: No swap.
 */
public class MaximumSwap {
	
	public static void main(String args[]) {
		int num = 94947839;
		System.out.println(maximumSwap(num));
	}
	
	public static int maximumSwap(int num) {
        int maxDigit=0, index=0, rem=0,i=0;
        List<Integer> li = new ArrayList<>();
        while(num>0){
            rem = num%10;
            if(rem>maxDigit){
                maxDigit=rem;
                index=i;
            }
            li.add(rem);
            i++;
            num/=10;
        }
        for(i=li.size()-1;i>=0;){
            if(li.get(i)<maxDigit){
                li.set(index, li.get(i));
                li.set(i, maxDigit);
                break;
            }else{
                i--;
                int[] newMax = findMax(li, i);
                maxDigit = newMax[0];
                index = newMax[1];
            }
        }
        int maxValue = 0;
        for(i=li.size()-1;i>=0;i--)
            maxValue = maxValue*10 + li.get(i);
        
        return maxValue;
    }

    public static int[] findMax(List<Integer> li, int i){
        int max = 0, index = 0;
        for(int j=0;j<=i;j++){
            if(li.get(j)>max){
                max = li.get(j);
                index = j;
            }
        }
        return new int[]{max, index};
    }

}
