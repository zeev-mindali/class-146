package birthday_solution.beans;

import birthday_solution.util.DateFactory;
import birthday_solution.util.DateUtil;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable{
    private static int counter=0;

    private int id;
    private String name;
    private LocalDate birthday;

    public Person() {
        counter++;
        this.id=counter;
        this.name="Person "+counter;
        this.birthday=DateFactory.getLocalDate();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }


    @Override
    public int compareTo(Object object) {
        long thisDay = this.getBirthday().toEpochDay();
        long thisObject = ((Person)object).getBirthday().toEpochDay();
        return Long.compare(thisDay,thisObject);
        /*
        return Integer.compare(this.getBirthday().getDayOfYear(),
                ((Person)object).getBirthday().getDayOfYear());
         */
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }

    @Override
    public String toString() {
        return "id:"+this.id+" name:"+this.name+" date:"+ DateUtil.BeautifyDate(this.birthday);
    }
}
