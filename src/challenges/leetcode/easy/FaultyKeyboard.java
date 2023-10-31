package challenges.leetcode.easy;

public class FaultyKeyboard {
	
	public static void main(String args[]) {
		String s = "poiinter";
		System.out.println(finalString(s));
	}
	
	public static String finalString(String s) {
        String res = "";
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

}
