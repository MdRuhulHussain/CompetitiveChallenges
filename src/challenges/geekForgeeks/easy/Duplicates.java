package challenges.geekForgeeks.easy;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	
	public static void main(String args[]) {
		int[] arr = {2,3,1,2,3};
		List<Integer> res = duplicates(arr, arr.length);
		res.forEach(x-> System.out.print(x+" "));
	}
	
	public static List<Integer> duplicates(int[] arr, int n){
		int[] storeArr = new int[n];
        boolean flag = false;
        for(int num : arr){
            if(num==0){
                if(storeArr[num]==-1 || storeArr[num]==-2){
                    flag = true;
                    storeArr[num] = -2;
                }
                else
                    storeArr[num]= -1;
            }
            else if(storeArr[num]==0)
                storeArr[num] = num;
            else{
                flag = true;
                storeArr[num] = -2;
            }
            
                
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(!flag){
            result.add(-1);
            return result;
        }
        
        for(int i=0;i<n;i++){
            if(storeArr[i]==-2)
                result.add(i);
        }
        return result;
	}

}
