package com.jb.currency.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Currency {
    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double result;
}
