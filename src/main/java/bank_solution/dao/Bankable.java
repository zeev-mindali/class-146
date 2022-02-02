package bank_solution.dao;

import bank_solution.beans.Client;

public interface Bankable {
    void showMenu();
    void startSystem();
    void endSystem();
    void addClient(Client client);
    void deleteClient(int id);
    void withdraw(double amount);
    void deposite(double amount);
    void printAll();

}
