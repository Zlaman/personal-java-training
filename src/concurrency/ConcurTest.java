package concurrency;

public class ConcurTest {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello from thread");
        }).start();
        Thread.activeCount();
    }
}
