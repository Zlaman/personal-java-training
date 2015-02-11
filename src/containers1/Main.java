package containers1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;

public class Main {

    private static String i;

    public static void main(String[] args) {

        /*
         * // Использование без параметризации ArrayList apples = new
         * ArrayList(); for(int i = 0; i < 3; i++) apples.add(new Apple()); //
         * Добавлен объект другого типа -> Exception // apples.add(new
         * Orange()); for (int i = 0; i < apples.size(); i++)
         * ((Apple)apples.get(i)).id();
         */

        // Использование c параметризацией и восходящим преобразованием
        // ArrayList к List
        // Подход не всегда работает, т.к. ArrayList может иметь дополнительную
        // функциональность
        ArrayList<Fruit> apples = new ArrayList<Fruit>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        // Добавление объекта другого типа невозможно
        // apples.add(new Orange());
        for (Fruit c : apples) {
            System.out.println(c.id());
        }

        Iterator<Fruit> it = apples.iterator();
        while (it.hasNext()) {
            Fruit p = it.next();
            System.out.println(p);
        }

        /*
         * it = apples.iterator(); for (int i = 0; i < 3; i++){ Fruit f =
         * it.next(); // Вывод элемента, полученного next()
         * System.out.println(f); it.remove(); } System.out.println(apples);
         */

        // System.err.println("ListIterator");
        ListIterator<Fruit> li = apples.listIterator();
        while (li.hasNext())
            System.out.println(li.next() + ", " + li.nextIndex() + ", "
                    + li.previousIndex() + ":");

        int r = 0;
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++) {
            r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        for (Integer key : m.keySet()) {
            System.out.println(key + " имеет" + m.get(key));

        }
        System.out.println(m.get(r) + " " + m.containsKey(r) + " "
                + m.containsValue(5001));

        //
        for (Map.Entry<String, String> entry : System.getenv().entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }

}
