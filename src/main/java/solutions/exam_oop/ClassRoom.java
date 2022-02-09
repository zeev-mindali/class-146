package solutions.exam_oop;

import java.util.Arrays;

public class ClassRoom {
    public static final int STUDENT_SIZE=15;
    private final String[] CLASS_NAMES = {"a","b","c","d","e"};
    private String name;
    private Teacher teacher;
    private Student[] students;

    public ClassRoom(String name, Teacher teacher, Student[] students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public ClassRoom() {
        setName(CLASS_NAMES[(int)(Math.random()*CLASS_NAMES.length)]);
        setTeacher(new Teacher());
        students = new Student[STUDENT_SIZE];
        for (int index = 0; index < students.length; index++) {
            students[index] = new Student();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassRoom ->" +
                "name='" + name + '\'' +
                " teacher=" + teacher +
                " class name="+getName() +
                " \nstudents=" + Arrays.toString(students) +
                "\n\n";
    }

    public double getAvg(){
        double sum=0;
        for (Student item:students){
            sum+=item.getAvg();
        }
        return sum/ students.length;
    }

    public double getAvg(String prof){
        double sum=0;
        for (Student item:students){
            sum+=item.getScore(prof);
        }
        return sum/ students.length;
    }
}
