package if_else;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class charcase {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String a = r.nextLine();
        char q = a.charAt(0);
        if (q >= 'A' && q <= 'Z') {
            System.out.print("NO IS UPPER CASE LETTER SO OUTPUT IS  ");
            System.out.println(1);
        } else if (q >= 'a' && q <= 'z') {
            System.out.print("NO IS LOWER CASE LETTER SO OUTPUT IS");
            System.out.println(0);
        }

        else {
            System.out.print("NO IS NOT A ALPHABET SO OUTPUT IS");
            System.out.println(-1);
        }

    }
}
