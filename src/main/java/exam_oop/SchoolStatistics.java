package exam_oop;

public class SchoolStatistics {
    private static School school;

    public static void main(String[] args) {
        school = new School();
        //System.out.println(school);
        schoolAvg();
        classAvg();
        System.out.println();
        avgByProf();
        System.out.println();
        System.out.println("================================================================");
        clause6_1();
        clause6_2();
        clause6_3();
        clause6_4();
        clause6_6();
    }

    private static void clause6_6() {
        System.out.println("\n sport league students:");
        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                for (Grade score : student.getGrades()) {
                   if (score.getScore()>=90 && score.getProfession().equals("sports")){
                       System.out.println(student.getName()+": "+score.getScore());
                   }
                }
            }
        }
    }

    private static void clause6_4() {
        int sum = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            if (classRoom.getTeacher().getProfession().equals("math") ||
                    classRoom.getTeacher().getProfession().equals("phsics")) {
                sum += 1;
            }
        }
        System.out.println("Total real teacher: " + sum);
    }

    private static void clause6_3() {
        double sum = 0;
        int counter = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                sum += student.getAge();
                counter++;
            }
        }
        System.out.println("Total avg of students avg: " + sum / counter);
    }

    private static void clause6_2() {
        double sum = 0;
        int counter = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                if (student.getAge() > 30) {
                    for (Grade score : student.getGrades()) {
                        sum += score.getScore();
                        counter++;
                    }
                }
            }
        }
        System.out.println("Total avg of students above 30: " + sum / counter);
    }

    private static void clause6_1() {
        double sum = 0;
        int counter = 0;
        for (ClassRoom classRoom : school.getClassRooms()) {
            for (Student student : classRoom.getStudents()) {
                if (student.getAge() > 20 && student.getAge() < 30) {
                    for (Grade score : student.getGrades()) {
                        sum += score.getScore();
                        counter++;
                    }
                }
            }
        }
        System.out.println("Total avg of students between 20-30: " + sum / counter);
    }

    private static void avgByProf() {
        /*
        for (String item:Grade.prof){
            double sum=0;
            for (ClassRoom classRoom: school.getClassRooms()){
                sum+=classRoom.getAvg(item);
            }
            System.out.println(item+" class avg:"+sum/ school.getTOTAL_CLASSES());
        }
        */

        for (String item : Grade.prof) {
            double sum = 0;
            int counter = 0;
            for (ClassRoom classRoom : school.getClassRooms()) {
                for (Student student : classRoom.getStudents()) {
                    for (Grade grade : student.getGrades()) {
                        if (grade.getProfession().equals(item)) {
                            sum += grade.getScore();
                            counter++;
                        }
                    }
                }
            }
            System.out.println(item + " class avg :" + sum / counter);
        }
    }

    private static void schoolAvg() {
        double sum = 0;
        for (ClassRoom item : school.getClassRooms()) {
            sum += item.getAvg();
        }
        System.out.println("School avg:" + sum / school.getTOTAL_CLASSES() + "\n");
    }

    private static void classAvg() {
        for (ClassRoom item : school.getClassRooms()) {
            System.out.println(item.getName() + " avg:" + item.getAvg());
        }
    }
}
