package cz.uhk.MereniApp;
import cz.uhk.merapp.data.Mereni;
import cz.uhk.zlomky.Zlomek;

public class MereniApp {
    public static void main(String[] args) {
        var mereni = new Mereni();
        mereni.pridat(new Zlomek(12,7));
        mereni.pridat(new Zlomek(8,9));
        mereni.pridat(new Zlomek(4,11));
        mereni.pridat(new Zlomek(31,7));
        mereni.pridat(new Zlomek(14,10));
        mereni.pridat(10);
        mereni.pridat(12.8);
        mereni.pridat(15E3);
        mereni.pridat(10235);
        mereni.pridat(-15.4f);

        IO.println("Soucet je %g".formatted(mereni.secist()));
        IO.println("Prumer je %g".formatted(mereni.prumer()));
        IO.println("Maximum je %g".formatted(mereni.max()));
        IO.println("Minimum je %g".formatted(mereni.min()));
        for (int i = 0; i < mereni.size(); i++) {
            Number n = mereni.get(i);
            IO.println(n);
        }
    }
}
