package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        // Erzeugen von 3 Instanzen von Konto
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();


        // Ausgabe des Anfangskontostands
        output(konto1.kontostand);
        output(konto2.kontostand);
        output(konto3.kontostand);


        // Ändern der Kontostände
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);

        // Ausgabe der aktuellen Kontostände
        output(konto1.getKontostand());
        output(konto2.getKontostand());
        output(konto3.getKontostand());
       }


    private static void output(int outputStr) {
        System.out.println(outputStr);
    } 

}