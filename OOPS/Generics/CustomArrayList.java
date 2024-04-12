package OOPS.Generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList<T extends Number> {

    private T[] data;
    private static int Default_Size = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[Default_Size];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        } else {
            data[size++] = num;
        }
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(Arrays.toString(list));
    }
}
