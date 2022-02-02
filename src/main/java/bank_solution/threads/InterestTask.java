package bank_solution.threads;

import bank_solution.beans.Client;

import java.util.Set;

public class InterestTask implements Runnable{
    private Set<Client> clients;

    public InterestTask(Set<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Me started running (run forest , RUUUUUN");

            for (Client item:this.clients){
                double clientBalance = item.getAccount().getBalance();
                clientBalance = clientBalance * (1-item.getInterestRate());
                item.getAccount().setBalance(clientBalance);
                System.out.println("client id: "+item.getId()+
                        " client name: "+item.getName() +
                        " Balance: "+clientBalance);
            }

            System.out.println("Going to sleep, me so lazy !!!!!");
            try {
                //Thread.sleep(1000*60*60*24);
                Thread.sleep(60_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
