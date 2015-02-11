package RTTI;

import javafx.beans.binding.ListBinding;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {

    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    public FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("��� ������: " + cc.getName() + " ��� ���������? ["
                + cc.isInterface() + "]");
        System.out.println("������� ���: " + cc.getSimpleName());
        System.out.println("������������ ���: " + cc.getCanonicalName());
    }

    public static <E> void main(String[] args) {
        Class c = null;
        // �������� ������ ������� Class.forName
        /*
         * try { c = Class.forName("com.zlaman.FancyToy"); } catch
         * (ClassNotFoundException e) {
         * System.out.println("�� ������ ����� FancyToy"); System.exit(1); }
         */
        // �������� ��������� class. ����������� �� ����� ����������
        c = FancyToy.class;

        printInfo(c);

        // ������ �� ������� ��������?
        for (Class<String> face : c.getInterfaces()) {
            printInfo(face);
        }
        // ������ �� ������� ��������?
        Class<ListBinding<E>> up = c.getSuperclass();
        Object obj = null;
        try {
            // ������ ����� � ����� Object. ��� ������ ��� � Toy �����
            // ���������� ��������������.
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("�� ������� ������� ������");
            System.exit(1);

        } catch (IllegalAccessException e) {
            System.out.println("��� �������");
            System.exit(1);
        }
        printInfo(obj.getClass());

        // class casting
        Toy ft = new FancyToy();

        // �������� �������������� � ����
        if (ft instanceof FancyToy) {
            System.out.println("YAHOO");
        }

        // 2�� �������
        try {
            if (Class.forName("com.zlaman.FancyToy").isInstance(ft)) {
                System.out.println("YAHOO");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
