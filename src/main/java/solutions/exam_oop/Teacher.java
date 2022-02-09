package solutions.exam_oop;

public class Teacher extends Person {
    private String profession;

    public Teacher(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    public Teacher(){
        setProfession(Grade.prof[(int)(Math.random()*Grade.prof.length)]);
    }

    public Teacher(String prof){
        setProfession(prof);
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Teacher{" +this.getName()+"} "+
                "profession='" + profession + '\'' +
                "}";
    }
}
