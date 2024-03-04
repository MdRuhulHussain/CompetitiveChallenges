package challenges.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	
	public static void main(String args[]) {
		int[] candyType = {6,6,6,6,2,2};
		System.out.println(distributeCandies(candyType));
	}
	
	public static int distributeCandies(int[] candyType) {
        Set<Integer> candyTypes = new HashSet<>();
        int countType = 0, maxLimit = candyType.length/2;
        for(int candy : candyType){
            if(!candyTypes.contains(candy)){
                candyTypes.add(candy);
                countType++;
                if(countType==maxLimit)
                    break;
            }

        }
        return countType;
    }

}
