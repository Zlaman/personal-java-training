package arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public native void test();

    public static void main(String[] args) {
        Newclass a = new Newclass();
        /*
         * Newclass b = new Newclass(); a.printer("AAA");
         * b.printer("BBB").printer("ccc");
         */

        // ТАК ДЕЛАТЬ НЕЛЬЗЯ. я этим не инициализирую массив, т.к. g принимает
        // значение элементов массива.
        Double f[] = new Double[1000];
        Random rand = new Random();
        for (int i = 0; i < f.length; i++) {
            f[i] = rand.nextDouble();
        }

        Newclass x = null;

        /*
         * public void finalize(){ System.out.println("МУСОР"); }
         */
        // Инициализация массива
        Integer[] a1 = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(a1[6]);
            System.out.println(Arrays.toString(a1));
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.err.println(e);
        }
        int[] z = { 1, 2, 3, 4, 5 };
        System.out.println(z.length);
        int intg = 200;
        Person p1 = new Person();
        p1.setAge(100);
        p1.setName("Вася");
        Person p2 = new Person();
        p2.setAge(100);
        p2.setName("Вася");
        System.out.println(p1.equals(p2));
        Main m = new Main();
        m.test();
    }

}