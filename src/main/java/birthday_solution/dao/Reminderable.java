package birthday_solution.dao;

import birthday_solution.beans.Person;

public interface Reminderable {
    void showMenu();
    void startSystem();
    void endSystem();
    void addPerson(Person person);
    void deletePerson(int id);
    void printAll();
}
