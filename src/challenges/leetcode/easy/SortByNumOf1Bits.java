package challenges.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 * Return the array after sorting it.
 * Example 1: Input: arr = [0,1,2,3,4,5,6,7,8]; Output: [0,1,2,4,8,3,5,6,7]
 * Explantion: [0] is the only integer with 0 bits. [1,2,4,8] all have 1 bit. [3,5,6] have 2 bits. [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 * Example 2: Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]; Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
 */
public class SortByNumOf1Bits {
	
	public static void main(String args[]) {
		int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
		sortByBits(arr);
		for(int n : arr)
			System.out.print(n+" ");
	}
	
	public static int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        for(int num : arr){
            int temp = num;
            int count1Bit = 0;
            while(temp>0){
                if((temp & 1)==1)
                    count1Bit++;
                temp >>= 1;
            }
            if(myMap.containsKey(count1Bit)){
                myMap.get(count1Bit).add(num);
                myMap.put(count1Bit, myMap.get(count1Bit));
            }
            else{
                List<Integer> li = new ArrayList<>();
                li.add(num);
                myMap.put(count1Bit, li);
            }
        }
        List<Integer> sortedKeys = new ArrayList<>(myMap.keySet());
        Collections.sort(sortedKeys);
        int i =0;
        for(int key : sortedKeys){
            System.out.print(key+" ");
            List<Integer> vals = myMap.get(key);
            Collections.sort(vals);
            for(int val : vals){
                arr[i]=val;
                i++;
            }
        }
        return arr;   
    }

}
