import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ✅ Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // ✅ Display list after adding
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // ✅ Remove one bogie
        passengerBogies.remove("AC Chair");

        // ✅ Display list after removal
        System.out.println("\nPassenger Bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // ✅ Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist.");
        }

        // ✅ Final state
        System.out.println("\nFinal Passenger Bogies:");
        System.out.println(passengerBogies);

        // Program continues...
    }
}