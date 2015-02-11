package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

class MyClass {

}

public class Array {

    public static void main(String[] args) {
        Integer[] intg = new Integer[10];
        Random rand = new Random();
        // length отображает размер массива, а не количество содержащихся
        // элементов
        for (int i = 0; i < intg.length; i++) {
            if (intg[i] == null)
                intg[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(intg));

        // Конвертация массива в примитивный
        int[] toSearch = new int[intg.length];
        for (int i = 0; i < intg.length; i++) {
            toSearch[i] = intg[i];
        }

        // Простое заполнение массива либо диапазона элементов
        Arrays.fill(intg, 10);
        System.out.println(Arrays.toString(intg));
        Arrays.fill(intg, 3, 7, 999);
        System.out.println(Arrays.toString(intg));

        // Копирование массивов
        Integer[] intg2 = new Integer[15];
        System.arraycopy(intg, 0, intg2, 0, intg.length);
        System.out.println(Arrays.toString(intg2));

        // Сравнение массивов объектов
        String[] s1 = new String[4];
        String[] s2 = { new String("Hello"), new String("Hello"),
                new String("Hello"), new String("Hello") };
        Arrays.fill(s1, "Hello");
        System.out.println(Arrays.equals(s1, s2));
        s2[2] = "Hi";
        System.out.println(Arrays.equals(s1, s2));

        // Сортировка массивов
        s2[3] = "Ping";
        Arrays.sort(s2);
        System.out.println(Arrays.toString(s2));
        Arrays.sort(s2, Collections.reverseOrder());
        System.out.println(Arrays.toString(s2));
        Arrays.sort(s2, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(s2));

        // Поиск элементов массива
        Arrays.sort(toSearch);
        while (true) {
            int value = rand.nextInt(100);
            int index = Arrays.binarySearch(toSearch, value);
            if (index >= 0) {
                System.out.println("Позиция " + value + " в массиве "
                        + Arrays.toString(toSearch) + " равна " + index);
                break;
            }
        }

        // Способы инициализации
        MyClass[] mcls = new MyClass[] { new MyClass(), new MyClass() };
        MyClass[] mcls2 = { new MyClass(), new MyClass(), new MyClass() };

        // Многомерный массив
        int[][] multiArray = { { 1, 2, 3 }, { 4, 5, 6 }, };
        System.out.println(Arrays.deepToString(multiArray));

        // Многомерный массив с векторами переменной длины
        int[][][] multiArray3 = new int[rand.nextInt(7)][][];
        for (int i = 0; i < multiArray3.length; i++) {
            multiArray3[i] = new int[rand.nextInt(5)][];
            for (int j = 0; j < multiArray3[i].length; j++) {
                multiArray3[i][j] = new int[rand.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(multiArray3));

        // Инициализация многомерного массива
        Integer[][] multiIntArray;
        multiIntArray = new Integer[3][];
        for (int i = 0; i < multiIntArray.length; i++) {
            multiIntArray[i] = new Integer[3];
            for (int j = 0; j < multiIntArray[i].length; j++) {
                multiIntArray[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(multiIntArray));

    }
}