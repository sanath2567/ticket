import java.util.Scanner;

public class element {
    public static void main(String[] args) {
        int size = 5;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Elements");
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        for (int val : arr) {
            System.out.print(val + " ");

        }
        boolean found = false;
        int target = 6;
        for (int i = 0; i < size; i++) {
            if (target == arr[i]) {
                found = true;
                System.out.println("elemnt is found");
                break;
            }

        }
        if (!found) {
            System.out.println("not");
        }

    }

}
