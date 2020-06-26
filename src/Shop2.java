public class Shop2 {

    private static Chef chef = new Chef();
    public static int NO_OF_ORDERS = 3;
    public boolean isOpen = true; // Set to true if shop is open for orders

    // 1 order at work/Shop as we have 1 chef.
    public synchronized void Order() {
        System.out.println("Shop2 is open");
        try {
            System.out.println(NO_OF_ORDERS+" Orders received");
            for (int i = 1; i <= NO_OF_ORDERS; i++){
                chef.makepizza(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}