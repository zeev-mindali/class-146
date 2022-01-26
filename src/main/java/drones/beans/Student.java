package drones.beans;

public class Student {
    private int id;
    private String name;
    private String phone;
    private String city;
    private String course;
    private int age;

    public Student(int id, String name, String phone, String city, String course, int age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.course = course;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
