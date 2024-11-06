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

    public boolean isSorted(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            if (a[i]>a[i+1]) {
                return false;
            }
        }
        return true;
    }
    public void swapIndexes(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }

    public void bogoSort(int[] a) {
        while (!isSorted(a)) {

            int i1 = r.nextInt(a.length)-1;
            int i2 = r.nextInt(a.length)-1;

            swapIndexes(a, i1, i2);
        }
    }

    public void insertionSort(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            int currentValue = a[i+1];

            int j=0;
            do {

            } while (true);
        }
    }

    public void bubbleSort(int[] a) {
        do {
            for (int i=0; i<a.length-1; i++) {
                if (a[i]>a[i+1]) {
                    swapIndexes(a, i, i+1);
                }
            }
        } while (!isSorted(a));
    }

    public int linearSearch(int[] a, int n) {
        int currentIndex = 0;

        while (currentIndex<a.length) {
            currentIndex++;

            if (a[currentIndex]==n) {
                return currentIndex;
            }

        }
        return -1;
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
