package OOPS.Acess;

public class objectClass extends A {

    int num;

    public objectClass(int num) {
        this.num = num;
    }

    @Override

    public int hashCode() {
        return super.hashCode();
        // it gives number representation of object
    }

    // @Override

    // public boolean equals() {

    // }

    // @Override

    // protected object clone() {

    // }

    public static void main(String[] args) {
        objectClass o = new objectClass(34);
        System.out.println(o.hashCode());
    }

}
