import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Lib l = new Lib();

        int[] array = l.fillIntArray(100);
        l.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int n = r.nextInt(100);
        System.out.printf("Number: %d\nIndex: %d\n", n, l.binarySearch(array, n));
    }
}
