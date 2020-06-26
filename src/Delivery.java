public class Delivery {

    public void DeliverOrder(int DeliveryNumber) throws InterruptedException {
        System.out.println("Delivering order number "+DeliveryNumber+" to Customer");
        Thread.sleep(2000);
        System.out.println("Order "+DeliveryNumber+" Delivered");
    }
}
