import java.util.Arrays;

public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Sorted array of bogie IDs (IMPORTANT for Binary Search)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // If unsorted, you must sort first:
        // Arrays.sort(bogieIds);

        String searchKey = "BG309";

        int left = 0;
        int right = bogieIds.length - 1;
        boolean found = false;

        // ✅ Binary Search
        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison = bogieIds[mid].compareTo(searchKey);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                left = mid + 1;   // search right half
            } else {
                right = mid - 1;  // search left half
            }
        }

        // ✅ Display result
        if (found) {
            System.out.println("\nBogie ID " + searchKey + " FOUND (Binary Search).");
        } else {
            System.out.println("\nBogie ID " + searchKey + " NOT FOUND.");
        }

        // Program continues...
    }
}












