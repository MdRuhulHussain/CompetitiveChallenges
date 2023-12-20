package challenges.hackerRank.easy;

/*
 * A pangram is a string that contains every letter of the alphabet. Given a sentence 
 * determine whether it is a pangram in the English alphabet. Ignore case. Return either 
 * pangram or not pangram as appropriate.
 * e.g Input = "The quick brown fox jumps over the lazy dog"
 * Output = pangram
 * Input = "Some random string"
 * Output = not pangram
 */
public class Pangrams {
	
	public static void main(String args[]) {
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(pangrams(s));
	}
	
	public static String pangrams(String s) {
		if(s.length()<26)
            return "not pangram";
        int[] alphabets = new int[26];
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                continue;
            alphabets[s.charAt(i)-97] = 1;   
        }
        
        for(int n : alphabets)
            if(n==0)
                return "not pangram";
        return "pangram";
	}

}
