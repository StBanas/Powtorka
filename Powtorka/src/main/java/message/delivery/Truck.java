package message.delivery;

public class Truck implements TransportInterface {
    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Truck delivered package: " + deliveryPackage);
    }
}
