package challenges.leetcode.easy;

public class DigitSumOfString {
	
	public static void main(String args[]) {
		String s = "11111222223";
		int k = 3;
		System.out.println(calDigitSumOfString(s, k));
	}
	
	public static String calDigitSumOfString(String s, int k) {
        while(s.length() > k){
            String temp = "";
            int sum = 0;
            for(int i = 0;i<s.length();i++){
            	sum += s.charAt(i) - '0';
                if((i+1)%k==0 || i == s.length()-1){
                    temp += sum;
                    sum = 0;
                } 
                
            }
            s = temp;
        }
        return s;
	}

}
