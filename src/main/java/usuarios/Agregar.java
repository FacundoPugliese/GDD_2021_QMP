package usuarios;

import atuendos.Guardarropa;
import prendas.Prenda;

public class Agregar implements Propuesta{
  private Guardarropa guardarropaCompartido;
  private Prenda prendaParaAgregar;
  private boolean procesada = false;

  public Agregar(Guardarropa guardarropaCompartido, Prenda prendaParaAgregar) {
    this.guardarropaCompartido = guardarropaCompartido;
    this.prendaParaAgregar = prendaParaAgregar;
  }

  @Override
  public void procesar(Usuario usser) {
    this.procesada = true;
    usser.agregarPrenda(this.guardarropaCompartido,this.prendaParaAgregar);
  }

  @Override
  public void revertir(Usuario usser) {
    if(procesada){
      Propuesta p = new Quitar(this.guardarropaCompartido , this.prendaParaAgregar);
      p.procesar(usser);
    }
  }

  @Override
  public boolean fueProcesada() {
    return procesada;
  }
}
