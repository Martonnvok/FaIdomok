package modell;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {

    private List<FaIdom> faIdomok;

    public FaIdomok() {
        faIdomok = new ArrayList<>();

        FaIdom f = new Gomb(3.0);
        FaIdom f2 = new Hasab(1.1, 1.2, 3.0);
        FaIdom f3 = new Hasab(1.0, 2.2, 2.0);
        FaIdom f4 = new Gomb(4.0);
        faIdomok.add(f);
        faIdomok.add(f2);
        faIdomok.add(f3);
        faIdomok.add(f4);
        run();
        osszSuly();
        osszGombSuly();
        minV();
        maxV();
    }

    public List<FaIdom> getFaIdomok() {
        return faIdomok;
    }

    public double osszSuly() {
        double osszSuly = 0;
        for (FaIdom f : faIdomok) {
            osszSuly += f.suly();
        }
        System.out.println("Össz idom súlya: "+ String.format( "%.2f", osszSuly));
        return osszSuly;
    }

    public double osszGombSuly() {
        double osszGombSuly = 0;
        for (FaIdom f : faIdomok) {
            if (f instanceof Gomb) {
                osszGombSuly += f.suly();
            }
        }
        
        System.out.println("Össz Gömb idom súlya: "+ String.format( "%.2f", osszGombSuly));
        return osszGombSuly;
    }

    public FaIdom minV() {
        FaIdom min = faIdomok.get(0);
        for (FaIdom f : faIdomok) {
            if (f.terfogat() < min.terfogat()) {
                min = f;
            }
        }
        System.out.println("Legkissebb térfogat: "+ String.format( "%.2f", min.terfogat()));
        return min;
    }

    public FaIdom maxV() {

        FaIdom max = faIdomok.get(0);
        for (FaIdom f : faIdomok) {
            if (f.terfogat() > max.terfogat()) {
                max = f;
            }
        }
        System.out.println("Legnagyobb térfogat: "+ String.format( "%.2f", max.terfogat()));
        return max;
    }

    public void run() {
        for (FaIdom faIdom : faIdomok) {
            System.out.println(faIdom);
        }
    }

}
