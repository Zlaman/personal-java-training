package innerClasses;

public class InnerClassExample {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }

    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        InnerClassExample i = new InnerClassExample();
        i.ship("Тасмания");
    }
}
