package com.jb.currency.clr;

import com.jb.currency.beans.Currency;
import com.jb.currency.controller.CurrencyController;
import com.jb.currency.service.CurrencyExchange;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
@RequiredArgsConstructor
public class TestController implements CommandLineRunner {
    private final CurrencyExchange currencyExchange;
    @Override
    public void run(String... args) throws Exception {
        Currency test = currencyExchange.getCurrencyData("ils","usd",100);
        System.out.println(test);
    }
}
