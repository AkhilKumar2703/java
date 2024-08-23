package Trees;

import java.util.Scanner;

public class TreeImplementation {

    TreeImplementation(){

    }

    private class node{
        int value;
        node left;
        node right;

        node(int value){
            this.value = value;
        }
    }
    private  node root;
    public  void populate(Scanner scanner){
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
         root = new node(value);

        populate(scanner,root);


    }

    private  void populate(Scanner scanner, node node) {
        System.out.println("Do you want to insert to left of "+node.value);
        boolean checkLeft= scanner.nextBoolean();
        if(checkLeft){
            System.out.println("Enter the value to the left "+node.value);
            int value = scanner.nextInt();
            node.left = new node(value);
            populate(scanner, node.left);

        }

        System.out.println("Do you want to insert to right of "+node.value);
        boolean checkRight= scanner.nextBoolean();
        if(checkRight){
            System.out.println("Enter the value to the right "+node.value);
            int value = scanner.nextInt();
            node.right = new node(value);
            populate(scanner, node.right);
            

        }

        
    } 
}
