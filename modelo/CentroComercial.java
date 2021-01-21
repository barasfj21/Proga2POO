package modelo;

/**
 * CentroComercial es la clase que permite manejar los datos de un agente
 * de un centro comercial.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class CentroComercial extends Inmueble{
  private String idCentro;
  private double area;
  private String estilo;
  private int cantidadTiendas;
  private int cantidadSalasCine;
  private String nombreCadenaCine;
  private int cantidadHotspot;
  private int cantidadEscaleras;
  private int cantidadZonasDiscapacitados;
  private byte[] fotos;
  
  /**
   * Metodo constructor para la clase CentroComercial
   * @param pNumeroFinca el numero de finca
   * @param pModalidad la modalidad
   * @param pAreaTerreno el area del terreno
   * @param pValorMetroCuadrado el valor por metro cuadrado
   * @param pValorFiscal el valor fiscal
   * @param pProvincia la provincia
   * @param pCanton el canton
   * @param pDistrito el distrito
   * @param pDireccionExacta la direccion exacta
   * @param pIdCentro el ID del centro comercial
   * @param pArea el area de construccion
   * @param pEstilo el estilo
   * @param pCantidadTiendas la cantidad de tiendas
   * @param pCantidadSalasCine la cantidad de salas de cine
   * @param pNombreCadenaCine el nombre de la cadena de cine
   * @param pCantidadHotspot la cantidad de hotspot
   * @param pCantidadEscaleras la cantidad de escaleras
   * @param pCantidadZonasDiscapacitados la cantidad de zonas para discapacitados
   * @param pFotos las fotos
   */
  public CentroComercial(int pNumeroFinca, String pModalidad, double pAreaTerreno,
          double pValorMetroCuadrado, double pValorFiscal, String pProvincia,
          String pCanton, String pDistrito, String pDireccionExacta, 
          String pIdCentro, double pArea, String pEstilo, int pCantidadTiendas,
          int pCantidadSalasCine, String pNombreCadenaCine, int pCantidadHotspot,
          int pCantidadEscaleras, int pCantidadZonasDiscapacitados, byte[] pFotos) {
    
    super(pNumeroFinca, pModalidad, pAreaTerreno, pValorMetroCuadrado,
            pValorFiscal, pProvincia, pCanton, pDistrito, pDireccionExacta);
    setIdCentro(pIdCentro);
    setArea(pArea);
    setEstilo(pEstilo);
    setCantidadTiendas(pCantidadTiendas);
    setCantidadSalasCine(pCantidadSalasCine);
    setNombreCadenaCine(pNombreCadenaCine);
    setCantidadHotspot(pCantidadHotspot);
    setCantidadEscaleras(pCantidadEscaleras);
    setCantidadZonasDiscapacitados(pCantidadZonasDiscapacitados);
    setFotos(pFotos);
  }   
  
  /**
   * 
   * @param pIdCentro el ID del centro comercial
   */
  public void setIdCentro(String pIdCentro){
    idCentro = pIdCentro;
  }
  
  /**
   * 
   * @param pArea el area de construccion
   */
  public void setArea(double pArea){
    area = pArea;
  }
  
  /**
   * 
   * @param pEstilo el estilo
   */
  public void setEstilo(String pEstilo){
    estilo = pEstilo;
  }
  
  /**
  * 
  * @param pCantidadTiendas la cantidad de tiendas
  */
  public void setCantidadTiendas(int pCantidadTiendas){
    cantidadTiendas = pCantidadTiendas;
  }
  
  /**
   * 
   * @param pCantidadSalasCine la cantidad de salas de cine
   */
  public void setCantidadSalasCine(int pCantidadSalasCine){
    cantidadSalasCine = pCantidadSalasCine;
  }
  
  /**
   * 
   * @param pNombreCadenaCine el nombre de la cadena de cine 
   */
  public void setNombreCadenaCine(String pNombreCadenaCine){
    nombreCadenaCine = pNombreCadenaCine;
  }
  
  /**
   * 
   * @param pCantidadHostpot la cantidad de hotspot
   */
  public void setCantidadHotspot(int pCantidadHostpot){
    cantidadHotspot = pCantidadHostpot;
  }
  
  /**
   * 
   * @param pCantidadEscaleras la cantidad de escaleras
   */
  public void setCantidadEscaleras(int pCantidadEscaleras){
    cantidadEscaleras = pCantidadEscaleras;
  }
  
  /**
   * 
   * @param pCantidadZonasDiscapacitados la cantidad de zonas para discapacitados
   */
  public void setCantidadZonasDiscapacitados(int pCantidadZonasDiscapacitados){
    cantidadZonasDiscapacitados = pCantidadZonasDiscapacitados;
  }
  
  /**
   * 
   * @param pFotos las fotos
   */
  public void setFotos(byte[] pFotos){
    fotos = pFotos;
  }
  
  /**
   * 
   * @return el ID del centro
   */
  public String getIdCentro(){
    return idCentro;
  }
  
  /**
   * 
   * @return el area de construccion
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
   * @return la cantidad de tiendas
   */
  public int getCantidadTiendas(){
    return cantidadTiendas;
  }
  
  /**
   * 
   * @return la cantidad de salas de cine
   */
  public int getCantidadSalasCine(){
    return cantidadSalasCine;
  }
  
  /**
   * 
   * @return el nombre de la cadena de cine
   */
  public String getNombreCadenaCine(){
    return nombreCadenaCine;
  }
  
  /**
   * 
   * @return la cantidad de hotspot
   */
  public int getCantidadHotspot(){
    return cantidadHotspot;
  }
  
  /**
   * 
   * @return la cantidad de escaleras
   */
  public int getCantidadEscaleras(){
    return cantidadEscaleras;
  }
  
  /**
   * 
   * @return la cantidad de zonas para discapacitados
   */
  public int getCantidadZonasDiscapacitados(){
    return cantidadZonasDiscapacitados;
  }
  
  /**
   * 
   * @return las fotos
   */
  public byte[] getFotos(){
    return fotos;
  }
  
}
