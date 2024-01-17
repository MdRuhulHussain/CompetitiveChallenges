package challenges.geekForgeeks.easy;

public class DigitsInFactorial {
	
	public static void main(String args[]) {
		int n = 120;
		System.out.println(digitsInFactorial(n));
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
