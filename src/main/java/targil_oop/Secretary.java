package targil_oop;

public class Secretary extends Employee{
    private String office;

    public Secretary(String name, double salary,String office) {
        super(name, salary);
        setOffice(office);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" office='");
        stringBuilder.append(this.office);
        stringBuilder.append("'");

        return stringBuilder.toString();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
