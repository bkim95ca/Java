public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        int dripCoffee = 3;
        double latte = 4.5;
        double cappuccino = 5.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        System.out.println(generalGreeting + customer2);
        System.out.println(customer2 + readyMessage + displayTotalMessage + cappuccino);
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + latte*2);
        if (isReadyOrder3 = false) {
            System.out.println(customer3 + pendingMessage);
        } else {
            System.out.println(customer3 + readyMessage);
        }
        System.out.println(generalGreeting + customer4);
        System.out.println(displayTotalMessage + (dripCoffee-latte));
    }
}

