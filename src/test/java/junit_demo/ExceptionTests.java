package junit_demo;

import junit.framework.TestCase;
import junit_demo_classes.Person;

public class ExceptionTests extends TestCase {
    private Person person1 = new Person("Zeev","Mindali");

    public void testRestDay1(){
        try{
            person1.restDay(2);
            fail("We expected exception here !!!");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    public void testRestDay2(){
        try{
            person1.restDay(-2);
            fail("We expected exception here !!!");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    public void testRestDay3(){
        try{
            person1.restDay(6);
            assertTrue(true);
        } catch (Exception e) {
            fail("We expected exception here !!!");
        }
    }
}
