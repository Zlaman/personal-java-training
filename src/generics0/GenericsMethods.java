package generics0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsMethods {

    // Бесконечная перегрузка
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    // Приём списка аргументов
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        GenericsMethods gm = new GenericsMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
        Map<String, List<String>> sls = GenericsMethods.map();

        List<String> ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
        System.out.println(ls);

    }

}
