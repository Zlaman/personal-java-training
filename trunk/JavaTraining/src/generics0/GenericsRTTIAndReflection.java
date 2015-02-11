package generics0;

class Erased<T> {
    private final int SIZE = 100;

    public void f(Object arg) {
        // Невозможно, тип Т потерян в Runtime
        // if (arg instanceof T) {}
        // T var = new T();
        // T[] array = new T[SIZE];
        T[] array = (T[]) new Object[SIZE];
    }
}

class Building {
}

class House extends Building {
}

public class GenericsRTTIAndReflection<T> {
    Class<T> kind;

    public GenericsRTTIAndReflection(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        GenericsRTTIAndReflection<Building> ctt1 = new GenericsRTTIAndReflection<Building>(
                Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        GenericsRTTIAndReflection<House> ctt2 = new GenericsRTTIAndReflection<House>(
                House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

    }
}
