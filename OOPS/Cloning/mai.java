package OOPS.Cloning;

public class mai {
    public static void main(String[] args) throws CloneNotSupportedException {
        huma akhi = new Huma(19, "akhil");
        // huma akhi2 = new huma(akhi);
        huma twin = (huma) akhi.clone();
        System.out.println(twin.age + " " + twin.name);

    }
}
