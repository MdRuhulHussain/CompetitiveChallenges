package challenges.hackerRank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * For example, the square matrix  is shown below:
 * 1 2 3
 * 4 5 6    => for the given matrix, left-to-right diagonal = 1+5+9 = 15, right-to-left diagnal
 * 7 8 9      = 3+5+7 = 15, The absolute difference = 0
 */
public class DiagonalDifference {
	
	public static void main(String args[]) {
		
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> a1 = Arrays.asList(1,2,3);
		arr.add(a1);
		a1 = Arrays.asList(4,5,6);
		arr.add(a1);
		a1 = Arrays.asList(9,8,9);
		arr.add(a1);
		System.out.println(diagonalDifference(arr));
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	        int m = arr.size()-1;
	        long leftDiag = 0L, rightDiag = 0L;
	        for(int i=0;i<arr.size();i++){
	            leftDiag+=arr.get(i).get(i);
	            rightDiag+=arr.get(i).get(m-i);   
	        }
	        return (int)Math.abs(leftDiag-rightDiag);
	}

}
