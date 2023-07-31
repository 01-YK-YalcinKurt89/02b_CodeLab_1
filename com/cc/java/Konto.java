package com.cc.java;

public class Konto { // Private Instanzvariable zur Speicherung des Kontostands

    private int kontostand;


// Konstruktor zur Initialisierung des Kontostands beim Erstellen eines Konto-Objekts
    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }


// Getter-Methode, um den aktuellen Kontostand abzurufen
    public int getKontostand() {
        return kontostand;
    }

    
// Setter-Methode, um den Kontostand zu aktualisieren
    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

}

