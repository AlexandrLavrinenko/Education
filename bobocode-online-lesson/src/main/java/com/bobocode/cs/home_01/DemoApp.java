package com.bobocode.cs.home_01;

import java.util.Arrays;

/**
 * Education
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 12.09.2021
 */
public class DemoApp {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 6, 1};
        System.out.println("Insertion Sort: ");
        InsertionSort.sort(array);
        System.out.println(Arrays.toString(array));

        int[] arr = {2, 5, 4, 6, 1};
        System.out.println("Megre Sort: ");
        int[] result = MergeSort.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
