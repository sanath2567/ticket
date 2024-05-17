public class RodCutting {
    public static boolean canCut(int[] cuts, int minLength) {
        // Check if the smallest cut is at least minLength
        if (cuts[0] < minLength) {
            return false;
        }

        int n = cuts.length;
        // Loop through the cuts and check if there's a cut of at least minLength at the end
        for (int i = 0; i < n - 1; i++) {
            if (cuts[i + 1] - cuts[i] < minLength) {
                return false;
            }
        }

        // Check if the last cut is at least minLength
        if (cuts[n - 1] < minLength) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage
        int[] cuts = {2, 4, 7, 10}; // Array representing the lengths of cuts
        int minLength = 3; // Minimum length required for the last cut
        boolean canCut = canCut(cuts, minLength);
        if (canCut) {
            System.out.println("It is possible to plan the cuts so the last cut is at least " + minLength + " units long.");
        } else {
            System.out.println("It is not possible to plan the cuts so the last cut is at least " + minLength + " units long.");
        }
    }
}

