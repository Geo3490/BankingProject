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

    }

    void withdraw(int amount){
    balance = balance -amount;
    previousTransaction = -balance;
    }

    void getPreviousTransaction(){

    }

    void showMenu(){
        Scanner scanner = new Scanner(System.in);

    }
}
