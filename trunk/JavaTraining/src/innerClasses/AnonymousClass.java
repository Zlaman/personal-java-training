package innerClasses;

abstract class Wrapping {
    public Wrapping(int i) {
        System.out.println("����������� ������������ ������");
    }

    public abstract void f();
}

public class AnonymousClass {

    public static Wrapping getWrapping(int i) {
        // ��������� ����� ��� �����
        return new Wrapping(i) {
            {
                System.out.println("������������� ����������");
            }

            @Override
            public void f() {
                System.out.println("������");
            }
        };
    }

    public static void main(String[] args) {
        Wrapping c = getWrapping(100);
        c.f();

    }
}
