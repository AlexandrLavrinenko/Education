package main.java.com.stepic.gl_2_1_primitive;

// Complete!
public class Evalution {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false, true, true));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int aint = (a == true) ? 1 : 0;
        int bint = (b == true) ? 1 : 0;
        int cint = (c == true) ? 1 : 0;
        int dint = (d == true) ? 1 : 0;
        return aint + bint + cint + dint == 2;
    }
}
