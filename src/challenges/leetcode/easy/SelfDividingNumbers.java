package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * A self-dividing number is not allowed to contain the digit zero.
 * Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
 * Example 1: Input: left = 1, right = 22; Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
 * Example 2: Input: left = 47, right = 85; Output: [48,55,66,77]
 */
public class SelfDividingNumbers {
	
	public static void main(String args[]) {
		int left = 66, right = 708;
		List<Integer> res = selfDividingNumbers(left, right);
		for(int num : res)
			System.out.print(num+" ");
	}
	
	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i>0 && i<10)
                res.add(i);
            else if(i%10==0)
                continue;
            else{
                int temp = i;
                while(temp>0){
                    if(temp%10!=0 && i%(temp%10)==0)
                        temp/=10;
                    else
                        break;
                }
                if(temp==0)
                    res.add(i);
            }
        }
        return res;
    }

}
