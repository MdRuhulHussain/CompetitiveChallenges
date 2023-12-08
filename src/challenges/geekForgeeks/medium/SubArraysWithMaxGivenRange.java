package challenges.geekForgeeks.medium;

/*
 * Given an array of N elements and L and R, print the number of sub-arrays such that the 
 * value of the maximum array element in that subarray is at least L and at most R.
 * e.g. a[] = {2,0,11,3,0}, L=1, R=10. The output = 4. explaination below - 
 * The possible sub arrays have max in Range 1 and 10 are - {2},{2,0},{3},{3,0}.
 * e.g. a[] = {3,4,1}, L=2, R=4. The output = 5. explaination below - 
 * The possible sub arrays have max in range 2 and 4 are - {3},{4},{3,4},{3,4,1},{4,1}
 */
public class SubArraysWithMaxGivenRange {
	
	public static void main(String args[]) {
		int[] a = {1,1,3,1,1,2,3};
		int L = 3, R = 3;
		System.out.println(countSubArrays(a, a.length, L, R));
	}
	
	public static long countSubArrays(int[] a, int n, int L, int R) {
		int startSubArrIndex = -1, endSubArrIndex =-1;
        long count =0L;
        for(int i=0;i<n;i++){
            if(a[i]>R){
                startSubArrIndex = i;
                endSubArrIndex = i;
                continue;
            }
            if(a[i]>=L){
                endSubArrIndex = i;
            } 
            count += (endSubArrIndex-startSubArrIndex);
        }
        return count;
	}

}
