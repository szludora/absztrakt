package modell;

public class Kor extends Alakzat {

    private double r;

    public Kor() {
        this.r = 5;
    }

    public Kor(double r) {
        this.r = r;
    }

    @Override
    public void kiir() {
        System.out.println("Kör.");
    }

    @Override
    public double terulet() {
        return r * r * 3.14;
    }

    /*
    public String kiirTerulet() {
        return "Terület" + this.terulet();
    }
     */
}
