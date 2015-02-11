package generics0;

import java.util.Iterator;
import java.util.Random;

class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}

class Latte extends Coffee {

}

class Mocha extends Coffee {

}

class Cappuccino extends Coffee {

}

class Americano extends Coffee {

}

class Breve extends Coffee {

}

public class GenericsInterfacesCoffeeGenerator implements Generator<Coffee>,
        Iterable<Coffee> {
    private Class[] types = { Latte.class, Mocha.class, Cappuccino.class,
            Americano.class, Breve.class };
    private static Random rand = new Random(47);

    public GenericsInterfacesCoffeeGenerator() {

    }

    private int size = 0;

    public GenericsInterfacesCoffeeGenerator(int sz) {
        size = sz;
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return GenericsInterfacesCoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        GenericsInterfacesCoffeeGenerator gen = new GenericsInterfacesCoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for (Coffee c : new GenericsInterfacesCoffeeGenerator(6))
            System.out.println(c);

    }

}
