package com.bobocode.fp.classworks;

import java.util.stream.Stream;

/**
 * Education
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 13.09.2021
 */
public class StreamDemo {
    public static void main(String[] args) {
        Stream.iterate("A", prevStr -> prevStr + (char) prevStr.charAt(prevStr.length() - 1))
                .limit(26)
                .forEach(System.out::println);
    }
}
