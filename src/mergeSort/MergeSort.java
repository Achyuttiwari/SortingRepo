package mergeSort;

public class MergeSort {

    public void sort(int[] array, int sizeOfArray) {

        if (sizeOfArray > 1) {
            int halfSize = sizeOfArray / 2;

            int[] leftArray = new int[halfSize];
            int[] rightArray = new int[sizeOfArray - halfSize];

            System.arraycopy(array, 0, leftArray, 0, halfSize);
        }
    }
}
