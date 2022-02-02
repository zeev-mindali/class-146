package bank_solution.facade;

import bank_solution.beans.Client;
import bank_solution.beans.RegularClient;
import bank_solution.beans.VipClient;
import bank_solution.dao.Bankable;
import bank_solution.threads.InterestTask;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BankSystem implements Bankable {
    //private InterestTask task;
    private Set<Client> client;
    private static Scanner scanner = new Scanner(System.in);

    public BankSystem() {
        /*
        this.task = new InterestTask();
        Thread thread = new Thread(this.task);
        thread.start();
         */
        new Thread(new InterestTask()).start();
        this.client = new TreeSet<>();
    }

    @Override
    public void showMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("Menu\n");
        sb.append("==================\n");
        sb.append("1 - add client\n");
        sb.append("2 - delete client\n");
        sb.append("3 - withdraw money\n");
        sb.append("4 - deposit money\n");
        sb.append("5 - print all clients\n");
        sb.append("6 - find Tachun\n");
        sb.append("7 - find Mekupach\n");
        sb.append("8 - bank sum amount\n");
        sb.append("9 - Elvis as left the building..... (exit)\n");

        System.out.println(sb.toString());
    }

    @Override
    public void startSystem() {
        showMenu();
        int choice = 0;
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    char clientType = scanner.nextLine().charAt(0);
                    System.out.println("Yoav said: V-vip R-regular(Mekupach)");
                    if (clientType=='v' || clientType=='V'){
                        addClient(new VipClient());
                    } else {
                        addClient(new RegularClient());
                    }
                    break;
                case 2:
                    System.out.println("Insert client id:");
                    int clientId = scanner.nextInt();
                    deleteClient(clientId);
                    break;
                case 3:
                    System.out.println("Amount to withdraw:");
                    double withdrawSum = scanner.nextDouble();
                    withdraw(withdrawSum);
                    break;

                case 4:
                    System.out.println("Amount to deposit:");
                    double depositSum = scanner.nextDouble();
                    deposite(depositSum);
                    break;

                case 5:
                    printAll();
                    break;

                case 6:
                    //find tachun
                    break;

                case 7:
                    //find omer
                    break;

                case 8:
                    //get money in the bank (how much to steal)

                    break;

                case 9:
                    System.out.println("Love to see you go, hate to see you leave");
                    endSystem();
                    break;

                default:
                    System.out.println("Invalid choice !!!\n");
            }
        } while (choice != 9);
    }

    @Override
    public void endSystem() {

    }

    @Override
    public void addClient(Client client) {

    }

    @Override
    public void deleteClient(int id) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposite(double amount) {

    }

    @Override
    public void printAll() {

    }

    //methods

}
