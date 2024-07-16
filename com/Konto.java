package com;


public class Konto {

    private int Konstostand = 100000;

    public Konto() {
        //Konstruktor
    }

    public void setKonstostand(int value) {
        Konstostand = value;
    }

    public int getKonstostand() {
        return Konstostand;
    }
    
    @Override
    public String toString() {    
        return String.valueOf(Konstostand);
    }
}