package junit_demo_classes;

import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fName, person.fName) && Objects.equals(lName, person.lName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fName, lName);
    }
    public void restDay(int dayNumber) throws Exception {
        if (dayNumber < 1 || dayNumber > 7) {
            throw new Exception("Invalid day number");
        }
        if (dayNumber != 6 && dayNumber != 7){
            throw new Exception("Sorry, you need to tech in TLV");
        }
        System.out.println("Enjoy the weekend");
    }
}
