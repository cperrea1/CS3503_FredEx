public class Shipment {

    private int shipmentID;
    private int status;
    /*
     * status codes:
     * 0 = shipment received/entered in system
     * 1 = shipment on truck
     * 2 = shipment out for delivery
     * 3 = delivered
     * 4 = exception
     */
    private Recipient recipient;
    private Sender sender;
    private Address deliveryAddress;
}
