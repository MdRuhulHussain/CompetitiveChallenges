package challenges.leetcode.easy;

/*
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be 
 * represented as a string s of length n where: s[i] == 'I' if perm[i] < perm[i + 1], and
 * s[i] == 'D' if perm[i] > perm[i + 1].
 * Explaination : for D, start from the length of the string and do decreament on occurence of D.
 * for I, start from 0 and do increament on occurence of I
 * e.g. Input = IIDI => The output = {0,1,4,2,3}
 * e.g. Input = DDDIID => The output = {6,5,4,0,1,3,2}
 */
public class DIStringMatch {
	
	public static void main(String args[]) {
		int[] res = diStringMatch("DIIDI");
		for(int num : res)
			System.out.print(num+" ");
	}
	
	public static int[] diStringMatch(String s) {
        int i=0, d=s.length();
        int[] res = new int[d+1];
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='D'){
                res[j] = d;
                d--;
            }else{
                res[j] = i;
                i++;
            }
        }
        if(s.charAt(s.length()-1)=='D')
            res[s.length()] = d;
        else
            res[s.length()] = i;
        return res;
    }

}
