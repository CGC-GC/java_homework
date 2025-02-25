package PR24.interfaces;

public interface Order {
    boolean addItem(Item item);
    boolean removeItem(String name);
    int removeAll(String name);
    int getTotalCount();
    Item[] getItems();
    double getTotalCost();
    int getItemCount(String name);
    String[] getItemNames();
    Item[] getSortedItemsByCost();
}
