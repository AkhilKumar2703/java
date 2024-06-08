import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE FRUIT NAME: ");
        String fruit = in.next();
        switch (fruit) { // (conditipn to be checked)
            case "mango":
                System.out.println("KING OF FRUITS");
                break;
            case "appple":
                System.out.println("APPLE A DAY KEEP DOCTOR AWAY");
                break;
            case "guava":
                System.out.println("BEST ALONG WITH SEEDS");
                break;
            case "kiwi":
                System.out.println("ROYAL FRUIT");
                break;

            default:
                System.out.println("Enter valid fruit !!!");
                break;
        }

    }

}
// weekdays
