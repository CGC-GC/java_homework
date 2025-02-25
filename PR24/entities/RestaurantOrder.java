package PR24.entities;
import java.util.*;
import PR24.interfaces.*;

public class RestaurantOrder implements Order {
    private final List<Item> items;

    public RestaurantOrder() {
        items = new ArrayList<>();
    }
    public boolean addItem(Item item) {
        return items.add(item);
    }
    public boolean removeItem(String name) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public int removeAll(String name) {
        int count = 0;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }
    public int getTotalCount() {
        return items.size();
    }
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }
    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
    public int getItemCount(String name) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                count++;
            }
        }
        return count;
    }
    public String[] getItemNames() {
        Set<String> uniqueNames = new HashSet<>();
        for (Item item : items) {
            uniqueNames.add(item.getName());
        }
        return uniqueNames.toArray(new String[0]);
    }
    public Item[] getSortedItemsByCost() {
        Item[] sortedItems = items.toArray(new Item[0]);
        Arrays.sort(sortedItems, (item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return sortedItems;
    }
}
