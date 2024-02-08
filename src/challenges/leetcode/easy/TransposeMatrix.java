package challenges.leetcode.easy;

/*
 * Given a 2D integer array matrix, return the transpose of matrix. The transpose of a matrix is the matrix 
 * flipped over its main diagonal, switching the matrix's row and column indices.
 * Example1 : Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]; Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
public class TransposeMatrix {
	
	public static void main(String args[]) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] transposeMatrix = transpose(matrix);
		
		for(int i=0;i<transposeMatrix.length;i++) {
			for(int j=0;j<transposeMatrix[i].length;j++)
				System.out.print(transposeMatrix[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
        
    }

}
