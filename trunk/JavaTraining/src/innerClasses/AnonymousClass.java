package innerClasses;

abstract class Wrapping {
    public Wrapping(int i) {
        System.out.println("Конструктор абстрактного класса");
    }

    public abstract void f();
}

public class AnonymousClass {

    public static Wrapping getWrapping(int i) {
        // Анонимный класс без имени
        return new Wrapping(i) {
            {
                System.out.println("Инициализация экземпляра");
            }

            @Override
            public void f() {
                System.out.println("Превед");
            }
        };
    }

    public static void main(String[] args) {
        Wrapping c = getWrapping(100);
        c.f();

    }
}
