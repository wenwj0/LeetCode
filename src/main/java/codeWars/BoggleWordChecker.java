package codeWars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BoggleWordChecker {
    public BoggleWordChecker(final char[][] board, final String word) {
        this.boardChar = board;
        this.word = word;
    }

    public boolean check() {
        char[] wordArray = word.toCharArray();
        flag = false;
        isUsed = new boolean[boardChar.length][boardChar[0].length];
        for (int i = 0; i < boardChar.length; i++) {
            for (int j = 0; j < boardChar[0].length; j++) {
                search(boardChar, i, j, wordArray, 0);
            }
        }
        return flag;
    }

    public boolean flag;
    public char[][] boardChar;
    public String word;
    public boolean[][] isUsed;

    public void search(char[][] board, int row, int col, char[] words, int index) {
        if (words[index] != board[row][col] || isUsed[row][col]) {
            return;
        } else if (index == words.length - 1) {
            flag = true;
            return;
        }
        isUsed[row][col] = true;
        if (row - 1 >= 0) {
            search(board, row - 1, col, words, index + 1);
            if (col - 1 >= 0)
                search(board, row - 1, col - 1, words, index + 1);
            if (col + 1 < board[0].length)
                search(board, row - 1, col + 1, words, index + 1);
        }
        if (col + 1 < board[0].length)
            search(board, row, col + 1, words, index + 1);

        if (row + 1 < board.length) {
            search(board, row + 1, col, words, index + 1);
            if (col - 1 >= 0)
                search(board, row + 1, col - 1, words, index + 1);
            if (col + 1 < board[0].length)
                search(board, row + 1, col + 1, words, index + 1);
        }
        if (col - 1 >= 0)
            search(board, row, col - 1, words, index + 1);
        isUsed[row][col] = false;
    }
}
