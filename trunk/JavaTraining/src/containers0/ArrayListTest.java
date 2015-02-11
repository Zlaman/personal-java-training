package containers0;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        // ƒобавление по пор€дку
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        // ƒобавление в середину списка
        list.add(3, 999);
        list.forEach(Integer -> System.out.println(Integer));
        // удаление по индексу
        list.remove(2);
        list.forEach(Integer -> System.out.println(Integer));
        // удаление по значению
        list.remove((Object) 6);
        // сжатие размера
        list.trimToSize();
        list.forEach(Integer -> System.out.println(Integer));
    }

    public void kill() {

    }
}
