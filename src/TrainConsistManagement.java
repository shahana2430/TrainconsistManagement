import java.util.Arrays;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Bogie names (unsorted)
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // ✅ Built-in sorting
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("\nAfter Sorting (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        // Program continues...
    }
}









