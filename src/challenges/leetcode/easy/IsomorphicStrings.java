package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * Example 1: Input: s = "egg", t = "add"; Output: true
 * Example 2: Input: s = "foo", t = "bar"; Output: false
 * Example 3: Input: s = "paper", t = "title"; Output: true
 */
public class IsomorphicStrings {
	
	public static void main(String args[]) {
		String s = "abcdefghi";
		String t = "abcdefgha";
		System.out.println(isIsomorphic(s, t));
	}
	
	public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charsEx = new HashMap<>();
        Set<Character> uniqueReplaced = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(charsEx.containsKey(s.charAt(i))){
                if(t.charAt(i) != charsEx.get(s.charAt(i)))
                    return false;
            } else if(uniqueReplaced.contains(t.charAt(i)))
                return false;
            else{
                charsEx.put(s.charAt(i), t.charAt(i));
                uniqueReplaced.add(t.charAt(i));
            }
        }
        return true;
    }

}
