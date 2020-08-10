package message.delivery;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransportTestSuite {

    @Test
    public void correctIfNullIsPassed() {

        //given
        DeliveryPackage deliveryPackage = new DeliveryPackage("Book", "Clean Code", "New York City");
        DeliveryService deliveryService = new DeliveryService();
        //when
        deliveryService.sendPackage(deliveryPackage, TransportTypes.SHIP);
        String result = deliveryPackage.getPackageName().toString();


        System.out.println(result);
        //Then
        assertEquals("Book", result);




    }
}
