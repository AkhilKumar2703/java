package OOPS;

import java.util.Arrays;

public class class1 {
    public static void main(String[] args) {
        // given a task to make a list of 5 students which include their name, roll
        // ,marks
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        // in oops we create our owm datatype and store all the information in that
        // we call it a CLASS
        Students[] student = new Students[5];
        // declare object
        Students akhil = new Students();
        Students khil = new Students();
        // dot separator or operator
        // basically in java we have ( . )
        // used to connect instance variable(student) to reference variable(akhil)
        // akhil.rollNo = 11;
        // akhil.name = "Akhlu";
        // akhil.marks = 99.9f;

        System.out.println(akhil.rollNo);
        System.out.println(akhil.name);
        System.out.println(akhil.marks);

        // System.out.println(Arrays.toString(student));
        akhil.greeting();
    }

}

class Students {
    int rollNo;
    String name;
    float marks;

    // we can also add funtions inside a class
    void greeting() {
        System.err.println("MY name is " + name);
    }

    // constructor
    Students() {
        this.rollNo = 11;
        this.name = "Akhlu";
        this.marks = 99.9f;
    }
}