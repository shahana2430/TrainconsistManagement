import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Create LinkedHashSet (ordered + unique)
        Set<String> trainFormation = new LinkedHashSet<>();

        // ✅ Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // ❌ Attempt duplicate
        trainFormation.add("Sleeper");

        // ✅ Display formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);
    }
}

