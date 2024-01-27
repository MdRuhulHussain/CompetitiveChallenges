package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different 
 * order. The order of the alphabet is some permutation of lowercase letters.
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and 
 * only if the given words are sorted lexicographically in this alien language.
 * Example : Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"; Output : true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 */
public class VerifyingAlienDictionary {
	
	public static void main(String args[]) {
		String[] words = {"word", "words", "world","row"};
		String order = "worldabcefghijkmnpqstuvxyz";
		System.out.println(isAlienSorted(words, order));
	}
	
	public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();
        for(int i=0;i<order.length();i++){
            orderMap.put(order.charAt(i), i);
        }
        for(int i=0;i<words.length-1;i++){
            boolean notLessFlag = false;
            int j=0;
            for(;j<words[i].length();j++){
                if(j>=words[i].length() || j>=words[i+1].length())
                    break;
                int valC1 = orderMap.get(words[i].charAt(j));
                int valC2 = orderMap.get(words[i+1].charAt(j));
                if(valC1>valC2)
                    return false;
                else if(valC1<valC2){
                    notLessFlag = true;
                    break;
                }
                else
                    continue;
            }
            if(!notLessFlag){
                if(words[i+1].length()<words[i].length())
                    return false;
            }
        }
        return true;
    }

}
