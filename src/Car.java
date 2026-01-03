/**
 * Represents a car vehicle with specific servicing requirements.
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isElectric;

    /**
     * Constructor for Car.
     * @param brand the car brand
     * @param model the car model
     * @param year the year of manufacture
     * @param mileage the current mileage in kilometers
     * @param numberOfDoors the number of doors
     * @param isElectric whether the car is electric
     */
    public Car(String brand, String model, int year, int mileage, int numberOfDoors, boolean isElectric) {
        super(brand, model, year, mileage);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    /**
     * Performs car-specific service operations.
     */
    @Override
    public void performService() {
        System.out.println("=== Car Service for " + toString() + " ===");
        System.out.println("- Changing engine oil and filter");
        System.out.println("- Inspecting brake pads and rotors");
        System.out.println("- Checking tire pressure and tread depth");
        System.out.println("- Replacing air filter");
        if (isElectric) {
            System.out.println("- Checking battery health and charging system");
            System.out.println("- Updating vehicle software");
        } else {
            System.out.println("- Inspecting exhaust system");
            System.out.println("- Checking spark plugs");
        }
        System.out.println("Car service completed!\n");
    }

    /**
     * Returns the service interval for cars.
     * @return service interval in kilometers (10,000 km for cars)
     */
    @Override
    public int getServiceIntervalKm() {
        return isElectric ? 15000 : 10000;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + numberOfDoors + " doors" + (isElectric ? ", Electric" : "") + "]";
    }
}
