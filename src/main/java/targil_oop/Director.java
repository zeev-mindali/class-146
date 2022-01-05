package targil_oop;

public class Director extends Manager{
    private String group;

    public Director(String name, double salary, String department, String group) {
        super(name, salary, department);
        setGroup(group);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        //create an object of String Builder, for not getting immutable values
        StringBuilder stringBuilder = new StringBuilder();
        //append (adjuntar)
        stringBuilder.append(super.toString());
        stringBuilder.append(" group='"+this.group+"'");
        //convert to string
        return stringBuilder.toString();
    }
}
