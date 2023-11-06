package challenges.leetcode.easy.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

	public static void main(String[] args) {
		String s = "CONTEST IS COMING";
		List<String> result = printWordsVertically(s);
		result.forEach(x -> System.out.print(x+","));
	}
	
	public static List<String> printWordsVertically(String s){
		String[] words = s.split(" ");
        List<String> res = new ArrayList<>();
        int maxLen = 0;
        char c = 'a';
        for(String word : words){
            if(word.length()>maxLen){
                maxLen = word.length();
                c = word.charAt(maxLen-1);
            }
        }

        for(int i =0;i<maxLen;i++){
            StringBuilder curr = new StringBuilder("");
            boolean flag = true;
            for(int j = 0;j<words.length;j++){
                String word = words[j];
                if(i<word.length()){
                    curr.append(word.charAt(i));
                    if(i==maxLen-1 && j==words.length-1)
                        flag = false;
                }
                else if(flag)
                    curr.append(" ");
                    
            }
            res.add(curr.toString().replaceAll("\\s++$", ""));
        }
        return res;
	}

}
