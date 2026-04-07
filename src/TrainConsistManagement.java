import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Create HashSet for Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // ✅ Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // ✅ Display unique bogie IDs
        System.out.println("\nBogie IDs after adding (duplicates ignored):");
        System.out.println(bogieIds);

        // Program continues...
    }
}