import java.util.*;

public class TrainConsistManagement {

    // ✅ Search method with fail-fast validation
    public static boolean searchBogie(List<String> bogies, String searchKey) {

        // ❌ Fail-fast check
        if (bogies.isEmpty()) {
            throw new IllegalStateException("No bogies available in the train. Cannot perform search.");
        }

        // ✅ Search logic (Linear Search)
        for (String id : bogies) {
            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> bogies = new ArrayList<>();

        // ❌ Case 1: Search on empty list
        try {
            searchBogie(bogies, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // ✅ Add bogies
        bogies.add("BG101");
        bogies.add("BG205");
        bogies.add("BG309");

        // ✅ Case 2: Valid search
        try {
            boolean found = searchBogie(bogies, "BG205");

            if (found) {
                System.out.println("\nBogie FOUND after validation.");
            } else {
                System.out.println("\nBogie NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Program continues safely...
    }
}












