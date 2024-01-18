package challenges.geekForgeeks.easy;

/*
 * Given a positive integer value N. The task is to find how many numbers less than or equal to N have 
 * numbers of divisors exactly equal to 3.
 * Example : Input : N = 10, Output = 2
 * Explaination : The number 4 and 9 have 3 divisors
 */
public class Exactly3Divisors {
	
	public static void main(String args[]) {
		int N = 625;
		System.out.println(exactly3Divisors(N));
	}
	
	public static int exactly3Divisors(int N)
    {
        //Your code here
        int count = 0;
        if(N>=9)
            count+=2;
        else if(N<4)
            return count;
        else if(N>4)
            return count+1;
        int n = (int)Math.sqrt(N);
        N = n*n;
        while(N>9){
            if(n==2 || n==3)
                count++;
            else if(n%2!=0 && n%3!=0){
                boolean isPrime = true;
                for(int i = 5;i*i<=n;i+=6){
                    if(n%i==0 || n%(i+2)==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime)
                    count++;
            }
            n--;
            N = n*n;
        }
        return count;
    }

}
