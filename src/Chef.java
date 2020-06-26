public class Chef {

    public static Delivery deliver = new Delivery();

    public void makepizza(int OrderNo) throws InterruptedException {
        System.out.println("Making pizza for Order Number: "+OrderNo);
        Thread.sleep(2000);
        System.out.println("Order "+OrderNo+" is Prepared, Despathing now");
        deliver.DeliverOrder(OrderNo);
    }
}
