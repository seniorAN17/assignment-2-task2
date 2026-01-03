/**
 * Abstract base class for all vehicles.
 * Implements Servicable to ensure all vehicles can be serviced.
 */
public abstract class Vehicle implements Servicable {
    private String brand;
    private String model;
    private int year;
    private int mileage;

    /**
     * Constructor for Vehicle.
     * @param brand the vehicle brand
     * @param model the vehicle model
     * @param year the year of manufacture
     * @param mileage the current mileage in kilometers
     */
    public Vehicle(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Returns a string representation of the vehicle.
     */
    @Override
    public String toString() {
        return year + " " + brand + " " + model + " (" + mileage + " km)";
    }

    // Abstract methods to be implemented by subclasses
    public abstract void performService();
    public abstract int getServiceIntervalKm();
}
