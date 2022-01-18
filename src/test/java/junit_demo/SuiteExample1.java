package junit_demo;

import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class SuiteExample1 {
    public static void main(String[] args) {
        new TestRunner()
                .doRun(
                        new TestSuite(MyTest.class,InsideTests.class)
                );
    }
}
