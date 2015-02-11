package cyclesAndInitialisation;

/**
 * My new class
 * 
 * @author Zalman
 */
public class Zalman {

    Zalman(String str) {
        System.out.println(str);
    }

    Zalman() {

    }

    /** My new variable */
    static String a = new String("xxx");

    /** My new method */
    static void print(String a) {
        System.out.println(a);
    }

    static void print(Integer b) {
        System.out.println(b);
    }

    static void print(Float c) {
    }

    public static void print(Object a) {
        System.err.println(a);
    }

}
