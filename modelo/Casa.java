package modelo;

/**
 * Casa es la clase que permite manejar los datos de un agente
 * de una casa.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class Casa extends Inmueble{
  private String idCasa;
  private double area;
  private String estilo;
  private int cantidadNiveles;
  private String color;
  private String anioConstruccion;
  private byte[] fotos;
  
  /**
   * Metodo constructor para la clase Casa
   * @param pNumeroFinca el numero de finca
   * @param pModalidad la modalidad
   * @param pAreaTerreno el area del terreno
   * @param pValorMetroCuadrado el valor por metro cuadrado
   * @param pValorFiscal el valor fiscal
   * @param pProvincia la provincia
   * @param pCanton el canton
   * @param pDistrito el distrito
   * @param pDireccionExacta la direccion exacta
   * @param pIdCasa el id de la casa
   * @param pArea el area de construccion
   * @param pEstilo el estilo
   * @param pCantidadNiveles la cantidad de niveles
   * @param pColor el color de la casa
   * @param pAnioConstruccion el ano de construccion
   * @param pFotos las fotos pertitentes a la casa
   */
  public Casa(int pNumeroFinca, String pModalidad, double pAreaTerreno,
          double pValorMetroCuadrado, double pValorFiscal, String pProvincia,
          String pCanton, String pDistrito, String pDireccionExacta, String pIdCasa,
          double pArea, String pEstilo, int pCantidadNiveles, String pColor, 
          String pAnioConstruccion, byte[] pFotos) {
    
    super(pNumeroFinca, pModalidad, pAreaTerreno, pValorMetroCuadrado,
            pValorFiscal, pProvincia, pCanton, pDistrito, pDireccionExacta);
    setIdCasa(pIdCasa);
    setArea(pArea);
    setEstilo(pEstilo);
    setCantidadNiveles(pCantidadNiveles);
    setColor(pColor);
    setAnioConstruccion(pAnioConstruccion);
    setFotos(pFotos);
  }

  /**
   * 
   * @param pIdCasa el id de la casa
   */
  public void setIdCasa(String pIdCasa) {
    idCasa = pIdCasa;
  }

  /**
   * 
   * @param pArea el area
   */
  public void setArea(double pArea) {
    area = pArea;
  }

  /**
   * 
   * @param pEstilo el estilo
   */
  public void setEstilo(String pEstilo) {
    estilo = pEstilo;  
  }

  /**
   * 
   * @param pCantidadNiveles la cantidad de niveles
   */
  public void setCantidadNiveles(int pCantidadNiveles) {
    cantidadNiveles = pCantidadNiveles;    
  }

  /**
   * 
   * @param pColor el color
   */
  public void setColor(String pColor) {
    color = pColor;    
  }

  /**
   * 
   * @param pAnioConstruccion el anio de construccion
   */
  public void setAnioConstruccion(String pAnioConstruccion) {
    anioConstruccion = pAnioConstruccion;    
  }

  /**
   * 
   * @param pFotos las fotos
   */
  public void setFotos(byte[] pFotos) {
    fotos = pFotos;    
  }
    
  /**
   * 
   * @return el ID de la casa
   */
  public String getIdCasa(){
    return idCasa;
  }
    
  /**
   * 
   * @return el area 
   */
  public double getArea(){
    return area;
  }
    
  /**
   * 
   * @return el estilo
   */
  public String getEstilo(){
    return estilo;
  }

  /**
   * 
   * @return la cantidad de niveles
   */
  public int getCantidadNiveles(){
    return cantidadNiveles;
  }

  /**
   * 
   * @return el color
   */
  public String getColor(){
    return color;
  }

  /**
   * 
   * @return el anio de construccion
   */
  public String getAnioConstruccion(){
    return anioConstruccion;
  }

  /**
   * 
   * @return las fotos
   */
  public byte[] fotos(){
    return fotos;
  }       
}
