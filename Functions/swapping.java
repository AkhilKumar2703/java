public class swapping {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");
        int a = 10;
        int b = 20;
        change(a, b);

        System.out.println(a + " " + b);

    }

    static void change(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change or swaping will be only valid in thi (change ) function scope
        // only

    }

}
