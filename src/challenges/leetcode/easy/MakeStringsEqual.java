package challenges.leetcode.easy;

/*
 * Make String equals leetcode easy
 */
public class MakeStringsEqual {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "cdab";
		System.out.println(makeStringEqual(s1, s2));

	}
	
	public static boolean makeStringEqual(String s1, String s2) {
		if(s1.equals(s2))
            return true;
        int[][] arr = {{0,2},{1,3}};
        char[] temp = s1.toCharArray();
        for(int x=0;x<2;x++){
        for(int i=0;i<arr.length;i++){
            char tempChar = temp[arr[i][0]];
            temp[arr[i][0]] = temp[arr[i][1]];
            temp[arr[i][1]] = tempChar;
            if(String.valueOf(temp).equals(s2))
                return true;
        }
        }
        temp = s2.toCharArray();
        for(int x=0;x<2;x++){
        for(int i=0;i<arr.length;i++){
            char tempChar = temp[arr[i][0]];
            temp[arr[i][0]] = temp[arr[i][1]];
            temp[arr[i][1]] = tempChar;
            if(String.valueOf(temp).equals(s1))
                return true;
        }
        }
        return false;
	}

}
