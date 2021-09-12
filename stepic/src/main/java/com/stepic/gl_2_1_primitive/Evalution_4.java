package main.java.com.stepic.gl_2_1_primitive;
/*
https://stepik.org/lesson/12759/step/15?unit=3107

Чтобы поменять бит на противоположенный, необходимо использовать побитовый оператор ^ "ИЛИ",
который сравнивает побитово два числа и возвращает число, в котором в последовательности битов
меняет биты на противоположенные только в случае, если они равны 1.
Соответственно для такого сравнения необходимо создать битовую последовательность,
в которой только в позиции bitIndex будет 1, а остальные биты будут равны 0.
Например, изменение 7 бита в числе 150 будет выглядеть так: 10010110 ^ 01000000 = 11010110
(на самом деле второе число пишется 1000000, для наглядности слева добавил ноль).
Теперь самое главное - как создать это самое 1000000, с которым будет проводиться операция побитового "ИЛИ".
Для этого используем функцию побитового сдвига числа 1 влево на количество бит, указанное в bitIndex-1.
"-1", так как биты в JAVA нумеруются справа с нуля, а не с единицы.
Еще можно было просто возвести 2 в степень bitIndex-1, получили бы то же самое значение.
 */
/**
 * Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
 * Данная задача актуальна, например, при работе с битовыми полями.
 *
 * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
 * bitIndex  индекс бит, который нужно перевернуть, 1 <= bitIndex <= 32
 * новое значение с одним перевернутым битом
 *
 * Воспользуйтесь предоставленным шаблоном.
 * Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 */
public class Evalution_4 {
    public static void main(String[] args) {
        System.out.println(flipBit(13, 1));
    }

    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit1(int value, int bitIndex) {
        String strVal = Integer.toBinaryString(value);
        char[] chars = strVal.toCharArray();
        System.out.println(chars);
        for (char chr :chars) {
            System.out.println(chr);
        }
        System.out.println(chars.length-bitIndex);
        int newIndex = bitIndex - 1;
        String strBefore = strVal.substring(0, newIndex);
        String strIndexFlip = strVal.substring(newIndex,bitIndex);
        String strAfter = strVal.substring(bitIndex, strVal.length());

        String indexFlipped = (strIndexFlip.equals("0") ? "1" : "0");
        String newFlippedValue = strBefore + indexFlipped + strAfter;
        return Integer.parseInt(newFlippedValue, 2);
    }

    public static int flipBit(int value, int bitIndex) {
        return value^(1<<(bitIndex-1));
    }
}

/*
№ коробка:         8    7    6    5    4    3    2   1
"Коробок" :)      [ ]  [ ]  [ ]  [ ]  [ ]  [ ]  [ ] [ ]
Степень двойки:   128  64   32   16    8    4    2   1
 */