public class perfect {
    public static void main(String[] args) {
        int n = 66, sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == n) {
            System.out.println("perfect");
        } else {
            System.out.println("not");
        }
    }

}
