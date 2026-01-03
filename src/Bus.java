/**
 * Represents a bus vehicle with specific servicing requirements.
 */
public class Bus extends Vehicle {
    private int passengerCapacity;
    private boolean hasWheelchairAccess;

    /**
     * Constructor for Bus.
     * @param brand the bus brand
     * @param model the bus model
     * @param year the year of manufacture
     * @param mileage the current mileage in kilometers
     * @param passengerCapacity the maximum number of passengers
     * @param hasWheelchairAccess whether the bus has wheelchair accessibility
     */
    public Bus(String brand, String model, int year, int mileage, int passengerCapacity, boolean hasWheelchairAccess) {
        super(brand, model, year, mileage);
        this.passengerCapacity = passengerCapacity;
        this.hasWheelchairAccess = hasWheelchairAccess;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean hasWheelchairAccess() {
        return hasWheelchairAccess;
    }

    public void setWheelchairAccess(boolean hasWheelchairAccess) {
        this.hasWheelchairAccess = hasWheelchairAccess;
    }

    /**
     * Performs bus-specific service operations.
     */
    @Override
    public void performService() {
        System.out.println("=== Bus Service for " + toString() + " ===");
        System.out.println("- Performing comprehensive engine inspection");
        System.out.println("- Checking all " + (passengerCapacity / 10) + " air conditioning zones");
        System.out.println("- Inspecting hydraulic brake system");
        System.out.println("- Lubricating door mechanisms");
        System.out.println("- Testing emergency exits and safety equipment");
        System.out.println("- Inspecting suspension and steering systems");
        if (hasWheelchairAccess) {
            System.out.println("- Testing wheelchair lift/ramp mechanism");
            System.out.println("- Inspecting wheelchair securing systems");
        }
        System.out.println("- Checking all passenger seats and belts");
        System.out.println("Bus service completed!\n");
    }

    /**
     * Returns the service interval for buses.
     * @return service interval in kilometers (5,000 km for buses - more frequent due to heavy use)
     */
    @Override
    public int getServiceIntervalKm() {
        return 5000;
    }

    @Override
    public String toString() {
        return super.toString() + " [Capacity: " + passengerCapacity + " passengers" + 
               (hasWheelchairAccess ? ", Wheelchair accessible" : "") + "]";
    }
}
