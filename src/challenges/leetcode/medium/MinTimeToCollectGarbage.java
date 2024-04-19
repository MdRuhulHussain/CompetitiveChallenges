package challenges.leetcode.medium;

public class MinTimeToCollectGarbage {
	
	public static void main(String args[]) {
		String[] garbage = {"GP","MGPPPMGGP","MM","GGGMPGG","M"};
		int[] travel = {3,1,5,3};
		System.out.println(garbageCollection(garbage, travel));
	}
	
	public static int garbageCollection(String[] garbage, int[] travel) {
        char[] trucks = {'P', 'G', 'M'};
        int totalTime = 0;
        int prevFound=0;
        int[] travels = new int[garbage.length];
        travels[0]=0;
        for(int i=1;i<travels.length;i++)
            travels[i]=travel[i-1]+travels[i-1];
        for(char truck : trucks){
            prevFound=0;
            for(int i=0;i<garbage.length;i++){
                String g = garbage[i];
                int iGCount=0;
                for(int j=0;j<g.length();j++){
                    if(g.charAt(j)==truck)
                        iGCount++;
                }
                if(iGCount>0)
                    totalTime += travels[i]-travels[prevFound];
                if(iGCount>0){
                    prevFound=i;
                    totalTime += iGCount;
                }
            }
        }
        return totalTime;
    }

}
