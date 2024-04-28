package challenges.leetcode.easy;

/*
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * Example 1: Input: word1 = ["ab", "c"], word2 = ["a", "bc"]; Output: true
 * Explanation: word1 represents string "ab" + "c" -> "abc"; word2 represents string "a" + "bc" -> "abc"; The strings are the same, so return true.
 * Example 2: Input: word1 = ["a", "cb"], word2 = ["ab", "c"]; Output: false
 * Example 3: Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]; Output: true
 */
public class CheckStringsAreEquivalent {
	
	public static void main(String args[]) {
		String[] word1 = {"ab", "c", "def"};
		String[] word2 = {"a", "bcd", "ef"};
		System.out.println(arrayStringsAreEqual(word1, word2));
	}
	
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder(word1[0]);
        StringBuilder s2 = new StringBuilder(word2[0]);
        for(int i=1;i<word1.length;i++)
            s1.append(word1[i]);
        for(int i=1;i<word2.length;i++)
            s2.append(word2[i]);
        if(s1.toString().equals(s2.toString()))
            return true;
        return false;
    }

}
