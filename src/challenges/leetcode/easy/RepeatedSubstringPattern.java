package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/repeated-substring-pattern/description/
 * Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies
 * of the substring together.
 * Example : Input : s = "abab", Output = true as there are substring ab twice
 */
public class RepeatedSubstringPattern {
	
	public static void main(String args[]) {
		String s = "abcabcabcabc";
		System.out.println(repeatedSubstringPattern(s));
	}
	
	public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        boolean flag = true;
        for(int i=1;i<=n/2;i++){
            if(n%i!=0)
                continue;
            flag = true;
            String s1 = s.substring(0,i);
            for(int j=i;j<=n-i;j+=i){
                if(!s1.equals(s.substring(j, j+i))){
                    flag = false;
                    break;
                }
                
            }
            if(flag)
                return true;
        }
        return false;
    }

}
