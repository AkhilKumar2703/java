package Recursion;

public class pcRes {
    public static void main(String[] args) {

    }

    static int pcr(String p, int r, int c, boolean maze[][]) {
        if (r == maze.length - 1 && c == maze[0].length - 1)
            return 1;

        // when any obstacle will come it will work

        if (maze[r][c] == false) {
            return;
        }
        if (r < maze.length - 1) {
            pcr(p + 'D', r + 1, c, maze);
        }
        if (c < maze[0].length - 1) {
            pcr(p + 'R', r, c + 1, maze);
        }
    }
}
