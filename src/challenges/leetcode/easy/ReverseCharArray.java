package challenges.leetcode.easy;

public class ReverseCharArray {
	
	public static void main(String args[]) {
		char[] s = {'h', 'e', 'l', 'l','o'};
		
		char[] res = reverseArrayNaiveApproach(s);
		for(char c : res)
			System.out.print(c+" ");
	}
	
	public static char[] reverseArrayNaiveApproach(char[] s) {
		char[] arr = new char[s.length];
		int j = 0;
		for(int i = s.length-1; i>=0;i--) {
			arr[j] = s[i];
			j++;
		}
		
		return arr;
	}

}
