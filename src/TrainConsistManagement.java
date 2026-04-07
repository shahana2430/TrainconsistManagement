import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Create HashMap for bogie → capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ✅ Add bogies with capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 24);

        // ✅ Display mapping using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Program continues...
    }
}


