package modelo;

/**
 * Edificio es la clase que permite manejar los datos de un agente
 * de un edificio.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */
public class Edificio extends Inmueble{
  private String idEdificio;
  private double area;
  private String estilo;
  private double altura;
  private int cantidadNiveles;
  private boolean piscina;
  private boolean rancho;
  private int espaciosParqueo;
  private byte[] fotos;
  
  /**
   * Metodo constructor para la clase Edificio
   * @param pNumeroFinca el numero de finca
   * @param pModalidad la modalidad
   * @param pAreaTerreno el area del terreno
   * @param pValorMetroCuadrado el valor por metro cuadrado
   * @param pValorFiscal el valor fiscal
   * @param pProvincia la provincia
   * @param pCanton el canton
   * @param pDistrito el distrito
   * @param pDireccionExacta la direccion exacta
   * @param idEdificio el ID del edificio
   * @param pArea el area de construccion
   * @param pEstilo el estilo
   * @param pAltura la altura
   * @param pCantidadNiveles la cantidad de niveles
   * @param pPiscina si tiene piscina piscina
   * @param pRancho si tiene rancho rancho
   * @param pEspaciosParqueo la cantidad de espacios de parqueo
   * @param pFotos las fotos
   */ 
  public Edificio(int pNumeroFinca, String pModalidad, double pAreaTerreno,
          double pValorMetroCuadrado, double pValorFiscal, String pProvincia,
          String pCanton, String pDistrito, String pDireccionExacta, 
          String pIdEdificio, double pArea, String pEstilo, double pAltura,
          int pCantidadNiveles, boolean pPiscina, boolean pRancho,
          int pEspaciosParqueo, byte[] pFotos) {
    
    super(pNumeroFinca, pModalidad, pAreaTerreno, pValorMetroCuadrado,
            pValorFiscal, pProvincia, pCanton, pDistrito, pDireccionExacta);
    setIdEdificio(pIdEdificio);
    setArea(pArea);
    setEstilo(pEstilo);
    setAltura(pAltura);
    setCantidadNiveles(pCantidadNiveles);
    setPiscina(pPiscina);
    setRancho(pRancho);
    setEspaciosParqueo(pEspaciosParqueo);
    setFotos(pFotos);
  }

  /**
   * 
   * @param idEdificio el ID del edificio
   */
  public void setIdEdificio(String idEdificio) {
    idEdificio = idEdificio;
  }

  /**
   * 
   * @param pArea el area de construccion
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
   * @param pAltura la altura
   */
  public void setAltura(double pAltura) {
    altura = pAltura;      
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
   * @param pPiscina si tiene piscina
   */
  public void setPiscina(boolean pPiscina) {
    piscina = pPiscina;      
  }

  /**
   * 
   * @param pRancho si tiene rancho
   */
  public void setRancho(boolean pRancho) {
    rancho = pRancho;     
  }

  /**
   * 
   * @param pEspaciosParqueo los espacios de parqueo
   */
  public void setEspaciosParqueo(int pEspaciosParqueo) {
    espaciosParqueo = pEspaciosParqueo;      
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
   * @return El ID del edificio
   */
  public String getIdEdificio(){
    return idEdificio;
  }
  
  /**
   * 
   * @return al area de construccion
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
   * @return la altura
   */
  public double getAltura(){
    return altura;
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
   * @return si tiene piscina
   */
  public boolean getPiscina(){
    return piscina;
  }
  
  /**
   * 
   * @return si tiene rancho
   */
  public boolean getRancho(){
    return rancho;
  }
  
  /**
   * 
   * @return los espacios de parqueo
   */
  public int getEspaciosParqueo(){
    return espaciosParqueo;
  }
  
  /**
   * 
   * @return las fotos
   */
  public byte[] getFotos(){
    return fotos;
  }
}
