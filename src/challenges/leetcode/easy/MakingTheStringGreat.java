package challenges.leetcode.easy;

/*
 * Given a string s of lower and upper case English letters.
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 * 0 <= i <= s.length - 2
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 * Notice that an empty string is also good.
 * Example 1: Input: s = "leEeetcode"; Output: "leetcode"
 * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
 * Example 2: Input: s = "abBAcC"; Output: ""
 * Explanation: We have many possible scenarios, and all lead to the same answer. For example:
 * "abBAcC" --> "aAcC" --> "cC" --> ""
 * "abBAcC" --> "abBA" --> "aA" --> ""
 * Example 3: Input: s = "s"; Output: "s"
 */
public class MakingTheStringGreat {
	
	public static void main(String args[]) {
		String s = "abBAcCdefPp";
		System.out.println(makeGood(s));
	}
	
	public static String makeGood(String s) {
        String str = s;
        do{
            str = s;
            s = check(str);
        }
        while(s.length()!=str.length());
        return str;
    }

    public static String check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)+32 || s.charAt(i)==s.charAt(i+1)-32){
                s=s.substring(0,i)+s.substring(i+2, s.length());
                return s;
            }
        }
        return s;
    }

}
