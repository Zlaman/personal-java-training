package containers0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "obj1");
        linkedHashMap.put(15, "obj15");
        linkedHashMap.put(4, "obj4");
        linkedHashMap.put(38, "obj38");

        // 1. Итераторы
        Iterator<Entry<Integer, String>> itr1 = linkedHashMap.entrySet()
                .iterator();
        while (itr1.hasNext()) {
            Entry<Integer, String> entry = itr1.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 2.
        Iterator<Integer> itr2 = linkedHashMap.keySet().iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());

        // 3.
        Iterator<String> itr3 = linkedHashMap.values().iterator();
        while (itr3.hasNext())
            System.out.println(itr3.next());
    }

}
