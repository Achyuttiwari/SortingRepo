package main;

import bubbleSort.BubbleSort;

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
        int choice = scanner.nextInt();
        switch(choice){
            case 1: /*BUBBLE SORT*/
                BubbleSort bubblesort = new BubbleSort();
                bubblesort.sort(array, (int) Math.ceil(Math.random()));
                System.out.println("ARRAY SORTED BY BUBBLE SORT");
                System.out.println(Arrays.toString(array));
        }


        scanner.close();
    }
}