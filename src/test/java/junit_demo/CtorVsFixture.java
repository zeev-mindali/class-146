package junit_demo;

import junit.framework.TestCase;

public class CtorVsFixture extends TestCase {
    private int number;

    public CtorVsFixture() {
        System.out.println("inside the constructor");
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("inside setUp method");
        number=3;
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("inside tearDown method");
    }

    public void test1(){
        number++;
        System.out.println("number="+number);
    }

    public void test2(){
        number++;
        System.out.println("number="+number);
    }
}
