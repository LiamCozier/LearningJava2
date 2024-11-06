import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Lib l = new Lib();

        int[] array = l.fillIntArray(20);
        l.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int n = r.nextInt(20);
        System.out.printf("Number: %d\nIndex: %d\n", n, l.linearSearch(array, n));
    }
} 
