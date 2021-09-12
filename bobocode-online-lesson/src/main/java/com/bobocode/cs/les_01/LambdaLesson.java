package com.bobocode.cs.les_01;

import java.util.function.*;

/**
 * stepic
 *
 * @author Alexandr.Lavrinenko@gmail.com
 * @version 1.0
 * @since 19.08.2021
 */
public class LambdaLesson {
    public static void main(String[] args) {
        // Самописный Функциональный интерфейс
        Upper upper = s -> s.toUpperCase();
        System.out.println(upper.toUpperCaseInt("hello!"));

        // Используем уже готовый функциональный интерфейс
        Function<String, String> upperFunction = s -> s.toUpperCase();
        System.out.println(upperFunction.apply("hello!"));

        Function<String, Integer> strLength = s -> s.length();
        System.out.println(strLength.apply("Bobocode"));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));

        Consumer<String> toPrint = s -> System.out.println(s);
        toPrint.accept("Consumer print string");

        Supplier<String> addHello = () -> "Hello!";
        System.out.println(addHello.get());

        UnaryOperator<String> unaryString = s -> s.toLowerCase();
        System.out.println(unaryString.apply("TODO"));

        BiPredicate<String, String> compareString = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(compareString.test("hello", "HelLo"));

        // Так лучше не писать!
        Function<String, String> functionWithoutBlock = s -> {
            System.out.println(s);
            return s.toUpperCase();
        };
        System.out.println(functionWithoutBlock.apply("Without block"));

        Function<String, String> funcWithBlock = LambdaLesson::helperMethod;
        System.out.println(funcWithBlock.apply("with block - true"));
    }

    private static String helperMethod(String string) {
        System.out.println("\nЗапихнули блок кода в отдельный вспомогательный метод");
        return string.toUpperCase();
    }
}
