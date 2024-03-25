public class palinfrome {

    public static void main(String[] args) {
        String check = "aba";
        System.out.println(isPalinfrome(check));
        int cn = 121;
        System.out.println(isPalinfrome(cn));

    }

    static boolean isPalinfrome(String str) {

        str = str.toLowerCase();
        if (str == null || str.length() == 0) {
            return true;
        }
        for (char i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }

        }
        return true;
    }

    static boolean isPalindrome(int number) {

        if (number == null || number.length == 0) {
            return true;
        }
        for (int i = 0; i <= number.length() / 2; i++) {

            int start = i;
            int end = number.length() - 1 - i;
            if (start != end) {
                return false;
            }

        }
        return true;
    }

}
