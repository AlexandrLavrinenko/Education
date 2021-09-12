package com.bobocode.cs.les_01;

import java.util.LinkedList;
import java.util.List;

/**
 * stepic
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 19.08.2021
 */
public class StackOverFlowErrorAndOutOfMemoryError {
    public static void main(String[] args) {
        //outOfMemoryError(); // worked!
        stackOverflowError(1);  // worked!
    }

    public static void stackOverflowError(int i) {
        stackOverflowError(i);
        System.out.println(i);
    }

    private static List<Object> consumeAvailableMemory() {
        LinkedList<Object> holder = new LinkedList<Object>();
        while (true) {
            try {
                holder.add(new byte[128 * 1024]);
            } catch (OutOfMemoryError ex) {
                holder.removeLast();
                return holder;
            }
        }
    }

    public static void outOfMemoryError() {
        List<Object> fixedData = consumeAvailableMemory();
        while (true) {
            Object data = new byte[64 * 1024 - 1];
            fixedData.add(data);
        }
    }
}