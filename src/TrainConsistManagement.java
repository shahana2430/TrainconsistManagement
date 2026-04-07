import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagement {

    // ✅ Bogie class
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("Sleeper", 72));      // duplicate type
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 54));     // duplicate type

        // ✅ Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // ✅ Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\n" + entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity: " + b.capacity);
            }
        }

        // Program continues...
    }
}


