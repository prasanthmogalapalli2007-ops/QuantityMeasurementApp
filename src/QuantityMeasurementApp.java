class QuantityMeasurementApp {

    // Inner class
    static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Step 1: Same reference
            if (this == obj)
                return true;

            // Step 2: Null or different class
            if (obj == null || this.getClass() != obj.getClass())
                return false;

            // Step 3: Type casting
            Feet other = (Feet) obj;

            // Step 4: Compare values safely
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Are equal? " + f1.equals(f2));
    }
}