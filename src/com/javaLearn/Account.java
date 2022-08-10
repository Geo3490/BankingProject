package com.javaLearn;

import java.util.Scanner;

public class Account {
    int balance;
    int previousTransaction;

    String customerName;
    String customerId;


    void Account(String cName, String cId){

        this.customerName = cName;
        this.customerId = cId;

    }

    void deposit(int amount){
    balance = balance + amount;
    previousTransaction = balance;
    }

    void withdraw(int amount){
    balance = balance -amount;
    previousTransaction = -balance;
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited " + previousTransaction);
        }else if (previousTransaction < 0) {
            System.out.println("Withdrawn " + Math.abs(previousTransaction));
        }else{
                System.out.println("No Transactions Occurred");
            }
        }
    void calculateInterest(int years){
        double interestPercentage = 0.185;
        double newBalance = (balance * interestPercentage * years) + balance;
        System.out.println("The current Interest rate Is " + (100 * interestPercentage) + "%");
        System.out.println("After " + years + "Your Balance Will Be " + newBalance);
    }
    void showMenu(){
        Scanner scanner = new Scanner(System.in);

    }
}
