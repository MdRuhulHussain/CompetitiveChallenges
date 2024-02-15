package challenges.leetcode.easy;

/*
 * https://leetcode.com/problems/surface-area-of-3d-shapes/description/
 * You are given an n x n grid where you have placed some 1 x 1 x 1 cubes. Each value v = grid[i][j] 
 * represents a tower of v cubes placed on top of cell (i, j).
 * After placing these cubes, you have decided to glue any directly adjacent cubes to each other, forming 
 * several irregular 3D shapes.
 * Return the total surface area of the resulting shapes.
 * Note: The bottom face of each shape counts toward its surface area.
 * Example 1: Input: grid = [[1,2],[3,4]]; Output: 34
 * Example 2: Input: grid = [[1,1,1],[1,0,1],[1,1,1]]; Output: 32
 * Example 3: Input: grid = [[2,2,2],[2,1,2],[2,2,2]]; Output: 46
 */
public class SurfaceAreaOf3DShapes {
	
	public static void main(String args[]) {
		int[][] grid = {{2,2,2},{2,1,2},{2,2,2}};
		System.out.println(surfaceArea(grid));
	}
	
	public static int surfaceArea(int[][] grid) {
        int surfaceArea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0){
                    if(j!=0)
                        surfaceArea += Math.abs(grid[i][j]-grid[i][j-1]);
                    surfaceArea += grid[i][j];
                }
                else {
                    if(i==grid.length-1)
                        surfaceArea += grid[i][j];
                    if(j!=0)
                        surfaceArea += Math.abs(grid[i][j]-grid[i][j-1]);
                    surfaceArea += Math.abs(grid[i][j]-grid[i-1][j]);
                    
                }
                if(grid[i][j]!=0)
                    surfaceArea += 2;
            }
            surfaceArea += grid[i][0] + grid[i][grid[0].length-1];
        }
        if(grid.length==1)
            surfaceArea += grid[0][0];
        return surfaceArea;
    }

}
