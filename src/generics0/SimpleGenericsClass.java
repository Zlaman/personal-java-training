package generics0;

// Параметризированый класс-контейнер
class Holder<T> {
    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}

public class SimpleGenericsClass {

    public static void main(String[] args) {
        Holder<Integer> myInt = new Holder<Integer>(5000);
        Integer test = myInt.get();
        // Не подходит тип аргумента
        // myInt.set("Test");
        System.out.println(test);

        Holder<String> myString = new Holder<String>("Hello Kitty");
        System.out.println(myString.get());
    }

}
