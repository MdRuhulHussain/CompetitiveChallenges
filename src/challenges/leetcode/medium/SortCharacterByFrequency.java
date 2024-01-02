package challenges.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * https://leetcode.com/problems/sort-characters-by-frequency/description/
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a 
 * character is the number of times it appears in the string. Return the sorted string. If there are multiple
 * answers, return any of them.
 * Example, Input : s = "cccaaa". Output = "aaaccc" or "cccaaa".
 * Input : s = "tree". Output = "eert" or "eetr"
 */
public class SortCharacterByFrequency {
	
	public static void main(String args[]) {
		String s = "Aabb";
		System.out.println(frequencySort(s));
	}
	
	public static String frequencySort(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(charFrequencies.containsKey(s.charAt(i)))
                charFrequencies.put(s.charAt(i), charFrequencies.get(s.charAt(i))+1);
            else
                charFrequencies.put(s.charAt(i), 1);
        }

        HashMap<Character, Integer> temp = charFrequencies.entrySet().stream().sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

    String res = "";
    for(Map.Entry<Character, Integer> ev : temp.entrySet()) {
        char c = ev.getKey();
        for(int i=0;i<ev.getValue();i++)
            res = c+res;
    }
    return res;

    }

}
