package extendIfacesAbstract;

public class Cleanser implements InterfaceClass{
    protected Cleanser(String z){
        
    }
    private String s = "Cleanser";

    /* (non-Javadoc)
     * @see com.zalman.training.InterfaceClass#append(java.lang.String)
     */
    @Override
    public void append(String a) {
        s += " " + a;
    }

    /* (non-Javadoc)
     * @see com.zalman.training.InterfaceClass#dilute()
     */
    @Override
    public void dilute() {
        append("dilute()");
    }

    /* (non-Javadoc)
     * @see com.zalman.training.InterfaceClass#apply()
     */
    @Override
    public void apply() {
        append("apply()");
    }

    /* (non-Javadoc)
     * @see com.zalman.training.InterfaceClass#scrub()
     */
    @Override
    public void scrub() {
        append("scrub()");
    }
    
    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        InterfaceClass x = new Cleanser("");
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}
