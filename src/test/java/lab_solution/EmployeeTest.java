package lab_solution;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmployeeTest {
    List<Employee> employees;

    @Before
    public void setUp() throws Exception {
        employees = new ArrayList<>();
        employees.add(new Employee("Zeev",25_000));
        employees.add(new Employee("Golan",45_000));
    }

    @Test
    public void getName() {
        assertEquals("zeev",employees.get(0).name); //make sure that we get zeev
    }

    @Test
    public void getSalary() {
    }

    @Test
    public void getAverage() {
    }

    @Test
    public void managementAverage() {
    }
}