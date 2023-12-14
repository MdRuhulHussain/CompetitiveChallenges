package challenges.hackerRank.easy;

/*
 * Given an array of size n containing all elements occur twince except one. Find that lonely no.
 * e.g Input = {1,2,3,4,3,2,1} ; Output = 4;
 */
public class LonelyNumberOrSingleNumber {
	
	public static void main(String args[]) {
		int[] a = {7,2,6,9,6,9,7};
		System.out.println(getLonelyNumber(a));
	}
	
	public static int getLonelyNumber(int[] a) {
		int singleNum = 0;
        for(int num : a){
            singleNum = singleNum ^ num;
        }
        return singleNum;
	}

}
