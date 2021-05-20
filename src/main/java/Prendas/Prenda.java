package Prendas;

import Prendas.Atributos.Color;
import Prendas.Atributos.Material;
import Prendas.Atributos.TipoDePrenda;

public class Prenda {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private int temperaturaAdecuada;

    public Prenda (TipoDePrenda tipoDePrenda , Material material , Color colorPrincipal , Color colorSecundario , int temperatura){

        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
        this.temperaturaAdecuada = temperatura;
    }

    public int getTemperaturaAdecuada(){return this.temperaturaAdecuada;}


}
