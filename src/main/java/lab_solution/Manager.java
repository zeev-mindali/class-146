package lab_solution;

public class Manager extends Employee implements Managerable {
    protected String department;


    public Manager(String name, double salary, String department) {
        super(name, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" department='");
        stringBuilder.append(this.department);
        stringBuilder.append("'");

        return stringBuilder.toString();
    }
}
