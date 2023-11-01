package challenges.leetcode.easy;

/*
 * Reverse or swap only the alphabet characters small and capital cases found in string.
 * for example if input = "ab-cd" the output should be "dc-ba"
 * for input = "a-bC-dEf-ghIj" the output should be "j-Ih-gfE-dCba"
 */
public class ReverseOnlyLetters {
	
	public static void main(String args[]) {
		String s = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(s));
	}
	
	public static String reverseOnlyLetters(String s) {
		char[] chars = s.toCharArray();
        int i = 0, j = chars.length-1;
        boolean flagI = false;
        boolean flagJ = false;
        while(i<j){
            char c1 = chars[i];
            char c2 = chars[j];
            if(!flagI && (c1 > 64 && c1 < 91) || (c1 > 96 && c1 < 123)){
                flagI = true;
            }
            if(!flagJ && (c2 > 64 && c2 < 91) || (c2 > 96 && c2 < 123)){
                flagJ = true;
            } 
            if(flagI && flagJ){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                flagI = false;
                flagJ = false;
                i++;
                j--;
            }
            else if(!flagI)
                i++;
            else if(!flagJ)
                j--;
        }
        return String.valueOf(chars);
	}

}
