package targil_oop;

public class Consulter extends Employee implements Managerable{
    public Consulter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
