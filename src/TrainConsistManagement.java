public class TrainConsistManagement {

    // ✅ Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ✅ Goods Bogie class
    static class GoodsBogie {
        String shape;   // Rectangular / Cylindrical
        String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargoType) {

            try {
                System.out.println("\nAssigning " + cargoType + " to " + shape + " bogie");

                // ❌ Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargoType.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe! Petroleum cannot be assigned to Rectangular bogie."
                    );
                }

                // ✅ Safe assignment
                this.cargo = cargoType;
                System.out.println("Cargo assigned successfully!");

            } catch (CargoSafetyException e) {
                // ✅ Handle exception
                System.out.println("Error: " + e.getMessage());

            } finally {
                // ✅ Always executes
                System.out.println("Assignment process completed.");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ✅ Safe case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // ❌ Unsafe case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        // ✅ Program continues
        b2.assignCargo("Coal");

        System.out.println("\nProgram continues safely...");
    }
}






