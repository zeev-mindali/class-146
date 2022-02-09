package solutions.exam_oop;

public class Person {
    private String[] names = {"zeev","Golan","Shachar","Saar","Saar","Oren","Lea","Mark"};
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Person() {
        setName(names[(int)(Math.random()*names.length)]);
        setAge((int)(Math.random()*100)+20);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }
}
