package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService; // = new DHLDeliveryService();
    private NotificationService notificationService; // = new DHLNotificationService();

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

        public void sendPackage(String address, double weight ) {
            if (deliveryService.deliveryPackage(address, weight)) {
                notificationService.success(address);
            }
            else notificationService.fail(address);
        }
}
