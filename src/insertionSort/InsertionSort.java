package insertionSort;

public class InsertionSort {

    public void sort(int[] array) {
        for (int nextIndex = 1; nextIndex < array.length; nextIndex++) {
            insert(array, nextIndex);
        }
    }

    static void insert(int[] array, int nextIndex) {
        int nextValue = array[nextIndex];
        while (nextIndex > 0 && nextValue < array[nextIndex - 1]) {
            array[nextIndex] = array[nextIndex - 1];
            nextIndex--;
        }
        array[nextIndex] = nextValue;
    }

}
