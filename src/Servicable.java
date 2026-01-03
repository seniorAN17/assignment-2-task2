/**
 * Interface for objects that can be serviced.
 * Defines methods for performing service and retrieving service intervals.
 */
public interface Servicable {
    /**
     * Performs the service operation for this object.
     */
    void performService();

    /**
     * Gets the service interval in kilometers.
     * @return the number of kilometers between services
     */
    int getServiceIntervalKm();
}
