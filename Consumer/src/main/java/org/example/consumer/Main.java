package org.example.consumer;

import org.example.exchange.Exchange;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
    Main main = new Main();
    main.runExchange();
    }

    private void runExchange(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            printMenu();
            choice = scanner.nextLine();
        } while (exchangeChoice(choice));
    }
    private void printMenu() {
        System.out.println("Choose one from the following options");
        System.out.println("1. SEK to EURO");
        System.out.println("2. EURO to SEK");
        System.out.println("e. Exit");
        System.out.print("Enter your choice: ");
    }

    private void makeExchange(String value) {
        ServiceLoader<Exchange> serviceLoader = ServiceLoader.load(Exchange.class);
        serviceLoader.stream()
                .map(ServiceLoader.Provider::get)
                .filter(exchangeProvider -> exchangeProvider.getClass().getSimpleName().startsWith(value))
                .forEach(Exchange::createExchange);
    }

    private boolean exchangeChoice(String choice) {
        boolean continueApplication = true;
        switch (choice) {
            case "1" -> makeExchange("Euro");
            case "2" -> makeExchange("SEK");
            case "e", "E" -> continueApplication = false;
        } return continueApplication;
    }
}
