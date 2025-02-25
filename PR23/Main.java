package PR23;
import PR23.entities.*;
import PR23.interfaces.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        InternetOrder internetOrder = new InternetOrder();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить напиток");
            System.out.println("2. Добавить блюдо");
            System.out.println("3. Удалить позицию");
            System.out.println("4. Посчитать общую стоимость");
            System.out.println("5. Вывести все позиции");
            System.out.println("6. Вывести уникальные наименования");
            System.out.println("7. Вывести отсортированные по стоимости");
            System.out.println("8. Вывести все позиции. Интернет заказ");
            System.out.println("9. Удалить позицию. Интернет заказ");
            System.out.println("10. Вывести общую стоимость. Интернет заказ");
            System.out.println("11. Вывести уникальные наименования. Интернет заказ");
            System.out.println("12. Вывести отсортированные по стоимости. Интернет заказ");
            System.out.println("13. Вывести число позиций в заказе. Интернет заказ");
            System.out.println("14. Удалить все позиции с именем. Интернет заказ");
            System.out.println("15. Вывести количество товаров по имени. Интернет заказ");
            System.out.println("16. Выйти");

            System.out.print("\nВыберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nВведите название напитка: ");
                    String drinkName = scanner.nextLine();
                    System.out.print("\nВведите описание напитка: ");
                    String drinkDescription = scanner.nextLine();
                    System.out.print("\nВведите стоимость напитка: ");
                    double drinkCost = scanner.nextDouble();
                    scanner.nextLine();
                    Drink drink = new Drink(drinkCost, drinkName, drinkDescription);
                    order.addItem(drink);
                    internetOrder.addItem(drink);
                    System.out.println("\nНапиток добавлен в заказ.");
                    break;
                case 2:
                    System.out.print("\nВведите название блюда: ");
                    String dishName = scanner.nextLine();
                    System.out.print("\nВведите описание блюда: ");
                    String dishDescription = scanner.nextLine();
                    System.out.print("\nВведите стоимость блюда: ");
                    double dishCost = scanner.nextDouble();
                    scanner.nextLine();
                    Dish dish = new Dish(dishCost, dishName, dishDescription);
                    order.addItem(dish);
                    internetOrder.addItem(dish);
                    System.out.println("\nБлюдо добавлено в заказ.");
                    break;
                case 3:
                    System.out.print("\nВведите название позиции для удаления: ");
                    String itemToRemove = scanner.nextLine();
                    if (order.removeItem(itemToRemove)) {
                        System.out.println("\nПозиция удалена из заказа.");
                    } else {
                        System.out.println("\nПозиция не найдена в заказе.");
                    }
                    break;
                case 4:
                    System.out.println("\nОбщая стоимость заказа: $" + order.getTotalCost());
                    break;
                case 5:
                    for (Item item : order.getItems()) {
                        System.out.println(item.getName() + " - $" + item.getCost());
                    }
                    break;
                case 6:
                    for (String name : order.getItemNames()) {
                        System.out.println(name);
                    }
                    break;
                case 7:
                    for (Item item : order.getSortedItemsByCost()) {
                        System.out.println(item.getName() + " - $" + item.getCost());
                    }
                    break;
                case 8:
                    for (Item item : internetOrder.getItems()) {
                        System.out.println(item.getName() + " - $" + item.getCost());
                    }
                    break;
                case 9:
                    System.out.print("\nВведите название позиции для удаления (Интернет заказ): ");
                    String internetRemove = scanner.nextLine();
                    if (internetOrder.removeItem(internetRemove)) {
                        System.out.println("\nПозиция удалена.");
                    } else {
                        System.out.println("\nПозиция не найдена.");
                    }
                    break;
                case 10:
                    System.out.println("\nОбщая стоимость интернет-заказа: $" + internetOrder.getTotalCost());
                    break;
                case 11:
                    for (String name : internetOrder.getItemNames()) {
                        System.out.println(name);
                    }
                    break;
                case 12:
                    for (Item item : internetOrder.getSortedItemsByCost()) {
                        System.out.println(item.getName() + " - $" + item.getCost());
                    }
                    break;
                case 13:
                    System.out.println("\nОбщее количество позиций в интернет-заказе: " + internetOrder.getTotalCount());
                    break;
                case 14:
                    System.out.print("\nВведите название позиции для удаления всех копий: ");
                    String removeAllName = scanner.nextLine();
                    System.out.println("\nУдалено " + internetOrder.removeAll(removeAllName) + " позиций.");
                    break;
                case 15:
                    System.out.print("\nВведите название позиции: ");
                    String countName = scanner.nextLine();
                    System.out.println("\nКоличество: " + internetOrder.getItemCount(countName));
                    break;
                case 16:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nНеверный выбор.");
            }
        }
    }
}