package message.delivery;

public class Airplane implements TransportInterface {



    public void delivery(DeliveryPackage deliveryPackage) {
        System.out.println("Airplane delivered package: " + deliveryPackage);
    }
}
