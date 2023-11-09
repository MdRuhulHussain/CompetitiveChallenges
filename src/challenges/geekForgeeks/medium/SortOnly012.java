package challenges.geekForgeeks.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Sort an array containing only 0s, 1s and 2s, without using any sorting algorithm.
 */
public class SortOnly012 {
	
	public static void main(String args[]) {
		int[] arr = {0,2,2,1,0};
		sort012(arr, arr.length);
		
		for(int num : arr)
			System.out.print(num+" ");
	}
	
	public static void sort012(int[] a, int n) {
		Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for(int i =0;i<a.length;i++){
            if(a[i]==0)
                map.put(0,map.get(0)+1);
            else if(a[i]==1)
                map.put(1,map.get(1)+1);
            else
                map.put(2,map.get(2)+1);
        }
        for(int i=0;i<n;i++){
            if(i<map.get(0))
                a[i] = 0;
            else if(i<map.get(0)+map.get(1))
                a[i] = 1;
            else
                a[i] = 2;
        }
	}

}
