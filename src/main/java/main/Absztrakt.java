package main;

import modell.Alakzat;
import modell.Kor;
import modell.Teglalap;

public class Absztrakt {
    
    public static void main(String[] args) {
        Kor k = new Kor(1);
        Teglalap t = new Teglalap(1, 1);

        Alakzat[] alakzatok = new Alakzat[5];
        //alakzatok[0] = new Alakzat();
        alakzatok[1] = k;
        alakzatok[2] = t;
        alakzatok[3] = new Kor(2);
        alakzatok[4] = new Teglalap(2, 2);

        for (int i = 1; i < alakzatok.length; i++) {
            Alakzat alakzat = alakzatok[i];
            alakzat.kiir();
            alakzat.kiirTerulet();
        }
    }
}
