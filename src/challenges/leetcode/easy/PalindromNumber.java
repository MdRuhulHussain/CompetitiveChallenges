package challenges.leetcode.easy;

public class PalindromNumber {
	
	public static void main(String args[]) {
		System.out.println(isPalindrome(-121));
	}
	
	
	public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return checkPalindromUsingRecursion(str, 0, str.length()-1);
    }
    public static boolean checkPalindromUsingRecursion(String str, int i, int j) {
		if(i>j)
			return true;
		if(str.charAt(i)!=str.charAt(j))
			return false;
		i++;
		j--;
		return checkPalindromUsingRecursion(str, i, j );
	}

}
