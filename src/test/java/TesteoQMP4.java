import atuendos.Guardarropa;
import prendas.atributos.*;
import prendas.Prenda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class TesteoQMP4 {

  @Test
  void soloSeAceptanPrendasAptasSegunLaTemperatura(){
    Prenda remeraLarga = new Prenda(TipoDePrenda.REMERA , new Material(TipoMaterial.ALGODON , Trama.LISA) ,new Color(0,0,0),null,25);
    Prenda pantalonLargo = new Prenda(TipoDePrenda.PANTALON , new Material(TipoMaterial.JEAN , Trama.LISA), new Color(5,5,5), null ,30);
    List<Prenda> prendas = new ArrayList<>();
    prendas.add(remeraLarga);
    prendas.add(pantalonLargo);
    Guardarropa placard = new Guardarropa();
    Assertions.assertEquals(placard.filtrarPrendasNoAptasParaElClima(prendas , 26).size() , 1);
  }
}