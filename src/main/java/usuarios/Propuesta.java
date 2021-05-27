package usuarios;



public interface Propuesta {
  public void procesar(Usuario usser);
  public void revertir(Usuario usser);
  public boolean fueProcesada();
}
