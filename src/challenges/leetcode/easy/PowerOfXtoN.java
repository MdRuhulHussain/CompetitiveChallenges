package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
/*
 * Write program producing Power of x to n, where n can be negative.
 * e.g. Input => x = 2, n = 3 ; output => 8
 * e.g Input => x = 2, n = -3 ; output => 0.125 (1/8)
 */
public class PowerOfXtoN {
	
	public static void main(String args[]) {
		System.out.println(powOfUsingRecursion(2,-3));
		
		System.out.println(powOfUsingLoop(2,-3));
		
		System.out.println(powOfUsingRecursion(5,31));
	}
	
	public static double powOfUsingRecursion(double x, int n) {
        
        //using recursion
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n==-1)
            return 1/x;
        double prod = powOfUsingRecursion(x, n/2);
        if(n%2==0)
           return prod*prod;
        else if(n<0)
            return 1/x*prod*prod;
        else
            return x*prod*prod;
        
        
    }
	
	public static double powOfUsingLoop(double x, int n) {
		
		//using loop
        if(n==0)
            return 1;
        List<Integer> exps = new ArrayList<>();
        if(n==-2147483648){
            n/=2;
            exps.add(n);
        }
        int pow = Math.abs(n);
        while(pow>1){
            exps.add(pow);
            pow/=2;
        }
        double prod = x;
        for(int i=exps.size()-1;i>=0;i--){
            if(exps.get(i)%2==0)
                prod = prod*prod;
            else
                prod = x*prod*prod;
            
        }
        if(n<0)
            prod=1/prod;
        return prod;
	}
	


}
