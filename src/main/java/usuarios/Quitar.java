package usuarios;

import atuendos.Guardarropa;
import prendas.Prenda;

public class Quitar implements Propuesta{
  private Guardarropa guardarropaCompartido;
  private Prenda prendaParaQuitar;
  private boolean procesada = false;

  public Quitar(Guardarropa guardarropaCompartido, Prenda prendaParaQuitar) {
    this.guardarropaCompartido = guardarropaCompartido;
    this.prendaParaQuitar = prendaParaQuitar;
  }

  @Override
  public void procesar(Usuario usser) {

        this.procesada = true;
        usser.quitarPrenda(this.guardarropaCompartido , this.prendaParaQuitar);

    }

  @Override
  public void revertir(Usuario usser) {
    if(procesada){
      Propuesta p = new Agregar(this.guardarropaCompartido , this.prendaParaQuitar);
      p.procesar(usser);
    }
  }

  @Override
  public boolean fueProcesada() {
    return procesada;
  }
}

