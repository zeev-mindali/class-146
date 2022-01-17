package lab_solution;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;
    private String name;

    public Company(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName()).append("\n").append("=======================\n");
        for (Employee employee : this.employees) {
            stringBuilder.append(employee).append("\n");
        }
        return stringBuilder.toString();
    }

    //statistical methods1
    public double getAverageSalary() throws ArithmeticException{
        double avg = 0;
        for (Employee employee : this.employees) {
            avg += employee.getSalary();
        }
        //return employees.size()==0?0:avg/this.employees.size();
        return avg / employees.size();
    }

    public double getManagementAverageSalary() throws ArithmeticException{
        double avg=0;
        for (Employee employee : this.employees) {
            if (employee instanceof Managerable) {
                avg += employee.getSalary();
            }
        }
        //return employees.size()==0?0:avg/this.employees.size();
        return avg / getTotalNumOfManagers();
    }

    public double getYearlyPayment(){
        double sum = 0;
        for (Employee employee:employees){
            sum+=employee.getSalary();
        }
        return sum*12;

        //Yoav style
        //return getAverageSalary()*employees.size()*12;
    }

    public int getTotalNumOfEmployees(){
        return employees.size();
    }

    public int getTotalNumOfManagers(){
        int counter=0;
        for (Employee employee:employees){
            if (employee instanceof Managerable){
                counter++;
            }
        }
        return counter;
    }
}
