import java.util.*;
import java.text.*;
public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i; 
        }
        return sum;
    }

    public double getOrderTotal(double[] price) {
        double sum = 0;
        for (int i = 0; i < price.length; i++) {
            sum += price[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s, people ahead of you. \n", customers.size()-1);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
            for (int i = 1; i <= maxQuantity; i++) {
                Locale usa = new Locale("en", "US");
                // Create a Currency instance for the Locale
                Currency dollars = Currency.getInstance(usa);
                // Create a formatter given the Locale
                NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usa);
                System.out.println(i + " - "+ dollarFormat.format(i*price));
            }
        }
    }
