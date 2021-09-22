package com.bobocode.cs;

import java.util.Arrays;

/**
 * java-fundamentals-course
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 04.09.2021
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 4, 6, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Outer Iteration");
            for (int j = 0; j < n - i - 1; j++) {
                System.out.println("Inner iteration");
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
