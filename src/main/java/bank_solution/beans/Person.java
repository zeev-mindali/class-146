package bank_solution.beans;

public abstract class Person {
    //attributes
    protected static int counter = 1;
    //protected static int id;
    protected String name;
    protected double age;
    protected int id;

    public static int totalUsers=0;
    public static double totalSum=0;

    //C'tor

    public Person(double age) {
        this.id=counter++;
        this.name="Client "+ id;
        this.age=age;
        totalUsers++;
    }

    public Person(String name, double age) {
        counter++;
        this.id=counter;
        this.name = name;
        this.age = age;
        totalUsers++;
    }

    //Methods
    @Override
    public String toString() {
        return "id: "+id+" name: "+name+" age: "+age;
    }

    protected static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    protected double getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setAge(double age) {
        this.age = age;
    }

}
