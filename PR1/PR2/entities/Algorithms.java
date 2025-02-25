package PR2.entities;
import java.util.Arrays;

public class Algorithms {

    public static void forArray(){
        int[] arr = {0, 1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++){
            System.out.println(i);
        }
    }
    public static void whileArray(){
        int i = 0;
        int[] arr = {0, 1, 2, 3, 4};
        while (i < 5){
            System.out.println(arr[i]);
            i ++;
        }
    }
    public static void doWhileArray(){
        int i = 0;
        int[] arr = {0, 1, 2, 3, 4};
        do{
            System.out.println(arr[i]);
            i ++;
        }
        while (i < 5);
    }
    public static void harmonicSeriesNum(){
        double i = 1.0;
        double sum = 1.0;
        while (i <= 10.0){
            sum += (1 / i);
            i ++;
        }
        System.out.println(sum);
    }
    public static int[] setRandomUnsortedArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
        }
        return array;
    }
    public static int[] setRandomSortedArray(){
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 30));
        }
        Arrays.sort(array);
        return array;
    }
    public static void getFactorial(){
        int number = 5;
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.print(factorial);
    }
}