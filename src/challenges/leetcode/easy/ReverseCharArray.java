package challenges.leetcode.easy;

/*
 * Reversing the character array elements with two ways
 * 1. Naive Approach - Taking an extra array and storing the elements of the given array in reverse order
 * in this new array (time complexity : O(n), also it needs extra space as we are creating new array
 * 
 * 2. Optimized Approach - altering the elements of the given array within that array by taking from 
 * start and end index of array (time complexity : O(n/2), also there's no extra array creation
 */
public class ReverseCharArray {
	
	public static void main(String args[]) {
		char[] s = {'h', 'e', 'l', 'l','o'};
		
		char[] res = reverseArrayNaiveApproach(s);
		for(char c : res)
			System.out.print(c+" ");
		
		System.out.println();
		
		reverseCharArrayOptimizedApproach(s);
		for(char c: s)
			System.out.print(c+" ");
	}
	
	public static char[] reverseArrayNaiveApproach(char[] s) {
		char[] arr = new char[s.length];
		String.valueOf(arr);
		int j = 0;
		for(int i = s.length-1; i>=0;i--) {
			arr[j] = s[i];
			j++;
		}
		
		return arr;
	}
	
	public static void reverseCharArrayOptimizedApproach(char[] s) {
        int i =0, j = s.length-1;
        char temp;
        while(i<j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }

}
