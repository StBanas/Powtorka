package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DHLDeliveryService dhlDeliveryService = new DHLDeliveryService();
        DHLNotificationService dhlNotificationService = new DHLNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(dhlDeliveryService,dhlNotificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 48.2);
    }
}
