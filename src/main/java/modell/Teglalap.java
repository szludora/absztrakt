package modell;

public class Teglalap extends Alakzat {

    private double a, b;

    public Teglalap() {
        this.a = 5;
        this.b = 5;
    }

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void kiir() {
        System.out.println("Téglalap.");
    }

    @Override
    public double terulet() {
        return a * b;
    }
    /*
     public String kiirTerulet() {
        return "Terület" + this.terulet();
    }
     */

}
