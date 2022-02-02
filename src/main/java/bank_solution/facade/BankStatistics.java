package bank_solution.facade;

import bank_solution.beans.Client;
import bank_solution.beans.Person;

import java.util.List;

public class BankStatistics {
    public static int countMembers(){
        return Person.totalUsers;
    }

    public static double getBankBalance(){
        return Person.totalSum;
    }

    public static Client getRichestClient(List<Person> clients){
       return (Client)clients.get(clients.size()-1);
    }

    public static Client getPoorestClient(List<Person> clients){
        return (Client)clients.get(0);
    }
}
