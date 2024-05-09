package main;

import bubbleSort.BubbleSort;
import insertionSort.InsertionSort;
import mergeSort.MergeSort;
import selectionSort.SelectionSort;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner  = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(array));
        System.out.println("Press 1 to sort this array using Bubble Sort.!!");
        System.out.println("Press 2 to sort this array in Selection Sort.!!");
        System.out.println("Press 3 to sort this array in Insertion Sort.!!");
        System.out.println("Press 4 to sort this array in Merge Sort.!!");
        System.out.println("Press 5 to sort this array in Quick Sort.!!");
        int choice = scanner.nextInt();
        switch(choice){
            case 1: /*BUBBLE SORT*/
                BubbleSort bubblesort = new BubbleSort();
                bubblesort.sort(array, (int) Math.ceil(Math.random()));
                System.out.println("ARRAY SORTED BY BUBBLE SORT");
                System.out.println(Arrays.toString(array));
                break;
            case 2: /*Selection Sort*/
                SelectionSort selectionsort = new SelectionSort();
                selectionsort.sort(array);
                System.out.println("ARRAY SORTED BY SELECTION SORT:");
                break;
            case 3: /*Insertion Sort*/
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.sort(array);
                break;
            case 4: /*Merge Sort*/
                MergeSort mergeSort = new MergeSort();
                mergeSort.sort(array, sizeOfArray);
                System.out.println(Arrays.toString(array));
                break;
            case 5: /* Quick Sort */
                QuickSort quickSort = new Quicksort();
        }


        scanner.close();
    }
}