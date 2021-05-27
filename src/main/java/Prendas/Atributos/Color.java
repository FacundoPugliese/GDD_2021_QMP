package prendas.atributos;

public class Color {
    int rojo;
    int verde;
    int azul;

    public Color (int rojo , int verde, int azul){
        this.rojo = rojo;
        this.azul = azul;
        this.verde = verde;
    }

   public String getColor(){
        return  rojo + " , " + verde + " , " + azul;
   }
}
