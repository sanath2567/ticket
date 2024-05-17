import java.util.*;

public class helloo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.Express\n2.Delux\n3.superdelux\n\n56");
        int tick, item;
        int total = 0;
        item = sc.nextInt();
        tick = sc.nextInt();
        if (tick > 6 || tick == 0) {
            System.out.println("invalid");
        }

        if (item == 1) {
            total = 300 * tick;
        } else if (item == 2) {
            total = 400 * tick;
        } else if (item == 3) {
            total = 450 * tick;
        } else {
            System.out.println("invalid");

        }

        // System.out.println("tatal price=" + total);
        double gst = 0.05 * total;
        double toll = 0.02 * total;
        double final_cost = total + gst + toll;

        System.out.println("total cost =" + final_cost);
    }
}
