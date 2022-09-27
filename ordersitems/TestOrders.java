import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri", 4.5, true); 
        Order order2 = new Order("Jimmy", 4.5, true); 
        Order order3 = new Order("Noah", 4.5, true); 
        Order order4 = new Order("Sam", 4.5, true); 
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 3.0);
        Item item4 = new Item("cappuccino", 3.75);

        String name = order1.getName();
        double total = order1.getTotal();
        Boolean ready = order1.getReady();
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", item1.name);
        System.out.printf("Total: %s\n", total);
        System.out.printf("Ready: %s\n", ready);                                                                                   
    }
}

