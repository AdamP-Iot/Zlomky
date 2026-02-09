package cz.uhk.zlomky;

public class Zlomek {
    private int citatel;
    private int jmenovatel;
    /**
     * Basic konstruktor bez parametrů
     */
    public Zlomek() {
    }
    /**
     * Konstruktor
     * @param citatel
     * @param jmenovatel musí být různý od nuly
     */
    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }


    //getry == selektory == čtení dat
    public int getCitatel(){
        return citatel;
    }
    public int getJmenovatel(){
        return jmenovatel;
    }

    //setry == modifikátory == změna zápis dat
    public void setCitatel(int citatel){
        this.citatel = citatel;
    }
    public void setJmenovatel(int jmenovatel){
        this.jmenovatel = jmenovatel;
    }
    //Anotace
    @Override
    public String toString() {
        return String.format("%3d\n------\n%3d",citatel,jmenovatel); //zarovnání textu
    }
}
