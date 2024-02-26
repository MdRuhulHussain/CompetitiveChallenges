package challenges.hackerRank.easy;

import java.util.ArrayList;
import java.util.List;

public class SumOfFactorsOfArrayElements {
	
	public static void main(String args[]) {
		int[] nums = {12, 25, 81, 29};
		List<Integer> sums = sumOfFactors(nums);
		for(int sum : sums)
			System.out.print(sum+" ");
	}
	
	public static List<Integer> sumOfFactors(int[] nums){
		List<Integer> res = new ArrayList<>();
		for(int num : nums) {
			int sum=0;
			for(int i=1;i*i<=num;i++) {
				if(num%i==0) {
					sum+=i;
					if(i!=num/i) 
						sum+=num/i;
				}
			}
			res.add(sum);
		}
		return res;
	}

}
