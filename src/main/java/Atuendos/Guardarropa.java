package atuendos;

import prendas.Prenda;
import Clima.Temperatura;


import java.util.List;
import java.util.stream.Collectors;

  public class Guardarropa implements GeneradorSugerencias {
    private List<Prenda> prendas;
    private Temperatura temperaturaDelDia = new Temperatura();

    public List<Sugerencia> generarSugerenciasSegunClima(){
      double tempActual = this.temperaturaDelDia.pasarACelcius();

      List<Prenda> prendasParaElDia = filtrarPrendasNoAptasParaElClima(this.prendas,tempActual);

      return this.generarSugerenciasDesde(prendasParaElDia);
    }

    public void refrescarPronostico(){
      this.temperaturaDelDia = new Temperatura();
    }

    public List<Prenda> filtrarPrendasNoAptasParaElClima(List<Prenda> prendas , double temperatura){
      return prendas.stream()
              .filter(prenda -> prenda.getTemperaturaAdecuada() < temperatura)
              .collect(Collectors.toList());
    }

    public void quitarPrenda(Prenda p){
      this.prendas.remove(p);
    }

    public void agregarPrenda(Prenda p) {
      this.prendas.add(p);
    }

    @Override
    public List<Sugerencia> generarSugerenciasDesde(List<Prenda> prendasAptas) {
      //TODO
      return null;
    }


  }
