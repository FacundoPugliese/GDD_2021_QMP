package atuendos;

import prendas.Prenda;


import java.util.List;

public interface GeneradorSugerencias {
  public List<Sugerencia> generarSugerenciasDesde(List<Prenda> prendasAptas);
}
