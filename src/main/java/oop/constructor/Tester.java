package oop.constructor;

public class Tester {
    public static void main(String[] args) {
        Student geri = new Student(100,"Geri");
        Student amiel = new Student(100,"Amiel");

        //si

        double avg = (geri.getGrade()+ amiel.getGrade())/2;
        System.out.println("avg: "+avg);
    }
}
