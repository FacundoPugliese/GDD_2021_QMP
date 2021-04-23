package Main;

import Prendas.*;
import Prendas.Color;



public class Main {
    public static void main(String args[]) {
        TipoDePrenda tipo = TipoDePrenda.PANTALON;
        Material material = Material.JEAN;
        Color color = Color.NEGRO;
        Color color1 = Color.AZUL;
        Prenda jean_levis = new Prenda(tipo,material,color);

        System.out.println(jean_levis.getPrenda() + '\n');



        Prenda jean_levis2 = new Prenda(tipo,material,color1);

        Atuendo conjunto = new Atuendo();

        conjunto.setPrendas(jean_levis , jean_levis2);
        conjunto.getPrendas();

    }
}
