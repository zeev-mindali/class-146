package junit_demo;

import junit.framework.TestCase;
import junit_demo_classes.MyCalculator;

public class MyTest extends TestCase {
    public void testPowerVer1(){
        System.out.println("in testPowerVer1 method");
        assertEquals(243, MyCalculator.power_ver1(3,5));
    }

    public void testPowerVer2(){
        System.out.println("in testPowerVer2 method");
        assertEquals(243, MyCalculator.power_ver2(3,5));
    }

    public void mathPow(){
        System.out.println("Testing Math.pow in integer");
        assertEquals(243,Math.pow(3,5));
    }

    public void mathPowDouble(){
        System.out.println("Testing Math.pow in double");
        assertEquals(243.0,Math.pow(3,5));
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(MyTest.class);
    }
}
