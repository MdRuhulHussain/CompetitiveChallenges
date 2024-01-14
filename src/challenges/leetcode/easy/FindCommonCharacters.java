package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * https://leetcode.com/problems/find-common-characters/description/
 * Given a string array words, return an array of all characters that show up in all strings within the words 
 * (including duplicates). You may return the answer in any order.
 * Exmaple : Input: words = ["cool","lock","cook"]
 * Output = ["c", "o"]
 */
public class FindCommonCharacters {
	
	public static void main(String args[]) {
		String[] words = {"bella","label","roller"};
		List<String> res = commonChars(words);
		for(String c : res)
			System.out.print(c+" ");
	}
	
	public static List<String> commonChars(String[] words) {
        char[] alphabets = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<String> res = new ArrayList<>();
        for(char c : alphabets){
            int minC = Integer.MAX_VALUE;
            for(String word : words){
                int countC = 0;
                for(int i=0;i<word.length();i++){
                    if(word.charAt(i)==c)
                        countC++;
                }
                if(countC==0){
                    minC = countC;
                    break;
                }
                else if(countC<minC)
                    minC = countC;
            }
            for(int j=0;j<minC;j++)
                res.add(""+c);
        }
        return res;
    }

}
