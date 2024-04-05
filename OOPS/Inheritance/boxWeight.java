package OOPS.Inheritance;

public class boxWeight extends box {
    double weight;

    boxWeight() {
        this.weight = -1;
    }

    boxWeight(double weight, double l, double h, double w) {
        super(h, w, l); // this is use to initialize the properties of the class box
        this.weight = weight;
    }

}
