package junit_demo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteExample3 {
    public static Test suite(){
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(new SuiteTester("testExample"));
        System.out.println("Going to test: "+ suite().countTestCases());
        return testSuite;
    }
}
