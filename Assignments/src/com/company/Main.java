package com.company;

import com.company.Account;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account ACC1= new Account(10644554,4000);
        System.out.println(ACC1.toString());

        ACC1.debit(2000);
        ACC1.credit(7000);
        System.out.println(ACC1.toString());

    }
}