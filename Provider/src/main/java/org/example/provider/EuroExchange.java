package org.example.provider;

import org.example.exchange.Exchange;

public class EuroExchange implements Exchange {

    @Override
    public void createExchange() {
        System.out.println("Enter the amount of SEK");
        double sek = scanner.nextDouble();

        if (sek >= 0) {
            System.out.println(sek + " SEK is " + sek * 0.098 + " EUR ");
        } else {
            System.out.println("Invalid input, please put in positive numbers of SEK");
        }
    }
}
