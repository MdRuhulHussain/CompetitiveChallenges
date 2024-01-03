package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/slowest-key/description/
 * A newly designed keypad was tested, where a tester pressed a sequence of n keys, one at a time. You are 
 * given a string keysPressed of length n, where keysPressed[i] was the ith key pressed in the testing 
 * sequence, and a sorted list releaseTimes, where releaseTimes[i] was the time the ith key was released. 
 * Both arrays are 0-indexed. The 0th key was pressed at the time 0, and every subsequent key was pressed at 
 * the exact time the previous key was released.
 * The tester wants to know the key of the keypress that had the longest duration. The ith keypress had a 
 * duration of releaseTimes[i] - releaseTimes[i - 1], and the 0th keypress had a duration of releaseTimes[0].
 * 
 * Return the key of the keypress that had the longest duration. If there are multiple such keypresses, 
 * return the lexicographically largest key of the keypresses.
 * 
 * Example - Input : releaseTimes = [9,29,49,50], keysPressed = "cbcd"
 * Output : c 
 * Note : For the above example, the release time for the letter b and the third letter c is 20, but c is
 * lexicographically larger than b, so the answer is c
 */
public class SlowestKey {
	
	public static void main(String args[]) {
		int[] releaseTimes = {12,23,36,46,62};
		String keysPressed = "spuda";
		System.out.println(slowestKey(releaseTimes, keysPressed));
	}
	
	public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char c = keysPressed.charAt(0);
        for(int i=1;i<releaseTimes.length;i++){
            if(releaseTimes[i]-releaseTimes[i-1]>=max){
                if(releaseTimes[i]-releaseTimes[i-1]==max){
                    if(keysPressed.charAt(i)>c)
                        c = keysPressed.charAt(i);
                }
                else
                    c = keysPressed.charAt(i);
                max = releaseTimes[i]-releaseTimes[i-1];
            }
        }
        return c;
    }

}
