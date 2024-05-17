
public class hell {
    public static void main(String[] args) {
        int numbers = 151;
        if (pal(numbers)) {
            System.out.println("is pallindrome");
        } else
            System.out.println("not");

    }

    static boolean pal(int number) {
        int org = number;
        int r, sum = 0;
        while (number > 0) {
            r = number % 10;
            sum = sum * 10 + r;
            number = number / 10;
        }

        return org == sum;
    }
}