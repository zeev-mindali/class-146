package junit_demo;

import junit.framework.JUnit4TestAdapter;
import org.junit.*;

public class AnnotationExample2 {
    @Before
    public void init(){System.out.println("Inside init");}
    @After
    public void finish(){System.out.println("Inside finish");}
    @BeforeClass
    public static void initOnce(){System.out.println("Inside initOnce");}
    @AfterClass
    public static void finishOnce(){System.out.println("Inside finishOnce");}
    @Test
    public void runTest(){System.out.println("Simple test");}

    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(AnnotationExample.class);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("AnnotationExample");
    }
}
