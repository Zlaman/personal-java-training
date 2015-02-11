package generics0;

import java.util.ArrayList;
import java.util.List;

class CanBeEaten {
    @Override
    public String toString() {
        return "CanBeEaten";
    }
}

class Fruit extends CanBeEaten {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Bannana extends Fruit {
    @Override
    public String toString() {
        return "Bannana";
    }
}

public class GenericWildcards {
    private static void println(Object param) {
        System.out.println(param);
    }

    private static void print(Fruit param) {
        System.out.println(param);
    }

    public static void main(String[] args) {
        println("No parameters");
        List noParam = new ArrayList();
        noParam.add(new CanBeEaten());
        noParam.add(new Apple());
        noParam.add(new Fruit());
        noParam.add(new String("Hello World"));
        for (int i = 0; i < noParam.size(); i++) {
            System.out.print(noParam.get(i) + " ");
            if (i + 1 == noParam.size())
                System.out.println();
        }

        println("Fruit parameter");
        List<Fruit> fruitParam = new ArrayList<>();
        // Not available
        // fruitParam.add(new CanBeEaten());
        fruitParam.add(new Apple());
        fruitParam.add(new Fruit());
        // Not available
        // fruitParam.add(new String("Hello World"));
        for (int i = 0; i < fruitParam.size(); i++) {
            System.out.print(fruitParam.get(i) + " ");
            if (i + 1 == fruitParam.size())
                System.out.println();
        }

        println("? parameter");
        List<?> notParam = new ArrayList<>();
        // Everything is not available
        // notParam.add(new CanBeEaten());
        // notParam.add(new Apple());
        // notParam.add(new Fruit());
        // notParam.add(new String("Hello World"));
        for (int i = 0; i < notParam.size(); i++) {
            System.out.print(notParam.get(i) + " ");
            if (i + 1 == notParam.size())
                System.out.println();
        }

        println("? extends Fruit parameter");
        List<? extends Fruit> extendsFruitParam = new ArrayList<>();
        // Everything is not available
        // extendsFruitParam.add(new CanBeEaten());
        // extendsFruitParam.add(new Apple());
        // extendsFruitParam.add(new Fruit());
        for (int i = 0; i < extendsFruitParam.size(); i++) {
            System.out.print(extendsFruitParam.get(i) + " ");
            if (i + 1 == extendsFruitParam.size())
                System.out.println();
        }

        println("? super Fruit parameter");
        List<? super Fruit> superFruitParam = new ArrayList<>();
        // Everything is not available
        // superFruitParam.add(new CanBeEaten());
        superFruitParam.add(new Apple());
        superFruitParam.add(new Fruit());
        // superFruitParam.add(new String("Hello World"));
        for (int i = 0; i < superFruitParam.size(); i++) {
            System.out.print(superFruitParam.get(i) + " ");
            if (i + 1 == superFruitParam.size())
                System.out.println();
        }

    }
}
