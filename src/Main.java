import java.util.ArrayList;
import java.util.List;

/**
 * Main class demonstrating polymorphic behavior with the Servicable interface.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Service Management System ===\n");

        // Create different types of vehicles
        Car car1 = new Car("Toyota", "Camry", 2020, 45000, 4, false);
        Car car2 = new Car("Tesla", "Model 3", 2023, 12000, 4, true);
        Bus bus1 = new Bus("Mercedes", "Citaro", 2019, 180000, 50, true);
        Bus bus2 = new Bus("Volvo", "7900", 2021, 85000, 40, false);

        // Demonstrate polymorphism: using Servicable reference
        System.out.println("--- Demonstrating Polymorphism with Servicable Interface ---\n");

        // Polymorphic reference - Servicable points to Car
        Servicable s1 = car1;
        System.out.println("Vehicle: " + car1);
        System.out.println("Service interval: " + s1.getServiceIntervalKm() + " km");
        s1.performService();

        // Polymorphic reference - Servicable points to Bus
        Servicable s2 = bus1;
        System.out.println("Vehicle: " + bus1);
        System.out.println("Service interval: " + s2.getServiceIntervalKm() + " km");
        s2.performService();

        // Using a collection of Servicable objects (polymorphic collection)
        System.out.println("--- Service Schedule for All Vehicles ---\n");
        List<Servicable> fleet = new ArrayList<>();
        fleet.add(car1);
        fleet.add(car2);
        fleet.add(bus1);
        fleet.add(bus2);

        for (Servicable vehicle : fleet) {
            if (vehicle instanceof Vehicle) {
                Vehicle v = (Vehicle) vehicle;
                int kmToService = v.getMileage() % vehicle.getServiceIntervalKm();
                int kmRemaining = vehicle.getServiceIntervalKm() - kmToService;

                System.out.println("Vehicle: " + v);
                System.out.println("Service interval: " + vehicle.getServiceIntervalKm() + " km");
                System.out.println("Kilometers until next service: " + kmRemaining + " km");

                // Check if service is needed
                if (kmRemaining <= 1000) {
                    System.out.println("⚠️  SERVICE REQUIRED SOON!");
                    vehicle.performService();
                } else {
                    System.out.println("✓ Service not required yet\n");
                }
            }
        }

        // Demonstrate method dispatching at runtime
        System.out.println("--- Runtime Method Dispatch Demonstration ---\n");
        performServiceCheck(car2);
        performServiceCheck(bus2);
    }

    /**
     * Demonstrates polymorphism: accepts any Servicable object
     * and calls the correct implementation at runtime.
     * @param servicable any object implementing Servicable interface
     */
    private static void performServiceCheck(Servicable servicable) {
        System.out.println("Checking service requirements...");
        if (servicable instanceof Vehicle) {
            Vehicle v = (Vehicle) servicable;
            System.out.println("Vehicle: " + v);
            System.out.println("Service interval: " + servicable.getServiceIntervalKm() + " km");

            // The correct performService() implementation is chosen at runtime
            servicable.performService();
        }
    }
}
