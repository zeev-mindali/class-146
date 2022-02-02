package bank_solution.beans;

public abstract class Person {
    //attributes
    protected static int counter = 1;
    //protected static int id;
    protected String name;
    protected double age;
    protected int id;

    //C'tor

    public Person(double age) {
        this.id=counter++;
        this.name="Client "+ id;
        this.age=age;
    }

    public Person(String name, double age) {
        counter++;
        this.id=counter;
        this.name = name;
        this.age = age;
    }

    //Methods
    @Override
    public String toString() {
        return "id: "+id+" name: "+name+" age: "+age;
    }

    protected static int getCounter() {
        return counter;
    }

    protected String getName() {
        return name;
    }

    protected double getAge() {
        return age;
    }

    protected int getId() {
        return id;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(double age) {
        this.age = age;
    }
}
