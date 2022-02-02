package birthday_solution.facade;

import birthday_solution.beans.Person;
import birthday_solution.dao.Reminderable;
import birthday_solution.thread.BirthdayTask;

import java.util.*;

public class BirthdaySystemReminder implements Reminderable {
    private static Set<Person> people;  //324234hg@BirthdaySystemReminder
    private BirthdayTask task;
    private static Scanner scanner = new Scanner(System.in);
    private Thread taskThread;
    public BirthdaySystemReminder() {
        this.people = new HashSet<>();
        this.task = new BirthdayTask(people);
        taskThread = new Thread(task);
        taskThread.start();
        startSystem();
    }

    @Override
    public void showMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("MENU\n");
        sb.append("=================\n");
        sb.append("1 - addPerson\n");
        sb.append("2 - deletePerson\n");
        sb.append("3 - print all\n");
        sb.append("4 - print amount of friends\n");
        sb.append("5 - Happy Month (not happy wallet)\n");
        sb.append("6 - Sad Month (More money for drugs)\n");
        sb.append("7 - event list (when to sell a kidney)\n");
        sb.append("8 - exit System");
        System.out.println(sb.toString());
    }

    @Override
    public void startSystem() {

        int choice = 0;
        do {
            showMenu();
            //scanner.nextLine();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPerson(new Person());
                    break;

                case 2:
                    System.out.println("Enter friend id:");
                    int friendId = scanner.nextInt();
                    deletePerson(friendId);
                    break;

                case 3:
                    printAll();
                    break;

                case 4:
                    //System.out.println(BirthDayStatistics.countMembers());
                    System.out.println("Total Friends:" + people.size());
                    break;

                case 5:
                    System.out.println(BirthDayStatistics.getHappyMonth());
                    break;

                case 6:
                    System.out.println(BirthDayStatistics.getsadlyMonth());
                    break;

                case 7:
                    for (Map.Entry<Integer, Integer> item : BirthDayStatistics.getEvents().entrySet()) {
                        System.out.println("Month #" + item.getKey() + "\tevents: " + item.getValue());
                    }
                    break;

                case 8:
                    taskThread.interrupt();
                    endSystem();
                    break;

                default:
                    System.out.println("WTF?!?!?!?!");
            }
        } while (choice != 8);
    }

    @Override
    public void endSystem() {
        System.exit(0);
    }

    @Override
    public void addPerson(Person person) {
        people.add(person);
        System.out.println(person);
    }

    @Override
    public void deletePerson(int id) {
        for (Person item : people) {
            if (item.getId() == id) {
                people.remove(item);
                return;
            }
        }
    }

    @Override
    public void printAll() {
        /*
        Collections.sort(people);
        for (Person item : people) {
            System.out.println(item);
        }
        */

        List<Person> personList = set2list(people);
        Collections.sort(personList);
        personList.forEach(System.out::println);
    }

    public static Set<Person> getPeople() {
        return people;
    }

    public void printHappyMonth(List<Person> personList){
        int month = BirthDayStatistics.getHappyMonth();

        for (Person item:personList){
            if (item.getBirthday().getMonthValue()==month) {
                System.out.println(item);
            }
        }

        /*
        personList.stream()
                .filter(item -> item.getBirthday().getMonthValue()==month)
                .forEach(System.out::println);
         */
    }

    private List<Person> set2list(Set<Person> personSet){
        return new ArrayList<>(personSet);
    }
}
