public class TrainConsistManagement {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Array of bogie IDs (unsorted)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // ✅ Search key
        String searchKey = "BG309";

        boolean found = false;

        // ✅ Linear Search
        for (String id : bogieIds) {

            if (id.equals(searchKey)) {
                found = true;
                break; // stop early when found
            }
        }

        // ✅ Display result
        if (found) {
            System.out.println("\nBogie ID " + searchKey + " FOUND in train.");
        } else {
            System.out.println("\nBogie ID " + searchKey + " NOT FOUND.");
        }

        // Program continues...
    }
}











