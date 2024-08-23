
public class simpleinterest {

    static int sple = 20;
    public static void main(String[] args) {

       
        System.out.println(si(10000, 25, 5));
        System.out.println(sple);
        int sple = 50;
        System.out.println(sple);
        // shadowing  
  

    }

    public  static int si(int p,int r, int t){
          int sple = (p*r*t)/100;
        return sple;

    }
}
