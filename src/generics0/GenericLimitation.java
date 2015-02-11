package generics0;

class HasF {
    public void f() {
        System.out.println("HasF.f()");
    }
}

// ����������� ��� �������� T ��������� � HasF ��� ������������ �� ����, ���
// ��������� ��������� obj.f()
class Manipulator<T extends HasF> {
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        // �������� ����� ��� <T> �� �����
        obj.f();
    }
}

// Legacy ����������� ������������� ��� ��������������
@SuppressWarnings("rawtypes")
class Derived extends Manipulator {

    @SuppressWarnings("unchecked")
    public Derived(HasF x) {
        super(x);
        // TODO Auto-generated constructor stub
    }

}

public class GenericLimitation {

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
}
