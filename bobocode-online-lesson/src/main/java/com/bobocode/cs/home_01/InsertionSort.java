package com.bobocode.cs.home_01;

/**
 * Education
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 12.09.2021
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int curr = arr[i];
            int position = i - 1;
            while (position >= 0 && curr < arr[position]) {
                arr[position + 1] = arr[position];
                position--;
            }
            arr[position + 1] = curr;
        }
    }
}
