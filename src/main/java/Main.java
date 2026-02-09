import cz.uhk.zlomky.Zlomek;

public class Main {
    public static void main(String[] args) {
        IO.println("Projektos ZLOMKY");
        IO.println("=======================================");
        var a = new Zlomek(); //Konstruktor bez parametru
        a.setCitatel(3);
        a.setJmenovatel(2);
        IO.println("Zlomek: " + a.getCitatel() + "/" + a.getJmenovatel());
        Zlomek b = new Zlomek(4,5);
        IO.println(b);
    }
}
