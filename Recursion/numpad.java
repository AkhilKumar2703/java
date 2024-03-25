package Recursion;

import java.util.ArrayList;
import java.util.List;

public class numPad {
    public static void main(String[] args) {
        System.out.println(numpad("", "12"));
    }

    static List<String> numpad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(numpad(p + ch, up.substring(1)));
        }
        return ans;
    }
}
