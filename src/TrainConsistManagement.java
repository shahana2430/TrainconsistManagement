import java.util.regex.*;

public class TrainConsistManagement {

    public static void main(String[] args) {

        // ✅ Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ✅ Sample inputs (you can change these)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // ✅ Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // ✅ Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // ✅ Create matcher
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // ✅ Validate Train ID
        if (m1.matches()) {
            System.out.println("\nValid Train ID: " + trainId);
        } else {
            System.out.println("\nInvalid Train ID: " + trainId);
        }

        // ✅ Validate Cargo Code
        if (m2.matches()) {
            System.out.println("Valid Cargo Code: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCode);
        }

        // Program continues...
    }
}

