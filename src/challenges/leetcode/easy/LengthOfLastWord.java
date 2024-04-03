package challenges.leetcode.easy;

/*
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * Example 1: Input: s = "Hello World"; Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2: Input: s = "   fly me   to   the moon  "; Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3: Input: s = "luffy is still joyboy"; Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 */
public class LengthOfLastWord {
	
	public static void main(String args[]) {
		String s = " fly me   to the moon   ";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
        int n=s.length()-1;
        int i = n;
        // boolean lettersFound = s.charAt(n)==" "?true:false;
        boolean lettersFound = false;
        while(n>=0){
            if(s.charAt(n)==' '){
                if(lettersFound)
                    break;
            } else {
                if(!lettersFound)
                    i=n;
                lettersFound = true;
            }
            n--;
        }
        return i-n;
    }

}
