public class swapping {

    public static void main(String[] args) {
        String name = "Akhil SDE @Google @AMAZON @MICROSOFT";
        changename(name);
        System.out.println(name);

        System.out.println("----------------------------------------------------------------");
        int a = 10;
        int b = 20;
        change(a, b);
        System.out.println(a + " " + b);

    } // HERE ONLY THE REFERENCE VALUES ARE BIENG COPIED NOT THE VALUES ARE BIENG
      // SWAPPER

    static void changename(String naam) {
        naam = " Rahul Rana"; // strings are immutuable there value do not change
    }

    static void change(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change or swaping will be only valid in thi (change ) function scope
        // only

    }

}
