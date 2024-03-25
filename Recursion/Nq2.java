package Recursion;

public class Nq2 {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(queens(board, 0));

    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {

            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }

        }
        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // daigonal left
        int maxL = Math.min(row, col);
        for (int i = 1; i <= maxL; i++) {
            if (board[row - i][col - i]) {
                return false;
            }

        }
        // daigonal right
        int maxR = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxR; i++) {
            if (board[row - i][col + i]) {
                return false;
            }

        }
        return true;

    }
}
