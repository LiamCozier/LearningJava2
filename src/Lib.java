import java.util.Arrays;
import java.util.Random;

public class Lib {

    Random r = new Random();

    public int[] fillIntArray(int arraySize) {
        int[] array = new int[arraySize];

        for (int i=0; i<array.length; i++) {
            array[i] = r.nextInt(10);
        }

        return array;
    }


    public void bubbleSort(int[] a) {
        boolean pass;

        do {
            pass = true;
            for (int i=0; i<a.length-1; i++) {
                if (a[i]>a[i+1]) {
                    pass = false;

                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            System.out.println(Arrays.toString(a));
        } while (!pass);
    }
}
