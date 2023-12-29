package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/find-resultant-array-after-removing-anagrams/description/
 * You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.In one
 * operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams,
 * and delete words[i] from words. Keep performing this operation as long as you can select an index that 
 * satisfies the conditions.
 * Return words after performing all operations. It can be shown that selecting the indices for each 
 * operation in any arbitrary order will lead to the same result.
 * Example Input : arr = {"abba","baba","bbaa","cd","cd"}, Output = {"abba", "cd"}
 * 
 * Explaination : One of the ways we can obtain the resultant array is by using the following operations:
- Since words[2] = "bbaa" and words[1] = "baba" are anagrams, we choose index 2 and delete words[2].
  Now words = ["abba","baba","cd","cd"].
- Since words[1] = "baba" and words[0] = "abba" are anagrams, we choose index 1 and delete words[1].
  Now words = ["abba","cd","cd"].
- Since words[2] = "cd" and words[1] = "cd" are anagrams, we choose index 2 and delete words[2].
  Now words = ["abba","cd"].
We can no longer perform any operations, so ["abba","cd"] is the final answer.
 */
public class RemoveAnagrams {
	
	public static void main(String args[]) {
		String[] words = {"abba","babaa","bbaa","cd","cd"};
		List<String> res = removeAnagrams(words);
		for(String word : res) {
			System.out.print(word+" ");
		}
	}
	
	public static List<String> removeAnagrams(String[] words) {

        List<String> res = new ArrayList<>();
        for(String word : words){
            res.add(word);
        }
            
        for(int i=0;i<res.size()-1;){
            if(res.get(i).length()==res.get(i+1).length()){
                char[] wordi = res.get(i).toCharArray();
                char[] wordj = res.get(i+1).toCharArray();
                Arrays.sort(wordi);
                Arrays.sort(wordj);
                if(String.valueOf(wordi).equals(String.valueOf(wordj)))
                    res.remove(i+1);
                else
                    i++;
            }
            else
                i++;
        }
        return res;
    }

}
