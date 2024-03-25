package Recursion;

public class IncludeAll {
    public static void main(String[] args) {

    }

    static int pcr(String p, int r, int c, boolean maze[][], int[][] path, int steps) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        // when any obstacle will come it will work

        if (maze[r][c] == false) {
            return;
        }
        // backtraking
        maze[r][c] = false;
        path[r][c] = steps;
        if (r < maze.length - 1) {
            pcr(p + 'D', r + 1, c, maze, path, steps + 1);
        }
        if (c < maze[0].length - 1) {
            pcr(p + 'R', r, c + 1, maze, path, steps + 1);
        }
        if (r > 0) {
            pcr(p + 'U', r - 1, c, maze, path, steps + 1);
        }
        if (c > 0) {
            pcr(p + 'L', r, c - 1, maze, path, steps + 1);
        }
        // backtraking
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
