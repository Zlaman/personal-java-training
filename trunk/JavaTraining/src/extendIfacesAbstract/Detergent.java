package extendIfacesAbstract;

// Наследование

public class Detergent extends Cleanser {

    public Detergent() {
        super("");
    }

    @Override
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append("foam()");
    }

    public static void main(String[] args) {
        Cleanser x = new Detergent(); // Полиморфизм
        x.dilute(); // Восходящее преобразование
        x.apply();
        x.scrub();
        ((Detergent) x).foam(); // RTTI нисходящее преобразование
        System.out.println(x);
        System.out.println(X);
        System.out.println("Проверяем базовый класс");
        Cleanser.main(args);
        System.out.println(InterfaceClass.X.trim());
    }

}
