public class pracfact {
    public static void main(String[] args) {
        int num = 5;
        int fact =1;
        for(int i =1; i <= num; i++) {
        System.out.print(i+"*");
        fact = fact*i;
          
        }
        System.out.println(" ="+fact);
    }
}
