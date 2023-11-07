package challenges.leetcode.easy;

/*
 * program to count the elements of array which has strictly lesser and greater element.
 * eg1 : in the array {3,-3,3,7}, There are two elements(3 and 3) which have strictly lesser and
 * greater elements.
 * eg2 : in the array {5,2,19,8,7}, There are three elements(5,7,8) which have strictly lesser
 * and greater elements.
 */
public class CountElementsOfArray {
	
	public static void main(String args[]) {
		int[] nums = {-3,3,3,8,15,4,2,19,9};
		System.out.println(countElements(nums));
	}
	
	public static int countElements(int[] nums) {
		int count = 0;
        for(int i=0;i<nums.length;i++){
            boolean flagSmaller = false;
            boolean flagGreater = false;
            for(int j=0;j<nums.length;j++){
                if(i==j)
                    continue;
                if(nums[i]<nums[j]){
                    flagSmaller = true;
                } else if(nums[i]>nums[j]){
                    flagGreater = true;
                }
                if(flagSmaller && flagGreater){
                    count++;
                    break;
                }
                
            }
            
        }
        return count;
	}

}
