package junit_demo;

import junit.framework.TestCase;
import junit_demo_classes.Person;

public class InsideTests extends TestCase {
    private Person person1,person2;

    public InsideTests(){
        super("Object test");
        person1 = new Person("Zeev","Mindali");
        person2 = new Person("Amital","Mindali");
    }

    public void testSameObject1(){
        assertSame("Different Reference",person1,person2);
    }

    public void testSameObject2(){
        assertSame("Diffrent Reference",person1,person1);
    }

    public void testEqualObjects(){
        assertEquals("Object should be equal",person1,person2);
    }
}
