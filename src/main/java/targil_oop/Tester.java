package targil_oop;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        final int EMPLOYEES_SIZE = 10;

        Employee[] employees = MockData.getMockData(new Employee[EMPLOYEES_SIZE]);
        Employee.printAll(employees);
        System.out.println("-------------------------");
        System.out.println("employees average salary: "+Employee.getAverage(employees));
        System.out.println("minimum salary: "+Employee.MINIMUM_SALARY);
        System.out.println("management average salary: "+Employee.managementAverage(employees));
    }

}
