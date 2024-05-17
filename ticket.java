import java.util.*;

public class ticket {
    public static void main(String[] args) {
        int item, tick;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        item = sc.nextInt();
        tick = sc.nextInt();
        if (tick == 0 || tick > 6) {
            System.out.println("invalid");
        }
        if (item == 1) {
            total = 300 * tick;
        } else if (item == 2) {
            total = 400 * tick;
        } else {
            total = 500 * tick;
        }
        // System.out.println(total);
        double gst=0.05*total;
        double tol=0.5*total;
        double finals=gst+tol+total;
        System.out.println(finals);
    }
}
