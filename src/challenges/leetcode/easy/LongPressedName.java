package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/long-pressed-name/description/
 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get 
 * long pressed, and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends 
 * name, with some characters (possibly none) being long pressed.
 * Example, Input : name = "alex", typed = "aaleex".
 * Output : true. Explanation: 'a' and 'e' in 'alex' were long pressed.
 */
public class LongPressedName {
	
	public static void main(String args[]) {
		String name = "saeed";
		String typed = "ssaaedd";
		
		System.out.println(isLongPressedName(name, typed));
	}
	
	public static boolean isLongPressedName(String name, String typed) {
        if(typed.length()<name.length())
            return false;
        int j = 0, i=0;
        for(i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(j < typed.length() && typed.charAt(j)==c){
                for(j=j+1;j<typed.length();){
                    if(typed.charAt(j)==c){
                        if(i+1<name.length() && typed.charAt(j)==name.charAt(i+1))
                            i++;
                        j++;
                    }
                    else
                        break;
                }
            }
            else
                return false;
        }
        if(i!= name.length() || j!=typed.length())
            return false;
        return true;
    }

}
