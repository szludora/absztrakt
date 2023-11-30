package modell;

public abstract class Alakzat {

    public abstract double terulet();

    public void kiir() {
        System.out.println("Alakzat:");
    }

    public void kiirTerulet() {
        System.out.println("Terület: " + terulet());
    }
;
}
