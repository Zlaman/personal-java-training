package containers0;

import java.util.HashMap;
import java.util.LinkedList;

class Shape {
    void test() {
        System.out.println("aaa");
    }
}

class Triangle extends Shape {
    @Override
    void test() {
        System.out.println("bbb");
    }
}

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        link.add(2, "BBB+++");

        HashMap<Triangle, Integer> lish = new HashMap<Triangle, Integer>();
        lish.put(new Triangle(), 2);
        test();
    }

    public static void test() {
        Shape x = new Triangle();
        x.test();
    }

}
