package main.java.com.stepic.gl_2_2_cast_types;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
 * (обратный слэш) на расстоянии a.
 */
public class Evalution_1 {
    public static void main(String[] args) {
        System.out.println(charExpression(29));
    }

    public static char charExpression(int a) {
        char slash = '\\';
        int result = slash + a;
        return (char) result;
    }
}
