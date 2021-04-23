package Prendas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atuendo {
    List<Prenda> prendas = new ArrayList<Prenda>();

    public void getPrendas() {
        System.out.println( "Prendas del atuendo: ");
       prendas.forEach((prenda)->{
            System.out.println( prenda.getPrenda());
       });
       return;
    }



    public  void setPrendas(Prenda... prendas) {
        Collections.addAll(this.prendas, prendas);
    }
}
