package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 * Input: s1 = "this apple is sweet", s2 = "this apple is sour"
 * Output: ["sweet","sour"]
 */
public class UnCommonWords {
	
	public static void main(String args[]) {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";
		String[] res = uncommonFromSentences(s1,s2);
		for(String word : res)
			System.out.print(word+" ");
	}
	
	public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordsFreq = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        int max = words1.length>words2.length?words1.length:words2.length;
        List<String> res = new ArrayList<>();
        for(int i=0;i<max;i++){
            if(i<words1.length){
                if(wordsFreq.containsKey(words1[i]))
                    wordsFreq.put(words1[i], wordsFreq.get(words1[i])+1);
                else
                    wordsFreq.put(words1[i], 1);
            }
            if(i<words2.length){
                if(wordsFreq.containsKey(words2[i]))
                    wordsFreq.put(words2[i], wordsFreq.get(words2[i])+1);
                else
                    wordsFreq.put(words2[i], 1);
            }
        }
        for(String key : wordsFreq.keySet()){
            if(wordsFreq.get(key)==1)
                res.add(key);
        }
//        String[] resArr = res.toArray(resArr[res.size()]);
        return res.toArray(String[]::new);

    }

}
