import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1235);
        list.add(17895);
        System.out.println("array list : " + list);
        list.remove(2);

        System.out.println("list after removing element : " + list);

        System.out.println("size is : " + list.size());

        // System.out.println(list);
        System.out.println("element which is get :" + list.get(2));
        // System.out.println(list);
        list.set(1, 4569);
        System.out.println("list after setting new value " + list);

    }

}
