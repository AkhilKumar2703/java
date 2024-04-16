package OOPS.Cloning;

public class huma implements Cloneable {
    int age;
    String name;

    public huma(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public huma(huma other) {
        this.age = other.age;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
