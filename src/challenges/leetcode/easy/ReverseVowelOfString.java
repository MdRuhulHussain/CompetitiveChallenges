package challenges.leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class ReverseVowelOfString {

	public static void main(String[] args) {
		String s = "hello"; //the output should be "holle"
		String s2 = "leetcode"; //leotcede
		
		System.out.println(reverseVowels(s2));
	}
	
	    public static String reverseVowels(String s) {
	    	
	    	char[] arr = s.toCharArray();
	        int i = 0, j = arr.length-1;
	        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
	        boolean flagI = false;
	        boolean flagJ = false;
	        char temp;
	        while(i<j){
	            if(!flagI && vowels.indexOf(arr[i])>=0){
	                flagI = true;
	            }
	            if(!flagJ && vowels.indexOf(arr[j])>=0){
	                flagJ = true;
	            }
	            if(flagI && flagJ){
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
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
	        return String.valueOf(arr);

	}
	    
	    

}
