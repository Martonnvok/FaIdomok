package modell;

public class Gomb extends FaIdom {

    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double terfogat() {
        return 4 * Math.PI * Math.pow(sugar, 2);
    }

    @Override
    public String toString() {
        return "Gömb " + " sugár: " + sugar;
    }
}
