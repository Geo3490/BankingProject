package com.javaLearn;

import java.util.Scanner;

public class Account {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void Account(String cName, String cId) {
        this.customerName = cName;
        this.customerId = cId;
    }

    void deposit(int amount) {
        balance = balance + amount;
        previousTransaction = balance;
    }

    void withdraw(int amount) {
        balance = balance - amount;
        previousTransaction = -balance;
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transactions Occurred");
        }
    }

    void calculateInterest(int years) {
        double interestPercentage = 0.185;
        double newBalance = (balance * interestPercentage * years) + balance;
        System.out.println("The current Interest rate Is " + (100 * interestPercentage) + "%");
        System.out.println("After " + years + "Your Balance Will Be " + newBalance);
    }

    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("*********");
        System.out.println();
        System.out.println("Your Customer ID IS " + customerId);
        System.out.println("*********");
        System.out.println();
        System.out.println("What would you like to do ? ");
        System.out.println("*********");
        System.out.println();
        System.out.println("a. Check Your Balance !");
        System.out.println("b. Make a deposit !");
        System.out.println("c. Withdraw !");
        System.out.println("d. View previous transaction !");
        System.out.println("e. Calculate Interest !");
        System.out.println("f. EXIT");

        do {
            System.out.println();
            System.out.println("Choose Option");
            char option1 = scanner.nextLine().trim().charAt(0);
            option = Character.toUpperCase(option1);
            System.out.println();

            switch (option) {
                //Case A allows user to check balance
                case 'A':
                    System.out.println("*********************");
                    System.out.println("Balance = $ " + balance);
                    System.out.println("*********************");
                    System.out.println();
                    break;
                //User making a deposit
//                case 'B':


            }


        }
    }
}
