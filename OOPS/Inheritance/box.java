package OOPS.Inheritance;

public class box {

    box l;
    box h;
    box w;

    box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;

    }

    box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;

    }

    box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;

    }

    box(box old) {
        System.out.println("Runnig the box ");
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

}
