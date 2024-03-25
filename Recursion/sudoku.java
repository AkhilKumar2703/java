package Recursion;

public class sudoku {
    public static void main(String[] args) {
        int [] [] board= new int[][]{

        }


    }

    static boolean solve(int[][] board) {
        int n = board.length();
        int row = -1;
        int col = -1;
        boolean empty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    empty = false;
                    break;
                }
            }
            // if anything is empty in any row then we will break it
            if (empty == false) {
                break;
            }
        }

        if (empty == true) {
            return true;
        }
        // now backtrack through the grids if not is safe
        for (int number = 1; number <= 9; number++) {
            if (isSafe(number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }

        }
        // if nothing works means suduko cant be solved
        return false;

    }

    // now funtion to check whether it id safe to place digit or not
    static boolean isSafe(int[][] board, int row, int col, int num) {
        // checking in rows
        for (int i = 0; i < board.length; i++) {
            if (board[row][col] == num) {
                return false;
            }

        }
        // checking in columns
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }

        }
        // now checking in particular grids
        // for this we have to take square root
        int sqrt = (int) Math.sqrt(board.length);
        int Rstart = row - (row % sqrt);
        int Cstart = col - (col % sqrt);
        for (int r = Rstart; i < Rstart + sqrt; i++) {
            for (int c = Cstart; j < Cstart + sqrt; j++) {
                if (board[r][c] == num) {
                    return false;
                }

            }
        }
        return true;

    }

    static void display(int[][] board) {

        for (int[] row : board) {
            for (int num : row) {

                System.out.print(num + " ");

            }
            System.out.println();

        }
    }

}