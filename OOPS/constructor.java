package OOPS;

public class constructor {
    public static void main(String[] args) {
        Students [] student = new Students[5];

        Students akhil = new Students(45, "hello", 33.3f);

        System.out.println(akhil.rollNo);
        System.out.println(akhil.name);
        System.out.println(akhil.marks);

        Students qwert = new Students();
        System.out.println(qwert.rollNo);
        System.out.println(qwert.name);
        System.out.println(qwert.marks);
    }
}

class Students {
    int rollNo;
    String name;
    float marks;

    // constructor (by defalut contrustor)
    Students() {
        this.rollNo = 11;
        this.name = "Akhil";
        this.marks = 99.9f;
    }

    // creating owm constructor
    // Students xyz = new Students(45, "xyz", 33.3f);
    // so here thus will be replaced by xyz
    // for evry new object variables assigned accordingly
    Students(int rNo, String naam, float markas) {
        this.rollNo = rNo;
        this.name = naam;
        this.marks = markas;
    }

    
}
