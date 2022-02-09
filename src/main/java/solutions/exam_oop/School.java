package solutions.exam_oop;

import java.util.Arrays;

public class School {
    private final int TOTAL_CLASSES=5;
    private ClassRoom[] classRooms;

    public School(ClassRoom[] classRooms) {
       setClassRooms(classRooms);
    }

    public School() {
        classRooms = new ClassRoom[TOTAL_CLASSES];
        for (int index = 0; index < classRooms.length; index++) {
            Student[] student = new Student[ClassRoom.STUDENT_SIZE];
            for (int index2 = 0; index2 < student.length; index2++) {
                student[index2]=new Student();
            }
            classRooms[index]=new ClassRoom(
                Grade.prof[index], new Teacher(Grade.prof[index]),student
            );

        }
    }

    public int getTOTAL_CLASSES() {
        return TOTAL_CLASSES;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }

    @Override
    public String toString() {
        return "School -> " +
                "TOTAL_CLASSES=" + TOTAL_CLASSES +
                "\nclassRooms=" + Arrays.toString(classRooms);

    }
}
