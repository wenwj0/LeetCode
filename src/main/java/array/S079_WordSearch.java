package array;

import java.io.FileOutputStream;

public class S079_WordSearch {
    public static void main(String[] args) {
        S079_WordSearch s079_wordSearch = new S079_WordSearch();
        char[][] board = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(s079_wordSearch.exist(board, "ABCCED"));

    }

    public boolean exist(char[][] board, String word) {
        char c=  word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==c) {
                    if (search(board, i, j, word, 0))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, int i, int j, String word, int k) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        if (board[i][j] != word.charAt(k)) {
            return false;
        }
        if (k == word.length() - 1)
            return true;
        char c = board[i][j];
        board[i][j] = '0';
        if (search(board, i - 1, j, word, k + 1))
            return true;
        if (search(board, i + 1, j, word, k + 1))
            return true;
        if (search(board, i, j + 1, word, k + 1))
            return true;
        if (search(board, i, j - 1, word, k + 1))
            return true;
        board[i][j] = c;
        return false;

    }
}
