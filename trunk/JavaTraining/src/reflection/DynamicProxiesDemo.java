package reflection;

interface Interface1 {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface1 {

    @Override
    public void doSomething() {
        System.out.println("doSomething()");

    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);

    }

}

class SimpleProxy implements Interface1 {
    private Interface1 proxied;

    public SimpleProxy(Interface1 proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy dosomething");
        proxied.doSomething();

    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);

    }
}

public class DynamicProxiesDemo {
    public static void consumer(Interface1 iface) {
        iface.doSomething();
        iface.somethingElse("HOHOHO");

    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));

    }

}
