package targil_oop;

import java.util.Random;

public class MockData {
    private static String[] names = {"Zeev", "Tal", "Saar", "Saar", "Omer", "Oren", "Lea"
            , "Shachar", "Chris", "Shriker", "Elad", "Yoav"};
    private static String[] offices = {"Main", "R&D", "QA", "Sales"};
    private static String[] specialty = {"Junior", "Senior"};
    private static String[] department = offices;
    private static String[] group = {"General", "R&D", "Sales"};

    public static Employee[] getMockData(Employee[] employees) {
        Random rnd = new Random();
        for (int counter = 0; counter < employees.length; counter++) {
            switch (counter) {
                case 0:
                case 1: //secretary
                    employees[counter] = new Secretary(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(5000) + Employee.MINIMUM_SALARY,
                            offices[rnd.nextInt(offices.length)]
                    );
                    break;
                case 2:
                case 3: //manager
                    employees[counter] = new Manager(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + Employee.MINIMUM_SALARY,
                            department[rnd.nextInt(department.length)]
                    );
                    break;
                case 4:
                case 5:
                    employees[counter] = new Employee(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + Employee.MINIMUM_SALARY
                    );
                    break;
                case 6:
                    employees[counter] = new Consulter(
                            names[rnd.nextInt(names.length)],
                            (rnd.nextInt(10_000) + Employee.MINIMUM_SALARY)*2
                    );
                    break;
                case 7:
                    employees[counter] = new Director(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + Employee.MINIMUM_SALARY,
                            department[rnd.nextInt(department.length)],
                            group[rnd.nextInt(group.length)]
                    );
                    break;
                case 8:
                case 9:
                    employees[counter] = new Engineer(
                            names[rnd.nextInt(names.length)],
                            rnd.nextInt(10_000) + Employee.MINIMUM_SALARY,
                            specialty[rnd.nextInt(specialty.length)]
                    );
                    break;
            }
            if (employees[counter].getName().equals("Tal")) {
                employees[counter].setSalary(employees[counter].getSalary()*5);
            }
        }
        return employees;
    }
}
