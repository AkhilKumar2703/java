package Trees;

import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeImplementation tree = new TreeImplementation();
        tree.populate(scanner);
        tree.display();

    }
    
}
