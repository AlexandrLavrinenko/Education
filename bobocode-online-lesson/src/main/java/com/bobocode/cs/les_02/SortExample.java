package com.bobocode.cs.les_02;

/**
 * stepic
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 23.08.2021
 */
public class SortExample {
    public static void main(String[] args) {
        int[] input = {4,5,2,6,1};
        arrPrint(sortIntArr(input));
    }

    public static int[] sortIntArr(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int one = input[i];
            int two = input[i - 1];
            if (input[i] < input[i - 1]) {
                input[i] = two;
                input[i-1] = one;
            }
        }
        return input;
    }

    public static void arrPrint(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
