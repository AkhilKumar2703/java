package OOPS;

public class static {
    public static void main(String[] args){
        static thssa = new static();

        thssa.fun2();
    }
    static void fun(){
        System.out.println("yoo");
        greeting();//this will give error  becuase we cant use non static stuff without reference

        static obj = new static();
        obj.greeting();//now this will not give any error beacuse  we referenced the greeting to object
    }
    void fun2(){
        System.out.println("chko");
        fun();
    }
    void greeting(){
        System.out.println("hain");
    }
}
