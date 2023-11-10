package challenges.leetcode.medium;

/*
 * https://leetcode.com/problems/find-the-substring-with-maximum-cost/submissions/
 * 
 * ou are given a string s, a string chars of distinct characters and an integer array vals
 * of the same length as chars. The cost of the substring is the sum of the values of each
 * character in the substring. The cost of an empty string is considered 0.
 * The value of the character is the vals[i] for the ith character in chars, if a character
 * is not in chars, then its value will be the alphabet number (i.e a -> 1, b -> 2 etc)
 * 
 * for the input as => s = "adaa", chars = d, vals = [-1000] as the vals.length == chars.length()
 * the max cost of substring (here "aa") will be 2
 */
public class MaxCostSubstring {

	public static void main(String[] args) {
		String s = "kqqqqqkkkq";
		String chars = "kq";
		int[] vals = {-6,6};
		
		System.out.println(maxCostSubstring(s, chars, vals));
	}
	
	public static int maxCostSubstring(String s, String chars, int[] vals) {
		int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            int c = 0;
            int index = chars.indexOf(s.charAt(i));
            if(index>=0)
                c = vals[index];
            else
                c = s.charAt(i)-96;
            arr[i] = c;
        }
        int max = -1000;
        int prevSum = 0, sum = 0;
        boolean flag = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0 && flag){
                flag = false;
                if(sum>max)
                    max = sum;
                prevSum = sum;
                sum = 0;
            }
            if(arr[i]>0 && !flag){
                flag = true;
                if(prevSum+sum>0)
                    sum+= prevSum;
                else
                    sum = 0;

            }
            sum += arr[i];
            if(sum>max)
                max = sum;
        }
        return max;
	}

}
