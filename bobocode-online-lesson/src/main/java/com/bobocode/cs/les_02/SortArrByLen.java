package com.bobocode.cs.les_02;

import java.util.Arrays;
import java.util.Comparator;

/**
 * stepic
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 05.09.2021
 */
public class SortArrByLen {
    public static void sortByLen(String[] str, Sort direction) {
        if (direction.equals(Sort.ASC)) {
            Arrays.sort(str, Comparator.comparingInt(String::length));
        }else {
            Arrays.sort(str, Comparator.comparingInt(String::length).reversed());
        }
    }
}
