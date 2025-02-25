package PR24;
import PR24.entities.*;
import PR24.interfaces.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager orderManager = new OrderManager();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Создать заказ по адресу");
            System.out.println("2. Добавить позицию к заказу");
            System.out.println("3. Удалить заказ по адресу");
            System.out.println("4. Вывести все адреса заказов");
            System.out.println("5. Вывести общую стоимость всех заказов");
            System.out.println("6. Вывести общее количество заказанных позиций по названию");
            System.out.println("7. Вывести все заказы по адресу");
            System.out.println("8. Вывести интернет-заказы");
            System.out.println("9. Вывести общее количество интернет-заказов");
            System.out.println("10. Выйти");

            System.out.print("\nВыберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера после считывания числа

            switch (choice) {
                case 1:
                    System.out.print("\nВведите адрес для создания заказа: ");
                    String address = scanner.nextLine();
                    Order newOrder = new RestaurantOrder();
                    orderManager.addOrder(address, newOrder);
                    System.out.println("\nЗаказ создан по адресу: " + address);
                    break;
                case 2:
                    System.out.print("\nВведите адрес заказа для добавления позиции: ");
                    String orderAddress = scanner.nextLine();
                    if (Arrays.asList(orderManager.getAddresses()).contains(orderAddress)) {
                        System.out.print("\nВведите тип позиции (Dish/Drink): ");
                        String itemType = scanner.nextLine();
                        System.out.print("\nВведите название позиции: ");
                        String itemName = scanner.nextLine();
                        System.out.print("\nВведите описание позиции: ");
                        String itemDescription = scanner.nextLine();
                        System.out.print("\nВведите стоимость позиции: ");
                        double itemCost = scanner.nextDouble();
                        scanner.nextLine(); // Очистка буфера после считывания числа

                        Item item;
                        if ("Dish".equalsIgnoreCase(itemType)) {
                            item = new Dish(itemCost, itemName, itemDescription);
                        } else if ("Drink".equalsIgnoreCase(itemType)) {
                            item = new Drink(itemCost, itemName, itemDescription);
                        } else {
                            System.out.println("\nНеверный тип позиции. Допустимые значения: Dish, Drink.");
                            continue;
                        }

                        orderManager.addItemToOrder(orderAddress, item);
                        System.out.println("\nПозиция добавлена к заказу по адресу: " + orderAddress);
                    } else {
                        System.out.println("\nЗаказ с таким адресом не существует.");
                    }
                    break;
                case 3:
                    System.out.print("\nВведите адрес заказа для удаления: ");
                    String orderToRemove = scanner.nextLine();
                    if (Arrays.asList(orderManager.getAddresses()).contains(orderToRemove)) {
                        orderManager.removeOrder(orderToRemove);
                        System.out.println("\nЗаказ по адресу " + orderToRemove + " удален.");
                    } else {
                        System.out.println("\nЗаказ с таким адресом не существует.");
                    }
                    break;
                case 4:
                    String[] addresses = orderManager.getAddresses();
                    if (addresses.length == 0) {
                        System.out.println("\nНет активных заказов.");
                    } else {
                        System.out.println("\nАдреса заказов:");
                        for (String addr : addresses) {
                            System.out.println(addr);
                        }
                    }
                    break;
                case 5:
                    double totalCost = orderManager.getTotalOrdersCost();
                    System.out.println("\nОбщая стоимость всех заказов: $" + totalCost);
                    break;
                case 6:
                    System.out.print("\nВведите название позиции: ");
                    String itemToCount = scanner.nextLine();
                    int itemCount = orderManager.getTotalItemCount(itemToCount);
                    System.out.println("\nОбщее количество заказанных позиций " + itemToCount + ": " + itemCount);
                    break;
                case 7:
                    System.out.print("\nВведите адрес заказа для вывода: ");
                    String orderToPrint = scanner.nextLine();
                    if (Arrays.asList(orderManager.getAddresses()).contains(orderToPrint)) {
                        Order selectedOrder = orderManager.getOrder(orderToPrint);
                        Item[] itemsInOrder = selectedOrder.getItems();
                        if (itemsInOrder.length == 0) {
                            System.out.println("\nЗаказ пуст.");
                        } else {
                            System.out.println("\nЗаказ по адресу " + orderToPrint + ":");
                            for (Item item : itemsInOrder) {
                                System.out.println("\nНазвание: " + item.getName() + ", Стоимость: $" + item.getCost());
                            }
                        }
                    } else {
                        System.out.println("\nЗаказ с таким адресом не существует.");
                    }
                    break;
                case 8:
                    System.out.println("\nИнтернет-заказы:");
                    for (Order order : orderManager.getOrders()) {
                        if (order instanceof InternetOrder) {
                            Item[] internetItems = order.getItems();
                            if (internetItems.length > 0) {
                                System.out.println("\nАдрес: " + orderManager.getAddresses()[Arrays.asList(orderManager.getAddresses()).indexOf(order)]);
                                for (Item item : internetItems) {
                                    System.out.println("\nНазвание: " + item.getName() + ", Стоимость: $" + item.getCost());
                                }
                            } else {
                                System.out.println("\nЗаказ по адресу " + orderManager.getAddresses()[Arrays.asList(orderManager.getAddresses()).indexOf(order)] + " пуст.");
                            }
                        }
                    }
                    break;
                case 9:
                    int internetOrderCount = 0;
                    for (Order order : orderManager.getOrders()) {
                        if (order instanceof InternetOrder) {
                            internetOrderCount++;
                        }
                    }
                    System.out.println("\nОбщее количество интернет-заказов: " + internetOrderCount);
                    break;
                case 10:
                    System.out.println("\nВыход из программы.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nНеверный выбор. Попробуйте еще раз.");
            }
        }
    }
}