package challenges.leetcode.medium;

public class NumberOfIslands {
	
	public static void main(String args[]) {
		char[][] grid = {{'1','1','1','0'},{'0','1','0','1'},{'1','1','1','1'}};
		System.out.println(numIslands(grid));

	}
	
	public static int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    grid[i][j]='0';
                    checkAdjacent(i, j+1, grid);
                    checkAdjacent(i+1,j, grid);
                    // checkAdjacent(i, j-1, grid);
                    // checkAdjacent()
                }
            }
        }
        return count;
    }

    public static boolean checkAdjacent(int i, int j, char[][] grid){
        if(i>=0 && i<grid.length && j<grid[0].length && j>=0){
            if(grid[i][j]=='1'){
                grid[i][j]='0';
                checkAdjacent(i, j+1, grid);
                checkAdjacent(i+1, j, grid);
                checkAdjacent(i, j-1, grid);
                checkAdjacent(i-1, j, grid);
            } 
        }
        return false;
    }

}
