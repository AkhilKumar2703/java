package OOPS.Compare;

public class A implements Comparable<A> {
    int roll;
    float marks;

    public A(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(A o) {
        int diff = (int) this.marks - o.marks;
        // if diff == 0 means both are equal
        // if diff < 1 means o is bigger else o is smaller
        return diff;
    }
}
