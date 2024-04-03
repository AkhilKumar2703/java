package OOPS;

public class wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
        // above values are not swapped
        // they are not swapped because off final
        // Students abc;
        // for (int i = 0; i < 1000000; i++) {
        // abc = new Students("random");
        // }

        Students asdf = new Students("asdfghjkl");
        System.out.println(asdf);

    }

    static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

}

class Students {
    int rollNo;
    String name;
    float marks;

    Students(String name) {
        this.name = name;
    }

    // garbage collection
    // protected void finalize() throws Throwable {
    // System.out.println("destroyed");
    // };

}
