import java.util.*;

public class TrainConsistManagement {

    // ✅ Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ✅ Goods Bogie class
    static class GoodsBogie {
        private String shape;   // Rectangular / Cylindrical
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargoType) {

            try {
                System.out.println("\nAssigning cargo: " + cargoType + " to " + shape + " bogie");

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
                // ✅ Always runs
                System.out.println("Assignment process completed.\n");
            }
        }

        public String getCargo() {
            return cargo;
        }
    }

    // ✅ Main method
    public static void main(String[] args) {

        // ✅ Safe case
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        // ❌ Unsafe case
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");

        // ✅ Continue after exception
        rectangular.assignCargo("Food Grains");

        System.out.println("Program continues safely...");
    }
}