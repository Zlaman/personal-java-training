package justTrainingPackage;

public class MyClass {
    private final int id;
    private String string;
    private double price;

    public MyClass(int i, String str, double price) {
        id = i;
        string = str;
        this.price = price;
        System.out.println(id + " " + string + " " + this.price);
    }

    public void test(String[] args) {
        try {
            for (String arg : args) {
                System.out.println(arg);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("WTF are you doing");
        }
        ZClass z = new ZClass();
        System.out.println(z.test);
    }

    public static void main(String[] args) {
        MyClass c1 = new MyClass(10, "������", 50);
        MyClass c2 = new MyClass(100, "���", 540);
        String[] testS = { "hello", "world" };
        c1.test(testS);
    }

}
