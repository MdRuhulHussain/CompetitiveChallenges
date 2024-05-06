package challenges.geekForgeeks.easy;

/*
 * Given an array of N strings, find the longest common prefix among all strings present in the array.
 * Example 1: Input: N = 4, arr[] = {geeksforgeeks, geeks, geek, geezer}; Output: gee
 * Explanation: "gee" is the longest common prefix in all the given strings.
 * Example 2: Input: N = 2, arr[] = {hello, world}; Output: -1
 * Explanation: There's no common prefix in the given strings.
 */
public class LongestCommonPrefixInArr {
	
	public static void main(String args[]) {
		String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(longestCommonPrefix(arr, arr.length));
	}
	
	static String longestCommonPrefix(String arr[], int n){
        // code here
        String output = "";
        for(int i=0;i<arr[0].length();i++){
            char c = arr[0].charAt(i);
            boolean flag = true;
            for(int j=1;j<arr.length;j++){
                if(i<arr[j].length()){
                    if(arr[j].charAt(i)!=c){
                        flag = false;
                        break;
                    }
                } else
                    flag = false;
            }
            if(!flag)
                break;
            else
                output += c;
        }
        if(output.equals(""))
            return "-1";
        return output;
    }

}
