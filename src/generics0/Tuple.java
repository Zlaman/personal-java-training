package generics0;

// Кортеж из 2х типов
class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    @Override
    public String toString() {
        return "( " + first + ", " + second + " )";
    }
}

// Кортеж из 3х типов
class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

    @Override
    public String toString() {
        return "( " + first + ", " + second + ", " + third + " )";
    }
}

class Amphibian {
};

class Vehicle {
};

public class Tuple {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("Hi", 47);
    }

    static ThreeTuple<Amphibian, Vehicle, Integer> g() {
        return new ThreeTuple<Amphibian, Vehicle, Integer>(new Amphibian(),
                new Vehicle(), 500);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        // Невозможно изменить Final
        // ttsi.first = "there";
        System.out.println(g());
    }

}
