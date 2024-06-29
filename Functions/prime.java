package Functions;

public class prime {
    public static void main(String[] args) {

        System.out.println(tillN(10));
        System.out.println(tillN(15));
        System.out.println(tillN(20));
        System.out.println(tillN(30));

    }

    public static boolean checkingPrime(int num){

     for (int c = 2; c< num; c++) {
            if (num % c == 0) {
                
                return false;
            }

        }
       return true;

    }

    public static void loop(int num){
        for (int i = 1; i <= num; i++) {

            System.out.print(i+" ");
            
        }
    }

    public static int tillN(int num){
        int sum =0;
        for (int i = 1; i <= num; i++){
            sum =sum+i;

        }
        return sum;
    }
}
