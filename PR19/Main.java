package PR19;
import java.util.*;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        // 1. Метод для конвертации массива строк/чисел в список.
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("List of strings: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("List of integers: " + intList);

        // 2. Класс, который умеет хранить в себе массив любых типов данных.
        Solution<Integer, String, Double> solution = new Solution<>(intArray);

        // 3. Реализация метода, который возвращает любой элемент массива по индексу.
        int index = 3;
        Integer element = solution.getElementByIndex(index);
        System.out.println("\nElement at index " + index + ": " + element);

        // 4. Функция, которая сохраняет содержимое каталога в список и выведет первые 5 элементов на экран.
        String directoryPath = "C:/Users/artem/Desktop"; // Замените на путь к каталогу
        List<File> filesInDirectory = listFilesInDirectory(directoryPath);
        System.out.println("\nFirst 5 files in the directory: " + filesInDirectory);

        // 5*. Реализация вспомогательных методов в классе Solution.
        List<String> stringArrayList = Solution.newArrayList("A", "B", "C");
        System.out.println("\nCreated ArrayList of strings: " + stringArrayList);

        Set<Integer> integerHashSet = Solution.newHashSet(1, 2, 3, 4, 5);
        System.out.println("Created HashSet of integers: " + integerHashSet);

        Map<String, Integer> stringIntegerHashMap = Solution.newHashMap(
                Map.entry("One", 1),
                Map.entry("Two", 2),
                Map.entry("Three", 3)
        );
        System.out.println("\nCreated HashMap of string to integer: " + stringIntegerHashMap);

    }

    public static <T>List<T>arrayToList(T[] array) {
        return Arrays.asList(array);
    }
    public static List<File> listFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        List<File> fileList = new ArrayList<>();
        if (files != null) {
            for (int i = 0; i < Math.min(files.length, 5); i++) {
                fileList.add(files[i]);
            }
        }
        return fileList;
    }
}

class Solution<T, K, V> {
    private T[] dataArray;

    public Solution(T[] dataArray) {
        this.dataArray = dataArray;
    }
    public T getElementByIndex(int index) {
        if (index >= 0 && index < dataArray.length) {
            return dataArray[index];
        }
        else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }
    // Вспомогательный метод для создания ArrayList
    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }
    // Вспомогательный метод для создания HashSet
    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }
    // Вспомогательный метод для создания HashMap
    public static <K, V> HashMap<K, V> newHashMap(Map.Entry<? extends K, ? extends V>... entries) {
        HashMap<K, V> map = new HashMap<>();
        for (Map.Entry<? extends K, ? extends V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
}
