import cz.uhk.zlomky.Zlomek;

public class Main {
    public static void main(String[] args) {
        IO.println("Projektos ZLOMKY");
        IO.println("=======================================");
        var a = new Zlomek(); //Konstruktor bez parametru
        a.setCitatel(1);
        a.setJmenovatel(2);
        IO.println("Zlomek: " + a.getCitatel() + "/" + a.getJmenovatel());
        Zlomek b = new Zlomek(3, 4);
        IO.println("Zlomek2: " + b.getCitatel() + "/" + b.getJmenovatel());
        var soucet = a.plus(b);
        IO.println("Soucet je %s".formatted(soucet.zkratit()));
        Zlomek[] pole = new Zlomek[] {
                    new Zlomek(1, 3),
                    new Zlomek(1, 2),
                    new Zlomek(6, 5),
                    new Zlomek(4, 3),
                    new Zlomek(7, 8),
                    new Zlomek(13, 10)
        };
        Zlomek prumer = prumer(pole);
        IO.println("Průměr je %s".formatted(prumer.zkratit()));
        int celeCislo = new Zlomek(25,12).intValue();
        IO.println("Zlomek na celé číslo: %d".formatted(celeCislo));
    }
    private static Zlomek prumer(Zlomek[] pole) {
        var soucet = new Zlomek();
        for(var z : pole){
            soucet = soucet.plus(z);
        }
        var pocet = new Zlomek(pole.length,1);
        return soucet.delit(pocet);
    }
}
