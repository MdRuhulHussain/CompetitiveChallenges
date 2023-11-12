package challenges.leetcode.easy;

/*
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return true if n is an ugly number.
 * input : n = 6, true, since prime factors of 6 = 2,3 
 * input : n = 8, true since prime factors of 8 = 2 (4 is a factor but not prime)
 * input : n = 9, true
 * input : n = 21, false, prime factors of 21 = 3,7 (7 is not limited to 2,3,5)
 */
public class UglyNumbers {
	
	public static void main(String args[]) {
		
		System.out.println(uglyNumber(16));
	}
	
	public static boolean uglyNumber(int n) {
		if(n==1 || n==2 || n==3 || n==5)
            return true;
        if(n<=0)
            return false;
        int k = n/2;
        if(k==4)
            return true;
        if(k==5 || k==3 || k==2){
            if(n%2==0)
                return true;
            else
                return false;
        }
        
        while(n%2==0){
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                if(i>5)
                    return false;
                n/=i;
            }
        }
        if(n<6)
            return true;
        // else
        //     return false;
        return false;
	}

}
