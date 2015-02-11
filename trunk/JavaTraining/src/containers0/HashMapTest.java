package containers0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("1", "Hello");
        hm.put("2", "Hi");
        // перезапись
        hm.put("3", "Test");
        hm.put("12", "Hyi");
        // коллизия,
        hm.put("idx", "two");
        // Итераторы
        for (Map.Entry<String, String> entry : hm.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());

        // 2.
        for (String key : hm.keySet())
            System.out.println(hm.get(key));

        // 3.
        Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
