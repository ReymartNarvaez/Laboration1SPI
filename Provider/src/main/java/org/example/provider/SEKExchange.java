package org.example.provider;

import org.example.exchange.Exchange;

public class SEKExchange implements Exchange {

    @Override
    public void createExchange() {
        System.out.println("Enter the amount of EURO");
        double euro = scanner.nextDouble();

        if (euro >= 0) {
            System.out.println(euro + " EURO is " + euro * 10.24 + " SEK ");
        } else {
            System.out.println("Invalid input, please put in positive numbers of EURO");
        }
    }
}
