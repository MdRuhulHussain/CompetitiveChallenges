package challenges.leetcode.easy;

/*
 * Reverse first k characters of string for every 2k characters. the input and output should be
 * input = "abcdefg" output = "bacdfeg"
 */
public class ReverseFirstKChars {

	public static void main(String[] args) {
		int k = 2;
		System.out.println(reverseFirstKChar("abcdefg", k));
	}
	
	public static String reverseFirstKChar(String s, int k) {
		int turn = k;
        int lastIndex = 0;
        String res = "";
        if(k>s.length()){
            for(int j = s.length()-1; j>=0;j--)
                res += s.charAt(j);
            return res;
        }
        while(turn <= s.length()){
            int j = (turn-1) < s.length() ? (turn-1) :s.length()-1;
            for(; j>=lastIndex; j--){
                res += s.charAt(j);
            }
            for(j=turn;j<(turn+k) && j<s.length(); j++){
                res += s.charAt(j);
            }
            lastIndex = j;
            turn = turn + 2*k;
            
        }
        if(lastIndex < s.length())
        {
            for(int j = s.length()-1; j>= lastIndex; j--)
                res += s.charAt(j);
        }
        return res;
	}

}