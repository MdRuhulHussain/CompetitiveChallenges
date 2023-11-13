package challenges.geekForgeeks.medium;

/*
 * Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one
 * number) which has the maximum sum and return its sum.
 * input = {1,2,3,-2,5}, output = 9, input = {-1,-2,-3,-4} : output = -2
 * input = {-43, 77, 29, -22, 83};, output = 
 */
public class KadanesAlgorithm {
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,-2,5};
		//{-1,-2,-3,-4}
		//{-43, 77, 29, -22, 83};
		System.out.println(maxContagiousSum(arr));
	}
	
	public static long maxContagiousSum(int[] arr) {
		long max = Long.MIN_VALUE;
        long sum = arr[0];
        long prevSum = arr[0];
        boolean flag = true;
        if(sum<0)
            flag = false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0 && flag){
                if(sum>max)
                    max = sum;
                prevSum = sum;
                flag = false;
                sum = 0;
            }
            if(arr[i]>0 && !flag){
                flag = true;
                if(sum+prevSum>0)
                    sum+=prevSum;
                else
                    sum = 0;
            }
            sum+=arr[i];
            if(sum>max)
                max = sum;
        }
        if(max<0){
            for(int num : arr){
                if(num>max)
                    max = num;
            }
        }
        return max;
	}

}
