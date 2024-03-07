package challenges.leetcode.easy;

/*
 * You are given a binary string s that contains at least one '1'. You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
 * Return a string representing the maximum odd binary number that can be created from the given combination.
 * Note that the resulting string can have leading zeros.
 * Example 1: Input: s = "010"; Output: "001"
 * Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
 * Example 2: Input: s = "0101"; Output: "1001"
 * Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".
 */
public class MaximumOddBinaryNumber {
	
	public static void main(String args[]) {
		String s = "01000110100";
		System.out.println(maximumOddBinaryNumber(s));
	}
	
	 public static String maximumOddBinaryNumber(String s) {
		 //This solution beats 74% of java users in time complexity and 98% java users in space complexity
         StringBuilder res = new StringBuilder("");
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='1')
                 res.append('1');
         }
         int countOf0 = s.length()-res.length();
         res.deleteCharAt(res.length()-1);
         while(countOf0>0){
             res.append('0');
             countOf0--;
         }
         res.append('1');
         return res.toString();
     }

}
