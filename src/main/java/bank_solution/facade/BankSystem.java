package bank_solution.facade;

import bank_solution.beans.Client;
import bank_solution.beans.Person;
import bank_solution.beans.RegularClient;
import bank_solution.beans.VipClient;
import bank_solution.dao.Bankable;
import bank_solution.threads.InterestTask;

import java.util.*;

public class BankSystem implements Bankable {
    //private InterestTask task;
    private Set<Client> client = new TreeSet<>(new Comparator<Client>() {
        @Override
        public int compare(Client o1, Client o2) {
            return Double.compare(o1.getAccount().getBalance(), o2.getAccount().getBalance());
        }
    });
    private static Scanner scanner = new Scanner(System.in);
    private Client singleClient;
    public BankSystem() {
        /*
        this.task = new InterestTask();
        Thread thread = new Thread(this.task);
        thread.start();
         */
        new Thread(new InterestTask(this.client)).start();
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
            scanner.nextLine();
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
                    System.out.println(BankStatistics.getRichestClient(new ArrayList<>(this.client)));
                    break;

                case 7:
                    //find omer
                    System.out.println(BankStatistics.getPoorestClient(new ArrayList<>(this.client)));
                    break;

                case 8:
                    //get money in the bank (how much to steal)
                    System.out.println(BankStatistics.getBankBalance());
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
        //kill thread
        System.exit(0);
    }

    @Override
    public void addClient(Client client) {
        this.client.add(client);
    }

    @Override
    public void deleteClient(int id) {
        for (Client item:this.client){
            Person person = (Person)item;
            if (person.getId()==id){
                this.client.remove(item);
                Person.totalUsers--;
            }
        }
    }

    @Override
    public void withdraw(double amount) {
        Client myClient = getClientId();
        if (myClient==null){
            System.out.println("Client not existssssss");
            return;
        }
        if (myClient.getAccount().getBalance()-amount>=0) {
            Person.totalSum -= amount;
            myClient.getAccount().setBalance(myClient.getAccount().getBalance() - amount);
        } else {
            System.out.println("Not enough money, go learn JAVA full stack");
            System.out.println("Or ask tachun for some money......");
        }
    }

    @Override
    public void deposite(double amount) {
        Client myClient = getClientId();
        if (myClient==null){
            System.out.println("Client not existssssss");
            return;
        }
        Person.totalSum+=amount;
        myClient.getAccount().setBalance(myClient.getAccount().getBalance()+amount);
    }

    @Override
    public void printAll() {
        for (Client item:this.client){
            System.out.println(item);
        }
    }

    private Client getClientId(){
        System.out.println("Enter client id:");
        int clientId = scanner.nextInt();
        for (Client client:this.client){
            Person person = (Person)client;
            if (person.getId()==clientId){
                return client;
            }
        }
        return null;
    }
}
