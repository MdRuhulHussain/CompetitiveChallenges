package challenges.leetcode.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * You are given an integer array deck where deck[i] represents the number written on the ith card.
 * Partition the cards into one or more groups such that:
 * Each group has exactly x cards where x > 1, and
 * All the cards in one group have the same integer written on them.
 * Return true if such partition is possible, or false otherwise.
 * Example : Input: deck = [1,2,3,4,4,3,2,1]; Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
 */
public class XofAKindInADeckOfCards {
	
	public static void main(String args[]) {
		int[] deck = {1,1,1,1,2,2,2,2,2,2,3,3,3,3};
		System.out.println(hasGroupsSizeX(deck));
	}
	
	public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> cardGr = new HashMap<>();
        for(int cardNum : deck){
            if(cardGr.containsKey(cardNum))
                cardGr.put(cardNum, cardGr.get(cardNum)+1);
            else
                cardGr.put(cardNum, 1);
        }
        Iterator iterator = cardGr.keySet().iterator();
        int toMatch = cardGr.get(iterator.next());
        int currGrpCards = 0;
        while(iterator.hasNext()){
            currGrpCards = cardGr.get(iterator.next());
            if(currGrpCards<2)
                return false;
            if(currGrpCards!=toMatch){
                toMatch = gcd(currGrpCards, toMatch);
                if(toMatch==1)
                    return false;
            }
        }
        if(toMatch==1)
            return false;
        return true;     
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }

}
