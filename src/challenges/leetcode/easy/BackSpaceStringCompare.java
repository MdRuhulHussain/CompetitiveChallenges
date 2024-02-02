package challenges.leetcode.easy;

/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' 
 * means a backspace character. 
 * Note that after backspacing an empty text, the text will continue empty.
 * Example : Input: s = "ab#c", t = "ad#c"; Output: true
 * Explanation: Both s and t become "ac".
 * Example 2 : Input: s = "ab##", t = "c#d#"; Output : true
 * Example 3 : Input : s = "a#c", t = "b"; Output : false
 * 
 */
public class BackSpaceStringCompare {
	
	public static void main(String args[]) {
		String s = "bxj##tw";
		String t = "bxo#j##tw";
		System.out.println(backspaceCompare(s,t));
	}
	
	public static boolean backspaceCompare(String s, String t) {
        int backSpaceCount = 0;
        boolean backSpace = false;
        StringBuilder res1 = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                backSpaceCount++;
                backSpace = true;
            } else if(backSpace){
                backSpaceCount--;
                if(backSpaceCount==0)
                    backSpace = false;
            } else{
                res1.append(s.charAt(i));
            }
        }
        backSpace = false;
        backSpaceCount = 0;
        StringBuilder res2 = new StringBuilder("");
        for(int i=t.length()-1;i>=0;i--){
            if(t.charAt(i)=='#'){
                backSpaceCount++;
                backSpace = true;
            } else if(backSpace){
                backSpaceCount--;
                if(backSpaceCount==0)
                    backSpace = false;
            } else {
                res2.append(t.charAt(i));
            }
        }
        if(res1.toString().equals(res2.toString()))
            return true;
        return false;
    }

}
