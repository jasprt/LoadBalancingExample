public class Customer implements Runnable {

    public static Balancer balancer = new Balancer();

    public static void main(String[] args) {

        /* Two customers place order at same time, to avoid any delay use two threads
        distribute equally to both shops using a common balancer which re routes orders
        to maximize optimization and least time
        */
        try {
            Thread t1 = new Thread(new Customer());
            Thread t2 = new Thread(new Customer());
            t1.start();
            t2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        balancer.getrequest();
        balancer.balance();
    }
}