package extendIfacesAbstract;

// ������������

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
        Cleanser x = new Detergent(); // �����������
        x.dilute(); // ���������� ��������������
        x.apply();
        x.scrub();
        ((Detergent) x).foam(); // RTTI ���������� ��������������
        System.out.println(x);
        System.out.println(X);
        System.out.println("��������� ������� �����");
        Cleanser.main(args);
        System.out.println(InterfaceClass.X.trim());
    }

}
