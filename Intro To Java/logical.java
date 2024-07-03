
public class logical {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 =10;
        int num3 = 210;

       // logical operators AND , OR
       // given two conditions if only one will be true then -> OR
    //    boolean or  = (num1<num2) || (num2<num3);

    //    System.out.println(or);
// given two conditions if both will  be true then -> And
       boolean and  =  (num1<num2) && (num2<num3);

       System.out.println(and);

       
  


        // boolean and = (a > b) && (a > c);
        // System.out.println("IS a GREATER THAN BOTH b & c   " + and);
        // boolean or = (a > b) || (a > c);
        // System.out.println("IS a GREATER THAN ANY ONE OF b & c   " + or);
        // System.out.println("a IS NOT GREATER THAN b  " + !(a > b));

    }

}
