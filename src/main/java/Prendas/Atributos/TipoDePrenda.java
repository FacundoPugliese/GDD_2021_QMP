package Prendas.Atributos;

import java.util.Arrays;
import java.util.List;

public enum TipoDePrenda {
    REMERA(Categoria.PARTE_SUPERIOR, Arrays.asList(TipoMaterial.ALGODON,TipoMaterial.POLIESTER)),
    ZAPATOS (Categoria.CALZADO, Arrays.asList(TipoMaterial.CUERO,TipoMaterial.POLIESTER)),
    CAMISA_DE_MANGAS_CORTAS(Categoria.PARTE_SUPERIOR ,Arrays.asList( TipoMaterial.ALGODON , TipoMaterial.POLIESTER , TipoMaterial.JEAN)),
    PANTALON (Categoria.PARTE_INFERIOR, Arrays.asList(TipoMaterial.JEAN , TipoMaterial.ALGODON , TipoMaterial.POLIESTER)),
    RELOJ(Categoria.ACCESORIO,Arrays.asList(TipoMaterial.METAL));

    private Categoria categoria;
    private List<TipoMaterial> materialesAdecuados;

    private TipoDePrenda(Categoria categoria , List<TipoMaterial> materialesAdecuados){
        this.categoria = categoria;
        this.materialesAdecuados = materialesAdecuados;
    }

    public String getCategoria(){
        return categoria.name();
    }

    public boolean admiteMaterial(TipoMaterial tm){
        return getMaterialesAdecuados().contains(tm);
    }

    private List<TipoMaterial> getMaterialesAdecuados() {
        return materialesAdecuados;
    }
}

