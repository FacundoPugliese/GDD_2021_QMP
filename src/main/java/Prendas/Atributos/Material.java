package prendas.atributos;

import java.util.Objects;

public class Material {
    private TipoMaterial tipoDeMaterial;
    private Trama trama;

    public Material(TipoMaterial tipoDeMaterial, Trama trama) {
        this.tipoDeMaterial = Objects.requireNonNull(tipoDeMaterial);
        this.trama = trama.equals(null) ? Trama.LISA : trama;
    }
    public TipoMaterial getTipoDeMaterial(){
        return tipoDeMaterial;
    }
}
