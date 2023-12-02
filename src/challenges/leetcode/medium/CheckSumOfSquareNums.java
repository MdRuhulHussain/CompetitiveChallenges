package challenges.leetcode.medium;

/*
 * Given a non-negative integer c, decide whether there're two integers a and b such that 
 * a2 + b2 = c.
 * e.g Input = 5, The output = true as 1^2 + 2^2 = 5
 * contraint 0 <= c < 2^31
 */
public class CheckSumOfSquareNums {
	
	public static void main(String args[]) {
		System.out.println(judgeSquareSum(5));
	}
	
	public static boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        int i=0;
        long sqrSum = 0L;
        while(i<=n){
            sqrSum = (long)(i*i)+(n*n);
            if(sqrSum==c)
                return true;
            else if(sqrSum<c)
                i++;
            else
                n--;
        } 
        return false;  
    }

}
