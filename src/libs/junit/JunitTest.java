package libs.junit;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class JunitTest {
    @DataPoints
    public static Boolean A1 = true;
    public static Boolean A2 = false;
    public static Boolean A3 = null;

    @Test
    public void thisAlwaysPasses() {

    }

    @Test
    @Ignore(value = "NOT DONE YET")
    public void thisIsIgnored() {
    }

    @Theory
    public void testTheory(Boolean x){
        System.out.println(x);
        assumeTrue(x);
        assertTrue(x);
    }
}
