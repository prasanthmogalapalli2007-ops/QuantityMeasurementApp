package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // 🔹 Inner Class: Feet
    public static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Same reference
            if (this == obj)
                return true;

            // Null or different class
            if (obj == null || this.getClass() != obj.getClass())
                return false;

            // Cast safely
            Feet other = (Feet) obj;

            // Compare values
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // 🔹 Main method (for execution)
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + result + ")");
    }
}