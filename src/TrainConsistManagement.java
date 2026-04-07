import java.util.*;

public class TrainConsistManagement {

    // ✅ Goods Bogie class
    static class GoodsBogie {
        String type;   // Cylindrical / Rectangular
        String cargo;  // Petroleum / Coal / etc.

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // ❌ Try invalid case (uncomment to test)
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // ✅ Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") ||
                                b.cargo.equalsIgnoreCase("Petroleum")
                );

        // ✅ Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        // Program continues...
    }
}


