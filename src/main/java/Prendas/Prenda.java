package Prendas;

public class Prenda {
    TipoDePrenda tipoDePrenda;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;

    public Prenda (TipoDePrenda tipoDePrenda , Material material , Color colorPrincipal){
        this.tipoDePrenda = tipoDePrenda;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
        if(tipoDePrenda == null || material == null || colorPrincipal == null){
            throw new RuntimeException("Se cargaron valores nullos en la prenda.");
        }
    }


    public String getPrenda() {
       if(colorSecundario != null) {
           return "Prenda{" +
                   "tipoDePrenda=" + tipoDePrenda.name() +
                   "categoria =" + tipoDePrenda.getCategoria() +
                   ", material=" + material.name() +
                   ", colorPrincipal=" + colorPrincipal.name() +
                   ", colorSecundario=" + colorSecundario.name() +
                   '}';
       }else
       {
           return "Prenda{" +
                   "tipoDePrenda=" + tipoDePrenda.name() +
                   ", categoria =" + tipoDePrenda.getCategoria() +
                   ", material=" + material.name() +
                   ", colorPrincipal=" + colorPrincipal.name() + '}' ;
       }
    }
}
