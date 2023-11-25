package challenges.leetcode.easy;

/*
 * Guess the picked number from 1 to n, assume that the method guess(int num) will return 0 if
 * guessed number is same as picked, else if guessed number > picked then -1 else if guessed
 * number < picked then 1. 
 * Since the method guess(int num) is an api in leetcode which returns according to the above
 * illustration, but here I'm just returning 0 i.e guessed number = picked number
 */
public class GuessNumber {
	
	public static void main(String args[]) {
		System.out.println(guessNumber(6));
	}
	
	public static int guessNumber(int n) {
        int start = 1, end = n;
        int mid=1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==-1)
                end = mid-1;
            else
                start = mid+1;
        }
        return mid;
    }
	
	public static int guess(int num) {
		return 0;
	}

}
