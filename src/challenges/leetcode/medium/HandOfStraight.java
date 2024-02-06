package challenges.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of 
 * size groupSize, and consists of groupSize consecutive cards.
 * Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize,
 * return true if she can rearrange the cards, or false otherwise.
 * Example 1 : Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3; Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
 * Example 2 : Input: hand = [1,2,3,4,5], groupSize = 4; Output: false
 * Explanation: Alice's hand can not be rearranged into groups of 4.
 */
public class HandOfStraight {
	
	public static void main(String args[]) {
		int[] hand = {9,13,15,23,22,25,4,4,29,15,8,23,12,19,24,17,18,11,22,24,17,17,10,23,21,18,14,18,7,6,3,
				6,19,11,16,11,12,13,8,26,17,20,13,19,22,21,27,9,20,15,20,27,8,13,25,23,22,15,9,14,20,10,6,5,
				14,12,7,16,21,18};
		
//		int[] hand = {1,2,3,6,4,2,3,2,3,4,7,8};
		
		int groupSize = 10;
//		groupSize = 3;
		System.out.println(isNStraightHand(hand, groupSize));
		
	}
	
	public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)
            return false;
        Map<Integer, Integer> freq = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int n : hand){
            if(freq.containsKey(n))
                freq.put(n, freq.get(n)+1);
            else{
                freq.put(n, 1);
                if(n<min)
                    min = n;
            }
        }
        int groupCount = hand.length/groupSize;
//        System.out.println(hand.length+"--1--"+groupCount);
        while(groupCount>0){
            int start = min;
            int end = min+groupSize;
            boolean minFound = false;
//            System.out.println(min+"-----"+groupCount);
            while(start<end){
                if(!freq.containsKey(start))
                    return false;
                freq.put(start, freq.get(start)-1);
                if(freq.get(start)>0 && !minFound){
                    min = start;
                    minFound = true;
                } else if(freq.get(start)==0)
                    freq.remove(start);
                start++;
            }
//            System.out.println(start);
            groupCount--;
            if(!minFound && groupCount>0){
                start--;
                while(!minFound){
                    minFound = freq.containsKey(++start);
                }
                min = start;
            }
        }
        return true;
    }

}
