package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/percentage-of-letter-in-string/description/
 * Given a string s and a character letter, return the percentage of characters in s that equal letter 
 * rounded down to the nearest whole percent.
 * Example - Input : s = "foobar", letter = 'o'. Output = 33%
 */
public class PercentageOfLetter {
	
	public static void main(String args[]) {
		String s = "bookworm";
		System.out.println(percentageLetter(s, 'o'));
	}
	
	public static int percentageLetter(String s, char letter) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter)
                count++;
        }
        int percent = count*100/s.length();
        return percent;
    }

}
