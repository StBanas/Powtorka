package message.delivery;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransportTestSuite {
    
    public void correctIfNullIsPassed() {

        //given
        DeliveryPackage deliveryPackage = new DeliveryPackage("Book", "Clean Code", "New York City");
        DeliveryService deliveryService = new DeliveryService();
        //when
        deliveryService.sendPackage(deliveryPackage, TransportTypes.SHIP);
        //Then
        assertEquals("Book",deliveryPackage.getPackageName());


    }
}
