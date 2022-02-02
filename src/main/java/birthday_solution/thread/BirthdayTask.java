package birthday_solution.thread;

import birthday_solution.Run;
import birthday_solution.beans.Person;

import java.time.LocalDate;
import java.util.Set;

public class BirthdayTask implements Runnable {
    private Set<Person> pepole;
    private boolean isRunning;

    public BirthdayTask(Set<Person> pepole) {
        this.pepole = pepole;
        isRunning = true;
    }

    @Override
    public void run() {
        System.out.println("Thread is started........");
        while (isRunning) {
            try {
                for (Person item : pepole) {
                    if (item.getBirthday().getMonthValue() == LocalDate.now().getMonthValue() &&
                            item.getBirthday().getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
                        System.out.println(item.getName()+" have a birthday today, don't answer the call or you will pay for a gift");
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int counter = 0; counter < 5; counter++) {
                                    System.out.println("Don't answer the phone !!!!!");
                                    try {
                                        Thread.sleep(30_000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });
                    }
                }
                Thread.sleep(1000 * 60 * 60 * 24);
            } catch (InterruptedException err) {
                System.out.println("Goodbye and have a nice day :)");
            }
        }
    }

    public void stopMe() {
        isRunning = false;
    }
}
