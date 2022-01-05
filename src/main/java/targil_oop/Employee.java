package targil_oop;

public class Employee {
    protected String name;
    protected double salary;

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
        stringBuilder.append(this.salary);
        //return a string
        return  stringBuilder.toString();
    }
}
