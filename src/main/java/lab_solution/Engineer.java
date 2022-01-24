package lab_solution;

public class Engineer extends Employee {
    private String specialty;

    public Engineer(String name, double salary,String specialty) {
        super(name, salary);
        setSpecialty(specialty);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(" specialty='");
        stringBuilder.append(this.specialty);
        stringBuilder.append("'");
        return stringBuilder.toString();
    }

    public String getSpecialty() throws Exception {
        if (specialty==null){
            throw new Exception("Field is empty");
        }
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
