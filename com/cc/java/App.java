package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        // Erzeugen von 3 Instanzen von Konto
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);


        // Ausgabe des Anfangskontostands
        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());



        output("------------------------");


        // Ändern der Kontostände
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        // Ausgabe der aktuellen Kontostände
        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());
       }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}