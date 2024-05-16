package quickSort;

public class QuickSort {
    public static void sort(int[] array, int leftIndex, int rightIndex) {
        int pivot = rightIndex;

        int partitionIndex = leftIndex;

        for (int i = leftIndex; i < rightIndex; i++) {
            if (array[i] <= pivot) {
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
    }

    private static void swap(int[] array, int i, int partitionIndex) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
