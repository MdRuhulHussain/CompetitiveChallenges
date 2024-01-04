package challenges.geekForgeeks.easy;

import java.util.ArrayList;

/*
 * Given a quadratic equation in the form ax2 + bx + c. Find its roots.
 * Note: Return the maximum root followed by the minimum root.
 * If roots are imaginary return List containing only -1, which will eventually print imaginary from main function
 */
public class RootsOfQuadraticEquation {
	
	public static void main(String args[]) {
		int a = 1, b = -7, c = 12;
		ArrayList<Integer> res = quadraticRoots(a,b,c);
		if(res.size()==1)
			System.out.println("Imaginary roots");
		else
			for(int root : res)
				System.out.print(root+" ");
	}
	
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int temp = b*b - 4*a*c;
        if(temp<0){
            res.add(-1);
            return res;
        }
            
        double d = Math.sqrt(temp);
        int root1 = (int)Math.floor((-b+d)/(2*a));
        int root2 = (int)Math.floor((-b-d)/(2*a));
        if(root1>root2){
            res.add(root1);
            res.add(root2);
        } else{
            res.add(root2);
            res.add(root1);
        }
        return res;
    }

}
