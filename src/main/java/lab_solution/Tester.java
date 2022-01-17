package lab_solution;

public class Tester {
    public static void main(String[] args) {
        final int EMPLOYEES_SIZE = 10;

        Employee[] employees = MockData.getMockData(new Employee[EMPLOYEES_SIZE]);
        Employee.printAll(employees);
        System.out.println("-------------------------");
        System.out.println("employees average salary: "+ Employee.getAverage(employees));
        System.out.println("minimum salary: "+ Employee.MINIMUM_SALARY);
        System.out.println("management average salary: "+ Employee.managementAverage(employees));
        System.out.println("=======================================================================");
        //old school
        Company company = new Company("Golan and Sons");
        //add employees
        for (Employee employee:employees){
            company.addEmployee(employee);
        }
        company.addEmployee(new Employee("Yoav",50_000));
        company.addEmployee(new Manager("Tal Bechor",100_000,"CEO"));
        System.out.println(company);


    }

}
