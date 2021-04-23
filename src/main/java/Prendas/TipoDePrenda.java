package Prendas;

public enum TipoDePrenda {
    REMERA(Categoria.PARTE_SUPERIOR) ,
    ZAPATOS (Categoria.CALZADO) ,
    CAMISA_DE_MANGAS_CORTAS(Categoria.PARTE_SUPERIOR) ,
    PANTALON (Categoria.PARTE_INFERIOR) ,
    RELOJ(Categoria.ACCESORIO);

    private Categoria categoria;

    private TipoDePrenda(Categoria categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria.name();
    }
}
