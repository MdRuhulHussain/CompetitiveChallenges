package challenges.leetcode.easy;

/*
 * Reversing or Swapping the vowels of a string, for e.g input = "hello" output = "holle" 
 * or input = "a." then the output = "a."
 * Two solutions are given below, both are of nearly same complexity, the first approach is a
 * little more optimized 
 */
import java.util.Arrays;
import java.util.List;

public class ReverseVowelOfString {

	public static void main(String[] args) {
		String s = "hello"; //the output should be "holle"
		String s2 = "leetcode"; //leotcede
		
		System.out.println(reverseVowels(s2));
		
		System.out.println(reverseVowelsApproach2("a."));
		
		System.out.println(reverseVowelsApproach2("!!!"));
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
	    
	    
	    public static String reverseVowelsApproach2(String s) {
	    	int i = 0, j = s.length()-1;
	        String resI = "", resJ = "";
	        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
	        boolean flagI = false, flagJ = false;
	        while(i<j){
	        	
	            if(!flagI && (vowels.indexOf(s.charAt(i)) < 0)){
	                resI += s.charAt(i);
	                i++;
	            } else {
	                flagI = true;
	            }

	            if(!flagJ && (vowels.indexOf(s.charAt(j)) < 0)){
	                resJ = s.charAt(j) + resJ;
	                j--;
	            } else
	                flagJ = true;

	            if(flagI && flagJ){
	                resI += s.charAt(j);
	                resJ = s.charAt(i)+resJ;
	                i++;
	                j--;
	                flagI = false;
	                flagJ = false;
	            }
	        }
	        if(i==j)
                resI += s.charAt(i);
	        else if(flagI)
	        	resI += s.charAt(i);
	        else if(flagJ)
	        	resJ = s.charAt(j)+resJ;
	        return resI+resJ;
	    }
	    
	    

}
