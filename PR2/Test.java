package PR2;
import PR2.entities.Algorithms;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        //Задание 1
        System.out.println("Output with 'for'");
        Algorithms.forArray();
        System.out.println("\nOutput with 'while'");
        Algorithms.whileArray();
        System.out.println("\nOutput with 'do...while'");
        Algorithms.doWhileArray();

        //Задание 2
        System.out.println("");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        //Задание 3
        System.out.println("\nHarmonic series");
        Algorithms.harmonicSeriesNum();

        //Задание 4
        System.out.println("\nRandom unsorted array");
        System.out.println(Arrays.toString(Algorithms.setRandomUnsortedArray()));
        System.out.println("\nRandom sorted array");
        System.out.println(Arrays.toString(Algorithms.setRandomSortedArray()));

        //Задание 5
        System.out.println("\nFactorial of 5");
        Algorithms.getFactorial();
    }
}