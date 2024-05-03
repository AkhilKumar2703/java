
// Hacker Rank Question -> GAME OF TWO STACKS

public static int twoStacks(int x, int[] a, int[] b) {
    // Write your code here
    return twoStacks(x, a, b, 0, 0) - 1;
}

private static int twoStacks(int x, int[] a, int[] b, int s, int c) {
    if (s > x) {
        return c;
    }
    if (a.length == 0 || b.length == 0) {
        return c;
    }
    int ans1 = twoStacks(x, Arrays.copyOfRange(a, 1, a.length), b, s + a[0], c + 1);
    int ans2 = twoStacks(x, a, Arrays.copyOfRange(b, 1, b.length), s + b[0], c + 1);
    return Math.max(ans1, ans2);
}