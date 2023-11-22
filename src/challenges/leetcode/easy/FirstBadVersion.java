package challenges.leetcode.easy;

public class FirstBadVersion {
	
	public static void main(String args[]) {
		System.out.println(firstBadVersion(5));
	}
	
	public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start<end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid))
                end = mid;
            else
                start = mid+1;
        }
        return start;
        
    }
	
	public static boolean isBadVersion(int version) {
		//some api returning if version is bad or not, for now I'm just returning true
		//leetcode infra has the method definition returning isBadVersion bool value correctly
		return true;
	}

}
