package main.java.com.stepic.gl_2_2_cast_types;

/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 * <p>
 * Решать можно разными способами:
 * <p>
 * - воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * - применив пару трюков из двоичной арифметики;
 * - написав решение "в лоб" с циклом и условными операторами
 * (можете вернуться к этой задаче после просмотра соответствующих уроков).
 */
public class Evalution_2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        if (value == 0) {
            return false;
        } else {
            int res = Math.abs(value);
            return (res & (res - 1)) == 0;
        }
    }
}
