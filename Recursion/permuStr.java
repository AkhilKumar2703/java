package Recursion;

import java.util.ArrayList;
import java.util.List;

public class permuStr {
    public static void main(String[] args) {
        strpermu("", "abc");
        System.out.println(strpermu2("", "abc"));
    }

    static void strpermu(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            strpermu(f + ch + s, up.substring(1));

        }

    }

    static ArrayList<String> strpermu2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<String>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(strpermu2(f + ch + s, up.substring(1)));

        }
        return ans;

    }
}
