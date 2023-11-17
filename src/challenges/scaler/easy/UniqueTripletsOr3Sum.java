package challenges.scaler.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueTripletsOr3Sum {
	
	public static void main(String args[]) {
		int[] arr = {7,-6,3,8,-1,8,-11};
		int target = 0;
		List<int[]> res = getUniqueTriplets(arr, target);
		
		for(int i=0;i<res.size();i++) {
			int[] triplet = res.get(i);
			for(int n : triplet)
				System.out.print(n+" , ");
			System.out.println();
		}
//		res.forEach(x -> {
//			for(int n : x)
//				System.out.print(n+" , ");
//		});
	}
	
	public static List<int[]> getUniqueTriplets(int[] arr, int target) {
		
		Arrays.sort(arr);
		List<int[]> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int[] triplet = new int[3];
			int numToFound = target - arr[i];
			int j=i+1, k=arr.length-1;
			while(j<k) {
				if(arr[j]+arr[k]==numToFound) {
					triplet[0] = arr[i];
					triplet[1] = arr[j];
					triplet[2] = arr[k];
					ans.add(triplet);
					j++;
					k--;
					//ignoring the duplicates as we need to get only unique triplets
					while(j<k && arr[j]==arr[j+1]) j++;
					while(j<k && arr[k]==arr[k-1]) k--;
				}
				else if(arr[j]+arr[k]<numToFound)
					j++;
				else if(arr[j]+arr[k]>numToFound)
					k--;
			}
		}
		
		return ans;
	}

}
