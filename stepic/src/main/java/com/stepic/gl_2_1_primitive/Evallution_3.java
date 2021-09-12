package main.java.com.stepic.gl_2_1_primitive;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 *
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 */

// Всё получилось! (4 попытка)
public class Evallution_3 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }
}
