package challenges.leetcode.easy;

/*
 * You are given a string s consisting of lowercase English letters, and an integer k.
 * First, convert s into an integer by replacing each letter with its position in the 
 * alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the 
 * integer by replacing it with the sum of its digits. Repeat the transform operation k times
 *  in total
 *  For example, if s = "zbax" and k = 2, then the resulting integer would be 8, see illustration below
 *  zbax => (26)(2)(1)(24) => 2+6+2+1+2+4 => 17 => 1+7 => 8
 *  example2 if s = "iiii" and k = 1, then the resulting integer would be 36, 
 *  iiii => (9)(9)(9)(9) => 9+9+9+9 => 36
 */
public class SumOfDigitsOfString {
	
	public static void main(String args[]) {
		String s = "zbax";
		int k = 2;
		System.out.println(sumOfDigitsInString(s, k));
	}
	
	public static int sumOfDigitsInString(String s, int k) {
		StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i)-96;
            sb.append(c);
        }
        int sum = 0;
        String str = sb.toString();
        while(k>0){
            sum = 0;
            for(int i=0;i<str.length();i++){
                sum+= str.charAt(i)-48;
            }
            k--;
            str = String.valueOf(sum);
        }
        return sum;
	}

}
