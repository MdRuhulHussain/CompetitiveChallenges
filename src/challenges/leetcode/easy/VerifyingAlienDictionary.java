package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class VerifyingAlienDictionary {
	
	public static void main(String args[]) {
		String[] words = {"word","world","row"};
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
