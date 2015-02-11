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
        System.out.println("Имя класса: " + cc.getName() + " это интерфейс? ["
                + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
    }

    public static <E> void main(String[] args) {
        Class c = null;
        // загрузка класса методом Class.forName
        /*
         * try { c = Class.forName("com.zlaman.FancyToy"); } catch
         * (ClassNotFoundException e) {
         * System.out.println("Не найден класс FancyToy"); System.exit(1); }
         */
        // Загрузка литералом class. Проверяется на этапе компиляции
        c = FancyToy.class;

        printInfo(c);

        // ПОЧЕМУ НЕ ВЫЛЕТЕЛ ЭКСПЕШЕН?
        for (Class<String> face : c.getInterfaces()) {
            printInfo(face);
        }
        // ПОЧЕМУ НЕ ВЫЛЕТЕЛ ЭКСПЕШЕН?
        Class<ListBinding<E>> up = c.getSuperclass();
        Object obj = null;
        try {
            // создаёт класс с типом Object. Для работы как с Toy нужно
            // нисходящее преобразование.
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Не удалось создать объект");
            System.exit(1);

        } catch (IllegalAccessException e) {
            System.out.println("Нет доступа");
            System.exit(1);
        }
        printInfo(obj.getClass());

        // class casting
        Toy ft = new FancyToy();

        // проверка принадлежности к типу
        if (ft instanceof FancyToy) {
            System.out.println("YAHOO");
        }

        // 2ой вариант
        try {
            if (Class.forName("com.zlaman.FancyToy").isInstance(ft)) {
                System.out.println("YAHOO");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
