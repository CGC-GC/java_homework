package PR21;
import PR21.entities.*;
import PR21.interfaces.Queue;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = null;

        while (true) {
            System.out.println("Выберите тип очереди:");
            System.out.println("1. Очередь на массиве");
            System.out.println("2. Очередь на связанном списке");
            System.out.println("3. Выход");
            int choice = scanner.nextInt();

            if (choice == 1) {
                queue = new ArrayQueue<>();
                System.out.println("Вы выбрали очередь на массиве.");
            } else if (choice == 2) {
                queue = new LinkedQueue<>();
                System.out.println("Вы выбрали очередь на связанном списке.");
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Неверный выбор, попробуйте снова.");
            }

            if (queue != null) {
                processQueue(scanner, queue);
            }
        }
    }

    private static void processQueue(Scanner scanner, Queue<Integer> queue) {
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить элемент в очередь");
            System.out.println("2. Показать первый элемент в очереди");
            System.out.println("3. Удалить и показать первый элемент в очереди");
            System.out.println("4. Показать размер очереди");
            System.out.println("5. Проверить, пуста ли очередь");
            System.out.println("6. Очистить очередь");
            System.out.println("7. Вернуться к выбору типа очереди");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите элемент: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    System.out.println("Элемент " + element + " добавлен в очередь.");
                    break;
                case 2:
                    try {
                        int firstElement = queue.element();
                        System.out.println("Первый элемент в очереди: " + firstElement);
                    } catch (NoSuchElementException e) {
                        System.out.println("Очередь пуста.");
                    }
                    break;
                case 3:
                    try {
                        int removedElement = queue.dequeue();
                        System.out.println("Удален и возвращен первый элемент: " + removedElement);
                    } catch (NoSuchElementException e) {
                        System.out.println("Очередь пуста.");
                    }
                    break;
                case 4:
                    int size = queue.size();
                    System.out.println("Размер очереди: " + size);
                    break;
                case 5:
                    boolean isEmpty = queue.isEmpty();
                    System.out.println("Очередь " + (isEmpty ? "пуста." : "не пуста."));
                    break;
                case 6:
                    queue.clear();
                    System.out.println("Очередь очищена.");
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
                    break;
            }
        }
    }
}
