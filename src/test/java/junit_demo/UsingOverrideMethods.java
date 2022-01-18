package junit_demo;

import junit.framework.TestCase;

public class UsingOverrideMethods extends TestCase {
    private int number;

    @Override
    protected void setUp() throws Exception {
        System.out.println("setUp method");
        number = 3;
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tearDown method");
    }

    /*@Override
    protected void runTest() throws Throwable {
        System.out.println("runTest method");
    }*/

    public void testOurCondition() {
        System.out.println("testOurCondition method");
        assertEquals(3, number);
    }
}
