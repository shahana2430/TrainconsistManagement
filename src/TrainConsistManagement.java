import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagement {

    // ✅ Bogie class (same as UC7)
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
        bogies.add(new Bogie("First Class", 24));

        // ✅ Filter using Stream (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // ✅ Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> Capacity: " + b.capacity);
        }

        // Program continues...
    }
}


