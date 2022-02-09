package solutions.exam_oop;

import java.util.Arrays;

public class Student extends Person {
    final public static int TOTAL_GRADES = 6;
    private Grade[] grades;

    public Student(String name, int age, Grade[] grades) {
        super(name, age);
        setGrades(grades);
    }

    public Student() {
        grades = new Grade[TOTAL_GRADES];
        for (int counter = 0; counter < grades.length; counter++) {
            grades[counter] = new Grade();
        }
    }

    public int getTOTAL_GRADES() {
        return TOTAL_GRADES;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public void setGrades(Grade[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                "}";
    }

    public double getAvg(){
        int sum=0;
        for (Grade grade:grades){
            sum+=grade.getScore();
        }
        return (float)sum/grades.length;
    }

    public int getScore(String prof){
        for (Grade item:grades){
            if (item.getProfession().equals(prof)){
                return item.getScore();
            }
        }
        return 0;
    }

}
