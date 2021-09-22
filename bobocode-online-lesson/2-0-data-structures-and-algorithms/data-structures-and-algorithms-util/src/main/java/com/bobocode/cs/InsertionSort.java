package com.bobocode.cs;

import java.util.Arrays;

/**
 * java-fundamentals-course
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 04.09.2021
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 6, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            System.out.println("Outer Iteration");
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                System.out.println("Inner iteration");
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
