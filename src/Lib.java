import java.util.Random;

public class Lib {

    Random r = new Random();

    public int[] fillIntArray(int arraySize) {
        int[] array = new int[arraySize];

        for (int i=0; i<array.length; i++) {
            array[i] = r.nextInt(100);
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
        } while (!pass);
    }

    public int binarySearch(int[] a, int n) {
        int upperBound = a.length;
        int lowerBound = 0;
        int currentIndex=(upperBound+lowerBound)/2;

        while (upperBound-lowerBound>2) {

            System.out.printf("%d, %d, %d\n", lowerBound, currentIndex, upperBound);
            if (a[currentIndex] == n) {
                return currentIndex;
            }

            if (a[currentIndex] > n) {
                upperBound = currentIndex;
            } else {
                lowerBound = currentIndex;
            }

            currentIndex = (upperBound + lowerBound) / 2;
        }
        return -1;
    }
}
