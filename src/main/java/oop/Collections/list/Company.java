package oop.Collections.list;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees= new ArrayList<>();

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public double getAvgSalary(){
        double returnAvg = 0;
        for (Employee item:employees){
            returnAvg+=item.getSalary();
        }
        return returnAvg/ employees.size();
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }
}
