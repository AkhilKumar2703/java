package OOPS;

public class wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        // above values are not swapped
        // they are not swapped because off final

    }

    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
}
