package company_demo;

import lab_solution.Company;
import lab_solution.Employee;
import lab_solution.Manager;
import lab_solution.NoEmployeesException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTester {
    static Company company,emptyCompany;

    @BeforeClass
    public static void initTest(){
        company = new Company("John Bryce");
        emptyCompany = new Company("Empty Company");
        company.addEmployee(new Employee("Zeev",25_000));
        company.addEmployee(new Manager("Golan telcom",75_000,"Zimer"));
       // company.addEmployee(new Employee("Tal",25_000));
    }

    @Test
    public void getAverageSalaryTest() throws NoEmployeesException {
         assertEquals(50_000.0,company.getAverageSalary(),0);
    }

    @Test(expected = NoEmployeesException.class)
    public void getAverageSalaryTestException() throws NoEmployeesException {
        assertEquals(0.0,emptyCompany.getAverageSalary(),0);
    }

    @Test
    public void getManagementAverageSalary(){
        assertEquals(75_000.0,company.getManagementAverageSalary(),0);
    }

    @Test
    public void getYearlyPayment() throws NoEmployeesException {
        assertEquals(1200000.0,company.getYearlyPayment(),0);
    }

    @Test
    public void getTotalNumOfManagers(){
        assertEquals(1,company.getTotalNumOfManagers());
    }

    @Test
    public void companyWithEmployees(){
        assertTrue(company.hasEmployees());
    }

    @Test
    public void companyWithoutEmployees(){
        assertFalse(emptyCompany.hasEmployees());
    }

    @Test
    public void checkGeri(){
        assertTrue(company.Geri());
    }
}
