package functional_programing_in_action.beans;

public class PersonDTO {
    private final String firstName;
    private final String gender;
    private final Integer age;

    public PersonDTO(String firstName, String gender, Integer age) {
        this.firstName = firstName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

