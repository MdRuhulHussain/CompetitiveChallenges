package challenges.leetcode.easy;

/*
 * There's a faulty keyboard, which reverses the typed string when the letter i is typed.
 * for example if the user type string as "string", the typed values will be "rtsng"
 */
public class FaultyKeyboard {
	
	public static void main(String args[]) {
		String s = "poiinter";
		System.out.println(finalString(s));
		System.out.println(finalStringWithoutInnerLoop(s));
	}
	
	public static String finalString(String s) {
        String res = "";
        StringBuilder rev = new StringBuilder("");
        rev.append("abc");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'i'){
                String temp = "";
                for(int j=res.length()-1; j>=0;j--)
                    temp += res.charAt(j);
                res = temp;
            } else
                res += s.charAt(i);
        }
        return res;
    }
	
	public static String finalStringWithoutInnerLoop(String s) {
		StringBuilder res = new StringBuilder("");
        StringBuilder rev = new StringBuilder("");
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                StringBuilder temp = new StringBuilder(res);
                res = rev;
                rev = temp;
            }
            else {
                res.append(s.charAt(i));
                rev.insert(0, s.charAt(i));
            }
        }
        return res.toString();
    }

}
