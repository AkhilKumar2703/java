
public class relationaloperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        boolean a = num1 == num2; // compare two values 
        boolean b = num1 != num2; // not equals to 
        boolean c = num1 > num2; // greater then 
        boolean d = num1 < num2; // lesser then 
        boolean e = num1 >= num2; //  greater then equals to
        boolean f = num1 <= num2; // lesser then equals to

        
        System.out.println("IS EQUAL " + a);
        System.out.println("IS GREATER " + c);
        System.out.println("IS NOT EQUAL " + b);
        System.out.println("IF LESS THAN " + d);
        System.out.println("IS GREATER THAN EQUAL TO " + e);
        System.out.println("IS LESS THAN EQUAL TO " + f);

    }
}
