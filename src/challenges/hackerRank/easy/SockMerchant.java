package challenges.hackerRank.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the 
 * color of each sock, determine how many pairs of socks with matching colors there are.
 * e.g. Input = {1,2,1,2,1,3,2}. The output = 2 pairs (1 pair of 1 and 1 pair of 2)
 */
public class SockMerchant {
	
	public static void main(String args[]) {
		List<Integer> ar = Arrays.asList(10,20,20,10,10,30,50,10,20);
		System.out.println(countPairs(ar.size(), ar));
	}
	
	public static int countPairs(int n, List<Integer> ar) {
	    // Write your code here
	        Set<Integer> socks = new HashSet<>();
	        int pairs = 0;
	        for(int sock : ar){
	            if(socks.contains(sock)){
	                pairs++;
	                socks.remove(sock);
	            } else
	                socks.add(sock);
	        }
	        return pairs;
	    }

}
