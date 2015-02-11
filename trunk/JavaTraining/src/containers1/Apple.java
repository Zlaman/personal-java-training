package containers1;

public class Apple extends Fruit {
    private static long counter;
    private final long id = counter++;
    @Override
    public long id(){
        return id;
    }

}
