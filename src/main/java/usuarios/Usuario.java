package usuarios;

import java.util.List;
import java.util.stream.Collectors;

import atuendos.*;
import prendas.Prenda;

public class Usuario {
  private List<Guardarropa> guardarropas ;
  private List<Guardarropa> guardarropasCompartidos;
  private List<Propuesta> propuestas;

  public void compartirGuardarropa(Usuario usser , Guardarropa guardarropa){
    usser.agregarGuardarropaCompartido(guardarropa);
  }

  public void agregarGuardarropaCompartido(Guardarropa guardarropa) {
    this.guardarropasCompartidos.add(guardarropa);
  }

  public void propuestaAgregarPrenda(Guardarropa gr , Prenda p){
    if(this.guardarropasCompartidos.contains(gr)) {
      agregarPropuesta(new Agregar(gr, p));
    }
  }

  public void propuestaQuitarPrenda(Guardarropa gr , Prenda p){
    if(this.guardarropasCompartidos.contains(gr)) {
      agregarPropuesta(new Quitar(gr , p));
    }

  }

  public List<Propuesta> listarPropuestasAProcesar(){
    return this.propuestas.stream().filter(p-> !p.fueProcesada()).collect(Collectors.toList());
  }

  public void procesarSolicitud(Propuesta p , boolean accion){
    if(accion){
      p.procesar(this);
    }else {
      quitarPropuesta(p);
    }
  }

  public void revertirPropuesta(Propuesta p){
    quitarPropuesta(p);
    p.revertir(this);
  }

  private void agregarPropuesta(Propuesta p){
    this.propuestas.add(p);
  }

  private void quitarPropuesta(Propuesta p){
    this.propuestas.remove(p);
  }

  public void quitarPrenda(Guardarropa gr , Prenda p){
   this.guardarropasCompartidos.get(this.guardarropasCompartidos.indexOf(gr)).quitarPrenda(p);
  }

  public void agregarPrenda(Guardarropa gr , Prenda p){
    this.guardarropasCompartidos.get(this.guardarropasCompartidos.indexOf(gr)).agregarPrenda(p);
  }

  public List<Guardarropa> getGuardarropasCompartidos(){return this.guardarropasCompartidos;}

}
