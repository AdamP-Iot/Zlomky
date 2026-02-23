package cz.uhk.merapp.data;

import java.util.ArrayList;
import java.util.List;

public class Mereni {
    private List<Number> data = new ArrayList<>();
    public void pridat(Number cislo){
        data.add(cislo); //delegování (přehazuje dál do "data")
    }
    public Number secist(){
        Number soucet = 0;
        for(Number cislo : data){
            soucet = soucet.doubleValue() + cislo.doubleValue();
        }
        return soucet;
    }
    public Number prumer(){
        return secist().doubleValue() / data.size();
    }
    public Number max(){
       Number max = data.getFirst();
        for(Number cislo : data){
            if(cislo.doubleValue() > max.doubleValue()){
                max = cislo;
            }
        }
        return max;
    }
    public Number min(){ //shift + f6 --> refractoring shortcut
        Number min = data.getFirst();
        for(Number cislo : data){
            if(cislo.doubleValue() < min.doubleValue()){
                min = cislo;
            }
        }
        return min;
    }

    public Number get(int index) {
        return data.get(index);
    }

    public int size() {
        return data.size();
    }
}
