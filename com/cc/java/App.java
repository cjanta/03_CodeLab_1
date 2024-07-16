package com.cc.java;


public class App {
    
    public static void main(String[] args) {
        Account konto1 = new Account("Rudi Rampensau");
        Account konto2 = new Account("Ankatrin von Müller");
        Account konto3 = new Account("BARBARA OF");
        HLP.log("**********Die Zeit vegeht***************");
        konto1.setAccountTotal(konto1.getAccountTotal() * 2);
        konto2.setAccountTotal(konto2.getAccountTotal() * 3);
        konto3.setAccountTotal(konto3.getAccountTotal() * 10);
    }

}