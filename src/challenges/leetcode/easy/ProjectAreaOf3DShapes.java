package challenges.leetcode.easy;

/*
 * You are given an n x n grid where we place some 1 x 1 x 1 cubes that are axis-aligned with the x, y, and z axes.
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of the cell (i, j).
 * We view the projection of these cubes onto the xy, yz, and zx planes.
 * A projection is like a shadow, that maps our 3-dimensional figure to a 2-dimensional plane. We are 
 * viewing the "shadow" when looking at the cubes from the top, the front, and the side.
 * Return the total area of all three projections.
 * Example1 : Input: grid = [[1,2],[3,4]]; Output: 17
 * Explanation: top view = 4 (since all the cells have building), front view = 3+4 (max elements in each col)
 * , side View = 2+4 (max elements in each row).
 * Example2 : Input: grid = [[2]]; Output: 5
 * Explaination : top view = 1, side view = 2, front view = 2;
 */
public class ProjectAreaOf3DShapes {
	
	public static void main(String args[]) {
		int[][] grid = {{1,0},{0,2}};
		
		System.out.println(projectionArea(grid));
	}
	
	public static int projectionArea(int[][] grid) {
        int topView = grid.length*grid[0].length;
        int sideView = 0, frontView = 0;
        for(int i=0;i<grid.length;i++){
            int rowMax =0;
            int colMax =0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0)
                    topView--;
                else if(grid[i][j]>rowMax)
                    rowMax = grid[i][j];
                if(grid[j][i]>colMax)
                    colMax = grid[j][i];     
            }
            sideView += rowMax;
            frontView += colMax;
        }
        return (sideView+frontView+topView);
    }

}
