package containers0;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        // ���������� �� �������
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        // ���������� � �������� ������
        list.add(3, 999);
        list.forEach(Integer -> System.out.println(Integer));
        // �������� �� �������
        list.remove(2);
        list.forEach(Integer -> System.out.println(Integer));
        // �������� �� ��������
        list.remove((Object) 6);
        // ������ �������
        list.trimToSize();
        list.forEach(Integer -> System.out.println(Integer));
    }

    public void kill() {

    }
}
