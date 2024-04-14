package selectionSort;

public class SelectionSort {
    public void sort(int[] array) {
        for (int fill = 0; fill < array.length; fill++) {
            int poseMin = fill;
            for (int next = fill + 1; next < array.length - 1; next++) {
                if (array[next] < array[fill]) poseMin = next;
            }

        swap(array, fill, poseMin);
    }
    }
    private void swap(int[] array, int fill, int poseMin){

    }
}
