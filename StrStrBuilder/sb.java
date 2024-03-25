public class sb {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            name.append(c);
        }
        System.out.println(name.toString());

    }
}
