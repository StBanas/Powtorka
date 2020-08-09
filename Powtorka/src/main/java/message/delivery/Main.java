package message.delivery;

public class Main {

        public static void main(String[] args) {
            DeliveryPackage deliveryPackage = new DeliveryPackage("Book", "Clean Code", "New York City");
            DeliveryService deliveryService = new DeliveryService();
            deliveryService.sendPackage(deliveryPackage, TransportTypes.AIRPLANE);
            deliveryService.sendPackage(deliveryPackage, TransportTypes.SHIP);
            deliveryService.sendPackage(deliveryPackage, TransportTypes.TRUCK);
        }
    }


