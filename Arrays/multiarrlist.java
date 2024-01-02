
import java.util.Scanner;
import java.util.ArrayList;

public class multiarrlist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // INITIALIZE

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // DECLARATION

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        // OUTPUT
        System.out.println(list);

    }

}
