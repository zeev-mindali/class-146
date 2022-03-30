package com.jb.currency.service;

import com.jb.currency.beans.Currency;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CurrencyExchange {
    private final RestTemplate restTemplate;
    private final String URL = "https://api.exchangerate-api.com/v4/latest/ils";
    private Map<String, Double> myCurr = new HashMap<>();

    public Currency getCurrencyData(String from, String to, double amount) {
        double sum = 1;

        //get the currencies exchange rates from server, if it's not empty, we save money
        if (myCurr.isEmpty()) {
            getCurr();
        }
        if (from.equalsIgnoreCase("ils")) {
            //it's nis (new israeli shekel), we have it ready :)
            sum = amount * myCurr.get(to.toUpperCase());
        } else {
            //ils -> usd -> rub
            sum = myCurr.get(to.toUpperCase())/myCurr.get(from.toUpperCase())*amount;
            System.out.println("does yoav correct/???");
        }

        return new Currency(
                from,
                to,
                amount,
                sum
        );
    }

    @Scheduled(cron = "0 30 06 * * ?")
    public void clearMap() {
        myCurr.clear();
    }

    private void getCurr() {
        //get the currency table from site (0.01$)
        Map<String, Object> result = restTemplate.getForObject(URL, Map.class);
        myCurr = (Map<String, Double>) result.get("rates");
    }
}
