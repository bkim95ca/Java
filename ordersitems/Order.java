import java.util.*;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "somebody";
        this.items = new ArrayList<Item>();
    }

    public Order(String name, double total, boolean ready) {
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = new ArrayList<Item>();
    }

    public void addItems(Item items) {
        this.items.add(items);
    }
    //getter
    public String getName() {
        return this.name;
    }
    //setter
    public Order setName(String name) {
        this.name = name;
        return this;
    }

    //getter
    public double getTotal() {
        return this.total;
    }
    //setter
    public Order setTotal(double total) {
        this.total = total;
        return this;
    }

    //getter
    public boolean getReady() {
        return this.ready;
    }
    //setter
    public Order setReady(boolean ready) {
        this.ready = ready;
        return this;
    }
}

