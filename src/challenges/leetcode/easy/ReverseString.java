package challenges.leetcode.easy;

public class ReverseString {
	
	public static void main(String args[]) {
		String s = "Let's take LeetCode contest";
		
		System.out.println(reverseWordsUsingSplit(s));
		
		System.out.println(reverseWordsBasicApproach(s));
		
	}
	
	public static String reverseWordsUsingSplit(String s) {
		 String res = "";
         String[] words = s.split(" ");
         for(int j=0;j<words.length;j++){
             for(int i = words[j].length()-1;i>=0;i--)
                 res+= words[j].charAt(i);
             if(j<words.length-1)
                 res+= " ";
         }
         return res;    
	}
	
	public static String reverseWordsBasicApproach(String s) {
		String res = "";
		int lastCharIndex = 0;
        int i = 0;
        for(i = 0;i< s.length(); i++){
            if(s.charAt(i)==' '){
                for(int j = i-1; j >=lastCharIndex; j--)
                    res += s.charAt(j);  
                res += " ";
                lastCharIndex = i+1;
            }
        }
        for(int j = i-1;j >= lastCharIndex; j--)
            res += s.charAt(j);
        return res;
	}
	
	

}
