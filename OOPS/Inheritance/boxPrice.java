package OOPS.Inheritance;

public class boxPrice extends boxWeight {
    double price;

    // it will have properties of both boxWeight and parent class box
    boxPrice() {
        super();
        this.price = 20;
    }

    boxPrice(boxPrice other) {
        super(other);
        this.price = 20;
    }
}
