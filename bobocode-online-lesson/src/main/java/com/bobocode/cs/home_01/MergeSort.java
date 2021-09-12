package com.bobocode.cs.home_01;

import java.util.Arrays;

/**
 * Education
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 12.09.2021
 */

/**
 * link: https://en.wikipedia.org/wiki/Merge_sort
 * 1.
 * Worst case merge sort time complexity [Big-O] (n*log N)
 * Best case merge sort time complexity [Big-O] (n*log N)
 *
 * Worst case insertion sort time complexity [Big-O] (n * n)
 * Best case insertion sort time complexity [Big-O] (n)
 *
 * Conclusion: It is always customary to consider worst time complexity and for this merge sort  will be faster
 * then insertion sort
 *
 * 2.
 * When we use merge sort if the capacity of the two arrays is 1 billion elements of long data type.
 * when we create helper array for save sort element of the same size to implement the algorithm will be
 * throw OutOfMemoryError
 *
 * When we use insertion sort all step and permutations of elements are performed in one array for this
 * we can't worry about memory.
 */

public class MergeSort {
    public static int[] sort(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }

        int[] first = Arrays.copyOfRange(arr, 0, len / 2);
        int[] second = Arrays.copyOfRange(arr, len / 2, len);

        first = sort(first);
        second = sort(second);

        return megre(first, second);
    }

    private static int[] megre(int[] first, int[] second) {
        int firstLen = first.length;
        int secondLen = second.length;
        int[] result = new int[firstLen + secondLen];

        int firstPosition = 0;
        int secondPosition = 0;
        int resultPosition = 0;

        while (firstPosition < firstLen && secondPosition < secondLen) {
            if (first[firstPosition] <= second[secondPosition]) {
                result[resultPosition++] = first[firstPosition++];
            } else{
                result[resultPosition++] = second[secondPosition++];
            }
        }

        if (firstPosition < firstLen) {
            System.arraycopy(first,firstPosition,result,resultPosition,firstLen-firstPosition);
        } else {
            System.arraycopy(second,secondPosition,result,resultPosition,secondLen-secondPosition);
        }

        return result;
    }
}
