import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1235);
        list.add(17895);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(1, 69));

    }

}
