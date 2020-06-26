public class Balancer {

     int requestId = 0;
     static int NO_OF_SHOPS = 2;
     static Shop1 shop1 = new Shop1();
     static Shop2 shop2 = new Shop2();

    // Common method to distribute equal load across two shops
    public void balance(){
        //If both shops are closed, inform user back with same.
        if(!shop1.isOpen & !shop2.isOpen){
            System.out.println("All shops are closed for today, please try again later!");
            return;
        }
        // All requests go to shop1 for odd order requests ID or if shop2 is closed.
        // else routed to shop2
        if ((requestId % NO_OF_SHOPS != 0 || !shop2.isOpen) & shop1.isOpen){
            System.out.println("Making order in Shop 1");
            shop1.Order();
        } else {
            System.out.println("Making order in Shop 2");
            shop2.Order();
        }
    }

    // Fetch Unique requestId which helps in load balancing later.
    public synchronized int getrequest(){
        return requestId++;
    }

}