package challenges.leetcode.easy;

/*
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 * Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 */
public class Palindrom2 {
	
	public static void main(String args[]) {
		String s = "deddde";
		System.out.println(validPalindrome(s));
	}
	
	public static boolean validPalindrome(String s) {
        int i=0, j=s.length()-1;
        boolean x = false, y = false;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                x = check(s, i+1, j);
                y = check(s, i, j-1);
                if( x || y)
                    return true;
                else
                    return false;
            }
            i+=1;
            j-=1;
        
        }
        return true;
    }
    public static boolean check(String str, int i, int j){
        while(i<j){
            if(str.charAt(i) !=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

}
