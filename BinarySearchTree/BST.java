package BinarySearchTree;

import java.lang.classfile.components.ClassPrinter;

public class BST {
    public BST(){

    }
    
    public class Node{
        private int value ;
        private int height ;
        private Node left ;
        private  Node right ;

        public Node (int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
   }

   private Node root;

   // we will check the heigth
   public int height(Node node) {
    if(node == null){ 
    return -1;
    }
    return node.height;

   }

   public boolean isEmpty(){
    return root == null;
   }

   public void display(){
    display(root,"Root Node:");
   }

   private void display(  Node node,String details){
    if(root == null){
        return;
    }
    System.out.println(details + node.getValue());
    display(node.left,"Left child  of"+ node.getValue()+ " : ");
    display(node.right,"Right child  of"+ node.getValue()+ " : ");

   }


}
