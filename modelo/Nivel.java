package modelo;

/**
 * Nivel es la clase que permite manejar los datos de un agente
 * de un nivel de un centro comercial.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */
public class Nivel {
  private int nivelActual;
  private int cantidadResidencias;
  private String tipo;
  private int cantidadAreas;

  /**
   * Metodo constructor para la clase nivel
   * @param pNivelActual el nvel actual del centro comercial
   * @param pCantidadResidencias la cantidad de residencias 
   * @param pTipo el tipo
   * @param pCantidadAreas la cantidad de areas 
   */
  public Nivel(int pNivelActual, int pCantidadResidencias, String pTipo,
          int pCantidadAreas){
    setNivelActual(pNivelActual);
    setCantidadResidencias(pCantidadResidencias);
    setTipo(pTipo);
    setCantidadAreas(pCantidadAreas);
  }  

  /**
   * 
   * @param pNivelActual el nivel actual
   */
  public void setNivelActual(int pNivelActual) {
    nivelActual = pNivelActual; 
  }

  /**
   * 
   * @param pCantidadResidencias la cantidad de residencias
   */
  public void setCantidadResidencias(int pCantidadResidencias) {
    cantidadResidencias = pCantidadResidencias;
  }

  /**
   * 
   * @param pTipo el tipo
   */
  public void setTipo(String pTipo) {
    tipo = pTipo;   
  }

  /**
   * 
   * @param pCantidadAreas la cantidad de areas
   */
  public void setCantidadAreas(int pCantidadAreas) {
    cantidadAreas  =  pCantidadAreas;
  }
  
  /**
   * 
   * @return el nivel actual del centro comercial
   */
  public int getNivelActual(){
    return nivelActual;
  }
  
  /**
   * 
   * @return la cantidad de residencias
   */
  public int getCantidadResidencias(){
    return cantidadResidencias;
  }
  
  /**
   * 
   * @return el tipo
   */
  public String getTipo(){
    return tipo;
  }
  
  /**
   * 
   * @return la cantidad de areas
   */
  public int getCantidadAreas(){
    return cantidadAreas;
  }
}
