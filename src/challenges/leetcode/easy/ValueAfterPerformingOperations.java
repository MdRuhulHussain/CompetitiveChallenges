package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 * Given an array of strings operations containing a list of operations, return the final value of X after 
 * performing all the operations. Initially the value of X = 0
 * The operations is an string containing only -> X++, ++X, X--, --X which does +1 and -1
 * Example, Input : operations = {"--X","X++","X++"}. Output = 1
 */
public class ValueAfterPerformingOperations {
	
	public static void main(String args[]) {
		String[] operations = {"X++", "++X", "--X", "X--", "++X"};
		System.out.println(finalValueAfterOperations(operations));
	}
	
	public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(String str : operations){
            if(str.charAt(0)=='-' || str.charAt(2)=='-')
                count--;
            else if(str.charAt(0)=='+' || str.charAt(2)=='+')
                count++;
        }
        return count;
    }

}
