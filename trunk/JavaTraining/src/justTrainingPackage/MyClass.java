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
            for (int i = 0; i <= args.length; i++) {
                System.out.println(args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("WTF are you doing");
        }
    }

    public static void main(String[] args) {
        MyClass c1 = new MyClass(10, "ËÀËÀËÀ", 50);
        MyClass c2 = new MyClass(100, "ÕËÎ", 540);
        String[] testS = { "hello", "world" };
        c1.test(testS);
    }
}
