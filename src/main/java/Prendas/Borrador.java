package prendas;

import prendas.atributos.*;

import java.util.Objects;

public class Borrador {
    private TipoDePrenda tipoDePrenda;
    private Material material;
    private Color colorPrincipal;
    private Color colorSecundario;
    private int temperaturaAdecuada;

    public void especificarTipoPrenda (TipoDePrenda tp){
      this.tipoDePrenda = Objects.requireNonNull(tp , "La prenda debe tener un tipo");
    }
    public void especificarColorPrincipal (Color cl ){
      this.colorPrincipal = Objects.requireNonNull(cl, "La prenda debe tener un color principal");
    }

    public void especificarMaterial ( Material mt){
      this.material = Objects.requireNonNull(mt, "La prenda debe tener un material");
    }

    public void especificarColorSecundario ( Color cl2){
      this.colorSecundario = cl2;
    }

    public void especificarTemperatura(int temp){
      this.temperaturaAdecuada = temp;
    }

    public Prenda crearPrenda(){
      validarPrenda();
      return new Prenda(tipoDePrenda,material,colorPrincipal,colorSecundario,temperaturaAdecuada);
    }

    private void validarPrenda(){
      if(this.tipoDePrenda == null || this.colorPrincipal == null || this.material == null) {
        throw new RuntimeException("Faltan atributos para poder instanciar la prenda");
      }
      if(!tipoDePrenda.admiteMaterial(material.getTipoDeMaterial())){
        throw new RuntimeException("El material y la prenda no son compatibles.");
      }
    }

}
