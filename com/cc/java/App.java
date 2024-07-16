package com.cc.java;

import com.Konto;

public class App {
    
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();
        output(konto1);
        output(konto2);
        output(konto3);
        output("*************************");
        konto1.setKonstostand(konto1.getKonstostand() * 2);
        konto2.setKonstostand(konto2.getKonstostand() * 3);
        konto3.setKonstostand(konto3.getKonstostand() * 10);
        output(konto1);
        output(konto2);
        output(konto3);
    }


    private static void output(Object output) {
        System.out.println(output);
    } 

}