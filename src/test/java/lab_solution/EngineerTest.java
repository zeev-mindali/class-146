package lab_solution;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineerTest {
    Engineer engineer1,engineer2;

    @Before
    public void setUp() throws Exception {
        engineer1=new Engineer("Tal",90_000,"Programmer");
        engineer2=new Engineer("Guy",85_000,null);
    }

    @Test
    public void getSpecialty() throws Exception {
        assertEquals("Programmer",engineer1.getSpecialty());
    }

    @Test(expected = Exception.class)
    public void getSpecialtyException() throws Exception {
        assertEquals("Programmer",engineer2.getSpecialty());
    }
}