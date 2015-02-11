package innerClasses;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class InnerClassExample2 {
    private Object[] items;
    private int next = 0;

    public InnerClassExample2(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
            // .items;
        }

        private String zet = "abcd";
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        InnerClassExample2 sequence = new InnerClassExample2(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();

        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
            // Создание объекта внутреннего класса после создание объекта
            // внешнего
            InnerClassExample2.SequenceSelector test = sequence.new SequenceSelector();
            System.out.println(test.zet);
        }

    }
}
