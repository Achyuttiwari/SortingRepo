package mergeSort;

public class MergeSort {

    public void sort(int[] array, int sizeOfArray) {

        if (sizeOfArray > 1) {
            int halfSize = sizeOfArray / 2;

            int[] leftArray = new int[halfSize];
            int[] rightArray = new int[sizeOfArray - halfSize];

            System.arraycopy(array, 0, leftArray, 0, halfSize);
            System.arraycopy(array, halfSize, rightArray, 0,
                    sizeOfArray - halfSize);

            sort(leftArray, leftArray.length);  //{x}
            sort(rightArray, rightArray.length);  //{y}

            merge(array, leftArray, rightArray);   //({ x, y }, { x }, { y }})
        }
    }

    // merge({x, y}, l {x}, r {y})
    private static void merge(int[] outputArray, int[] leftArray, int[] rightArray) {
        int i = 0;       //for leftArray
        int j = 0;       //for rightArray
        int k = 0;       //for outputArray

        while(i < leftArray.length && j < rightArray.length ){
            if(leftArray[i] < rightArray[j])
                outputArray[k++] = leftArray[i++];
            else outputArray[k++] = rightArray[j++];
        }
    }

}
