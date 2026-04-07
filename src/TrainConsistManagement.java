public class TrainConsistManagement {

    // ✅ Custom Exception (Checked Exception)
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ✅ Passenger Bogie class
    static class PassengerBogie {
        String type;
        int capacity;

        // Constructor with validation
        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        try {
            // ✅ Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1.type + " with capacity " + b1.capacity);

            // ❌ Invalid bogie (uncomment to test)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);

        } catch (InvalidCapacityException e) {
            // ✅ Handle exception
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nProgram continues safely...");
    }
}





