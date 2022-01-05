package targil_oop;

import java.text.DecimalFormat;

public class Employee {
    protected String name;
    protected double salary;
    public static final int MINIMUM_SALARY=5500;

    //format the currency to a normal one :)
    private static final String pattern="###,###.00";
    private static final DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        //create an object of String Builder, for not getting immutable values
        StringBuilder stringBuilder = new StringBuilder();
        //append (adjuntar)
        //stringBuilder.append("name='" + this.name + "' salary= "+ this.salary);
        stringBuilder.append("name='");
        stringBuilder.append(this.name);
        stringBuilder.append("' salary= ");
        stringBuilder.append(decimalFormat.format(this.salary));
        //return a string
        return stringBuilder.toString();
    }

    public static void printAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static String getAverage(Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return decimalFormat.format(sum / employees.length);
    }

    public static String managementAverage(Employee[] employees){
        double sum = 0;
        int counter=0;
        for(Employee employee:employees){
            if (employee instanceof Managerable){
                sum+=employee.getSalary();
                counter++;
            }
        }
        return decimalFormat.format(sum/counter);
    }
}
