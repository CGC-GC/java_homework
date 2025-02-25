package PR24.entities;
import java.util.*;
import PR24.interfaces.*;

public class OrderManager {
    private final Map<String, Order> orders;

    public OrderManager() {
        orders = new HashMap<>();
    }
    public void addOrder(String address, Order order) {
        if (orders.containsKey(address)) {
            throw new OrderAlreadyAddedException("Order already added for address: " + address);
        }
        orders.put(address, order);
    }
    public Order getOrder(String address) {
        if (!orders.containsKey(address)) {
            throw new IllegalArgumentException("No order found for address: " + address);
        }
        return orders.get(address);
    }
    public void removeOrder(String address) {
        if (!orders.containsKey(address)) {
            throw new IllegalArgumentException("No order found for address: " + address);
        }
        orders.remove(address);
    }
    public void addItemToOrder(String address, Item item) {
        if (!orders.containsKey(address)) {
            throw new IllegalArgumentException("No order found for address: " + address);
        }
        orders.get(address).addItem(item);
    }
    public String[] getAddresses() {
        return orders.keySet().toArray(new String[0]);
    }
    public double getTotalOrdersCost() {
        double totalCost = 0;
        for (Order order : orders.values()) {
            totalCost += order.getTotalCost();
        }
        return totalCost;
    }
    public int getTotalItemCount(String itemName) {
        int count = 0;
        for (Order order : orders.values()) {
            count += order.getItemCount(itemName);
        }
        return count;
    }
    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }
}
