package challenges.geekForgeeks.easy;

/*
 * Given an integer N. Find the number of digits that appear in its factorial. 
 * Example : Input : N = 5. Output = 3 (as the factorial of 5 is 120)
 */
public class DigitsInFactorial {
	
	public static void main(String args[]) {
		int N = 120;
		System.out.println(digitsInFactorial(N));
	}
	
	public static int digitsInFactorial(int N){
        double digitsCount = 1;
        if(N<4)
            return 1;
        for(int i=2;i<=N;i++){
            digitsCount+= Math.log10(i);
        }
        return (int)Math.floor(digitsCount);
        
    }

}
