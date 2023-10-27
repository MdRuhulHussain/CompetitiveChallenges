package challenges.leetcode.easy;

/*
 * Reverse the words of a string for example the string=> "Let's take LeetCode contest"
 * needs to returned as "s'teL ekat edoCteeL tsetnoc"
 * Three solutions are given below - using split method, using loop by iterating through characters
 * and the optimized solution is by optimizing the running of internal loop
 */
public class ReverseString {
	
	public static void main(String args[]) {
		String s = "Let's take LeetCode contest";
		
		System.out.println(reverseWordsUsingSplit(s));
		
		System.out.println(reverseWordsBasicApproach(s));
		
		System.out.println(reverseWordsOptimizedApproach(s));
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
	
	public static String reverseWordsOptimizedApproach(String s) {
		String res = "";
		char[] arr = s.toCharArray();
        int lastCharIndex = 0;
        int i =0;
        for(i = 0; i< arr.length; i++){
            if(arr[i] == ' '){
                int j = i-1;
                while(j>lastCharIndex){
                    char temp = arr[j];
                    arr[j] = arr[lastCharIndex];
                    arr[lastCharIndex] = temp;
                    j--;
                    lastCharIndex++;
                }
                lastCharIndex = i+1;

            }
        }
        int j = i-1;
        while(j>lastCharIndex){
            char temp = arr[j];
            arr[j] = arr[lastCharIndex];
            arr[lastCharIndex] = temp;
            j--;
            lastCharIndex++;
        }
        res = String.valueOf(arr);
        return res;
	}

}
