import java.util.*;

public class option {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Apple");
            System.out.println("2.Grapes");
            System.out.println("3.mango");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            if (choice == 4) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Applessssss");
                    break;
                case 2:
                    System.out.println("grapesssssss");
                    break;
                case 3:
                    System.out.println("mangossssss");
                    break;
                case 4:
                    System.out.println("ijhhghj");
                default:
                    System.out.println("enter valid option");
            }
        }
    }
}
