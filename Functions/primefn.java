package Functions;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class primefn {
    public static boolean isprime(int n) {
        for (int d = 2; d < n; d++) {
            if (n % d == 0) {
                return false;

            }

        }
        return true;

    }

    public static void main(String[] args) {
        boolean a = isprime(11);
        System.out.println(a);
    }
}