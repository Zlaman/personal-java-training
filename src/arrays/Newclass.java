package arrays;

public class Newclass {
    @Override
    public String toString() {
        return "Превед Медвед";
    }
    
    public Newclass() {
        // TODO Auto-generated constructor stub
    }
    //! Вызов конструктора из конструктора
    public Newclass(String st) {
        this();
    }
    
    Newclass printer (String p){
        System.err.println(p);
        return this;
    }
}