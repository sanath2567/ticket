public class find {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 8, 19, 3 };
        minmax(arr);

    }

    static void minmax(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);

    }
}