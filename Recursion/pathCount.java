package Recursion;

public class pathCount {
    public static void main(String[] args) {
        System.out.println(pc(3, 3));

    }

    static int pc(int r, int c, int[][] maze) {
        if (r == 1 || c == 1)
            return 1;

        if (maze[r][c] == 1) {
            return;
        }
        int left = pc(r - 1, c);
        int right = pc(r, c - 1);

        return left + right;
    }
}
