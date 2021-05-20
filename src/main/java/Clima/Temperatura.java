package Clima;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Temperatura {

    private int temperaturaFarenheit;
    private String unidad;
    private LocalDate dia;

    public void Temperatura (){

      AccuWeatherAPI apiClima = new AccuWeatherAPI();
      List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
      Map<String,Object> temp = (Map<String,Object>) condicionesClimaticas.get(0).get("Temperature");

      this.temperaturaFarenheit = (Integer) temp.get("Value");


    }

    public double pasarACelcius(){
      return unidad.equals("F") ? (temperaturaFarenheit - 32) * 5 / 9 : temperaturaFarenheit;
    }




}
