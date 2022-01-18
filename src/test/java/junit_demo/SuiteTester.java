package junit_demo;

import junit.framework.TestCase;

public class SuiteTester extends TestCase {
    public SuiteTester(String name) {
        super(name);
    }

    public void testExample(){
        assertEquals(5,5);
        System.out.println("inside test example");
    }
}
