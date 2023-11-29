package modell;

public class Hasab extends FaIdom {

    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
        return a * b * magassag;
    }

    @Override
    public String toString() {
        return "Hasáb," + " a oldal: " + a + "b oldal: " + b + " magasság: " + magassag;
    }
}