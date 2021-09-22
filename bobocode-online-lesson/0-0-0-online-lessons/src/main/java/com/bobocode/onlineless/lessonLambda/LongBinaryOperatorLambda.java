package main.java.com.bobocode.onlineless.lessonLambda;

import java.util.function.LongBinaryOperator;

/**
 * java-fundamentals-course
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 09.09.2021
 */
public class LongBinaryOperatorLambda {

    public static void main(String[] args) {
        LongBinaryOperator lbo = (var1, var2) -> (var1 + var2);
        long result = lbo.applyAsLong(1L, 2L);
        System.out.println(result);
    }
}
