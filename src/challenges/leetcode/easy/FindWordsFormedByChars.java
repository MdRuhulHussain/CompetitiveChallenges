package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * You are given an array of strings words and a string chars. A string is good if it can be formed by characters from chars (each character can only be used once).
 * Return the sum of lengths of all good strings in words.
 * Example 1: Input: words = ["cat","bt","hat","tree"], chars = "atach"; Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 * Example 2: Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"; Output: 10
 * Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */
public class FindWordsFormedByChars {
	
	public static void main(String args[]) {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		System.out.println(countCharacters(words, chars));
	}
	
	public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> charsFreq = new HashMap<>();
        int sumOfLengths = 0;
        for(int i=0;i<chars.length();i++){
            if(charsFreq.containsKey(chars.charAt(i)))
                charsFreq.put(chars.charAt(i), charsFreq.get(chars.charAt(i))+1);
            else
                charsFreq.put(chars.charAt(i), 1);
        }
        for(String word : words){
            if(word.length()<=chars.length()){
                Map<Character, Integer> freq = new HashMap<>(charsFreq);
                sumOfLengths += lenOfGoodStr(word, freq);
            }
        }
        return sumOfLengths;
    }

    public static int lenOfGoodStr(String word, Map<Character, Integer> freq){
        for(int i=0;i<word.length();i++){
            if(freq.containsKey(word.charAt(i))){
                if(freq.get(word.charAt(i))>1)
                    freq.put(word.charAt(i), freq.get(word.charAt(i))-1);
                else
                    freq.remove(word.charAt(i));
            }
            else
                return 0;
        }
        return word.length();
    }

}
