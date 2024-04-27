package challenges.leetcode.medium;

/*
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * Example 1: Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"; Output: true
 * Example 2: Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"; Output: true
 * Example 3: Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"; Output: false
 */
public class WordSearch {
	
	public static void main(String args[]) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		System.out.println(exist(board, word));
	}
	
	public static boolean exist(char[][] board, String word) {
        int w = 0;
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(w)){
                    board[i][j]='-';
                    if(searchForNext(i-1, j, w+1, board, word) ||
                    searchForNext(i+1, j, w+1, board, word) ||
                    searchForNext(i, j-1, w+1, board, word) ||
                    searchForNext(i, j+1, w+1, board, word))
                        return true;
                    else
                        board[i][j]=word.charAt(w);
                }
            }
        }
        return false;
    }

    public static boolean searchForNext(int i, int j, int w, char[][] board, String word){
        if(w==word.length())
            return true;
        if(i>=0 && j>=0 && i<board.length && j<board[0].length){
            if(board[i][j]==word.charAt(w)){
                board[i][j]='-';
                if(searchForNext(i-1, j, w+1, board, word) ||
                searchForNext(i+1, j, w+1, board, word) ||
                searchForNext(i, j-1, w+1, board, word) ||
                searchForNext(i, j+1, w+1, board, word))
                    return true;
                else
                    board[i][j]=word.charAt(w);
            }
        }
        return false;
    }

}
