package challenges.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x
 * in the array. The result should also be sorted in ascending order.
 * An integer a is closer to x than an integer b if:
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a < b
 * e.g. Input : arr = {1,2,3,4,5}, k=4, x=3, then the output will be {1,2,3,4}
 * Input : arr = {1,2,3,4}, k=3, x = -1, then the output will be {1,2,3}
 *
 */
public class KClosestElements {
	
	public static void main(String args[]) {
		int[] arr = {1,1,2,3,3,3,4,6,8,8};
		int k = 6, x = 1;
		List<Integer> output = findClosestElements(arr, k, x);
		output.forEach(y -> System.out.print(y+" "));
	}
	
	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int z = 0, y = -1;
        boolean flag = false;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x){
                if(arr[i]==x){
                    flag = true;
                    y=0;
                }
                z=i-1;
                y=y+i+1;
                break;
            }
        }
        
        if(x<=arr[0]){
            for(int i=0;i<k;i++)
                li.add(arr[i]);
        }
        else if(x>=arr[arr.length-1]){
            for(int i=arr.length-k;i<arr.length;i++)
                li.add(arr[i]);
        }
        else {
            if(flag){
                li.add(x);
                k--;
            }
            while(k>0){
                if(z<0){
                    li.add(arr[y]);
                    y++;
                }
                else if(y>=arr.length){
                    li.add(arr[z]);
                    z--;
                }
                else if(Math.abs(x-arr[z])<=Math.abs(arr[y]-x)){
                    li.add(arr[z]);
                    z--;
                } else{
                    li.add(arr[y]);
                    y++;
                }
                k--;
            }
            Collections.sort(li);
        }
        return li;
    }

}
