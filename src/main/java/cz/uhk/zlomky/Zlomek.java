package cz.uhk.zlomky;
//ctrl + alt + l ==> přeformátování kodu

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    /**
     * Basic konstruktor bez parametrů
     */
    public Zlomek() {
        citatel = 0;
        jmenovatel = 1;
    }

    /**
     * Konstruktor
     *
     * @param citatel
     * @param jmenovatel musí být různý od nuly
     */
    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    //getry == selektory == čtení dat
    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    //setry == modifikátory == změna zápis dat
    public void setCitatel(int citatel) {
        this.citatel = citatel;
    }

    public void setJmenovatel(int jmenovatel) {
        this.jmenovatel = jmenovatel;
    }
    //Anotace

    /**
     * Metoda pro sčítání dvou zlomků
     *
     * @param druhy
     * @return
     */
    public Zlomek plus(Zlomek druhy) {
        int jm = jmenovatel * druhy.getJmenovatel();
        int cit = citatel * druhy.getJmenovatel() + druhy.citatel * jmenovatel;
        return new Zlomek(cit, jm);
    }
    public Zlomek plus(int cislo) { // PŘTÍŽENÁ METODA (overload)
        int cit = citatel + jmenovatel * cislo;
        return new Zlomek(cit, jmenovatel);
    }

    /**
     * Metoda pro odčítání dvou zlomků
     *
     * @param druhy
     * @return
     */
    public Zlomek minus(Zlomek druhy) {
        int jm = jmenovatel * druhy.getJmenovatel();
        int cit = citatel * druhy.getJmenovatel() - druhy.citatel * jmenovatel;
        return new Zlomek(cit, jm);
    }

    /**
     * Vypocet největšího společného dělitele čísel a, b
     *
     * @param a
     * @param b
     * @return
     */
    private int nsd(int a, int b) {
        if (a < b) {
            int pom = a;
            a = b;
            b = pom;
        }
        int zbytek;
        do {
            zbytek = a % b;
            a = b;
            b = zbytek;
        } while (zbytek != 0);
        return a;
    }

    public Zlomek zkratit() {
        int delitel = nsd(citatel, jmenovatel); // vypocet nejv. spol. delitele
        return new Zlomek(citatel / delitel, jmenovatel / delitel);
    }
    public Zlomek delit(Zlomek pocet){
        int delitel = nsd(citatel, jmenovatel);
        return new Zlomek(citatel * delitel, jmenovatel * delitel);
    }
    @Override
    public String toString() {
        return String.format("%d"+"/"+"%d", citatel, jmenovatel); //zarovnání textu
    }
}
