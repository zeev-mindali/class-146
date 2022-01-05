package targil_oop;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        String[] names = {"Zeev", "Tal", "Saar", "Saar", "Omer", "Oren", "Lea"
                , "Shachar", "Chris", "Shriker", "Elad", "Yoav"};
        String[] offices = {"Main", "R&D", "QA", "Sales"};
        String[] specialty = {"Junior", "Senior"};
        String[] department = offices;
        String[] group = {"General", "R&D", "Sales"};

        final int EMPLOYEES_SIZE = 10;

        Employee[] employees = new Employee[EMPLOYEES_SIZE];

        Random rnd = new Random();
        for (int counter = 0; counter < employees.length; counter++) {
            switch (counter) {
                case 0:
                case 1: //secretary
                    employees[counter] = new Secretary(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(5000) + 5000,
                            offices[rnd.nextInt(offices.length)]
                    );
                    break;
                case 2:
                case 3: //manager
                    employees[counter] = new Manager(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + 5000,
                            department[rnd.nextInt(department.length)]
                    );
                    break;
                case 4:
                case 5:
                case 6:
                    employees[counter] = new Employee(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + 5000
                    );
                    break;
                case 7:
                    employees[counter] = new Director(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + 5000,
                            department[rnd.nextInt(department.length)],
                            group[rnd.nextInt(group.length)]
                    );
                    break;
                case 8:
                case 9:
                    employees[counter] = new Engineer(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + 5000,
                            specialty[rnd.nextInt(specialty.length)]
                    );
                    break;
            }
        }
        for (Employee employee:employees){
            System.out.println(employee);
        }
    }
}
