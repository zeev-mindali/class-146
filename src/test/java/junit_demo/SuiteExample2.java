package junit_demo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteExample2 {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static Test suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(MyTest.class);
        suite.addTest(new TestSuite(InsideTests.class));
        System.out.println("going to run two test class");
        return suite;
    }
}
