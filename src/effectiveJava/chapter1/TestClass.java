package effectiveJava.chapter1;

import java.time.Duration;
import java.time.Instant;

public class TestClass implements Cloneable {
    private String string;

    private TestClass(String str) {
        string = str;
    }

    public static TestClass initClass(String str) {
        return new TestClass(str);
    }

    public void printString() {
        System.out.println(string);
    }

    public TestClass clone() {
        try {
            return (TestClass) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        return !(string != null ? !string.equals(testClass.string) : testClass.string != null);

    }

    @Override
    public int hashCode() {
        return string != null ? string.hashCode() : 0;
    }
}

class Main {
    static int x;

    public static void main(String[] args) {
        TestClass tc1 = TestClass.initClass("ABC");
        TestClass tc2 = TestClass.initClass("ABC");
        TestClass ts3 = tc1.clone();
        System.out.println(tc1.hashCode() + " " + ts3.hashCode());
    }

    public void longVsLong() {
        Instant timeBefore = Instant.now();
        long sum = 0L;
//        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum + " Time passed:" + Duration.between(timeBefore, Instant.now()).toMillis());
    }
}