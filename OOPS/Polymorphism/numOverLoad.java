package OOPS.Polymorphism;

public class numOverLoad {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        numOverLoad obj = new numOverLoad();
        obj.sum(1, 5);
        obj.sum(11, 20, 8);
        obj.sum(11, 20, 8, 6);
    }
}
