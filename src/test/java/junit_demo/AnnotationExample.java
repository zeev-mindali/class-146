package junit_demo;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnnotationExample {
    @Test
    public void testMe(){
        System.out.println("Inside testMe");
        assertTrue(true);
    }

    @Test
    public void meAlsoTest(){
        System.out.println("Inside meAlsoTest");
        assertTrue(true);
    }

    public void aTest(){
        System.out.println("inside aTest");
        assertTrue(true);
    }

    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(AnnotationExample.class);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("AnnotationExample");
    }
}
