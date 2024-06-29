package Functions;

public class evenValue {
    public static void main(String[] args) {

        even(10);
        
    }
    public static void even(int num){

        for (int i = 1; i <= num; i++){
            if(i%2==0){
              System.out.print(i+" ");
            }
        }


    }


}
