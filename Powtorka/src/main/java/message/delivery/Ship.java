package message.delivery;

public class Ship implements  TransportInterface {
    @Override
    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Ship delivered package: " + deliveryPackage);
    }
}
