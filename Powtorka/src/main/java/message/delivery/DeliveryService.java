package message.delivery;

public class DeliveryService {
    private final Airplane airplane = new Airplane();
    private final Ship ship = new Ship();
    private final Truck truck = new Truck();

//    public void sendPackage(DeliveryPackage deliveryPackage, String transportType) {
//
//    switch (transportType) {
//        case "airplane":
//            airplane.delivery(deliveryPackage);
//            break;
//        case "ship":
//            ship.delivery(deliveryPackage);
//            break;
//        case "truck":
//            truck.delivery(deliveryPackage);
//            break;
//        default:
//            System.out.println("Unrecognized transport type!");
//    }
//}
//}

    public void sendPackage(DeliveryPackage deliveryPackage, TransportTypes transportType) {
        switch (transportType) {
            case AIRPLANE:
                airplane.delivery(deliveryPackage);
                break;
            case SHIP:
                ship.delivery(deliveryPackage);
                break;
            case TRUCK:
                truck.delivery(deliveryPackage);
                break;
            default:
                System.out.println("Unrecognized transport type!");
        }
    }
}