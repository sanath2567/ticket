import java.util.*;

public class option1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. vegtables");
            System.out.println("2. cool Drinks");
            System.out.println("3.fruits");
            System.out.println("4.Exit");
            int option = sc.nextInt();
            if (option == 4) {
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("1. Tomato");
                    System.out.println("2.Ladys Finger");
                    System.out.println("3.brinjal");
                    System.out.println("4.Exit");
                    int choice = sc.nextInt();
                    if (option == 4) {
                        break;
                    }
                    switch (choice) {
                        case 1:
                            System.out.println("Tomato was added to the cart");
                            break;
                        case 2:
                            System.out.println("brinjal was added to the cart");
                            break;
                        default:
                            continue;
                    }
                    //
                    //
                    //
                    break;

                default:
                    System.out.println("nothing");
                    break;
            }
        }
    }
}
