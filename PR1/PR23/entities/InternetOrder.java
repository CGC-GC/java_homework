package PR23.entities;
import PR23.interfaces.*;
import java.util.*;

public class InternetOrder {
    private static class Node {
        Item item;
        Node next;
        Node prev;

        Node(Item item) {
            this.item = item;
            this.next = this;
            this.prev = this;
        }
    }

    private Node head;
    private int size;

    public InternetOrder() {
        head = new Node(null); // Голова списка
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            addItem(item);
        }
    }

    public boolean addItem(Item item) {
        Node newNode = new Node(item);
        newNode.next = head;
        newNode.prev = head.prev;
        head.prev.next = newNode;
        head.prev = newNode;
        size++;
        return true;
    }

    public boolean removeItem(String name) {
        Node current = head.prev;
        while (current != head) {
            if (current.item.getName().equalsIgnoreCase(name)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
                return true;
            }
            current = current.prev;
        }
        return false;
    }

    public int removeAll(String name) {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            if (current.item.getName().equalsIgnoreCase(name)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                count++;
                size--;
            }
            current = current.next;
        }
        return count;
    }

    public int getTotalCount() {
        return size;
    }

    public Item[] getItems() {
        List<Item> itemList = new ArrayList<>();
        Node current = head.next;
        while (current != head) {
            itemList.add(current.item);
            current = current.next;
        }
        return itemList.toArray(new Item[0]);
    }

    public double getTotalCost() {
        double totalCost = 0;
        Node current = head.next;
        while (current != head) {
            totalCost += current.item.getCost();
            current = current.next;
        }
        return totalCost;
    }

    public int getItemCount(String name) {
        int count = 0;
        Node current = head.next;
        while (current != head) {
            if (current.item.getName().equalsIgnoreCase(name)) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public String[] getItemNames() {
        Set<String> uniqueNames = new HashSet<>();
        Node current = head.next;
        while (current != head) {
            uniqueNames.add(current.item.getName());
            current = current.next;
        }
        return uniqueNames.toArray(new String[0]);
    }

    public Item[] getSortedItemsByCost() {
        Item[] sortedItems = getItems();
        Arrays.sort(sortedItems, Comparator.comparingDouble(Item::getCost).reversed());
        return sortedItems;
    }
}