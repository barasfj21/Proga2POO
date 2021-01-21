package modelo;

/**
 * Inmueble es la clase que permite manejar los datos de un inmueble
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class Inmueble {
  private int numeroFinca;
  private String modalidad;
  private double areaTerreno;
  private double valorMetroCuadrado;
  private double valorFiscal;
  private String provincia;
  private String canton;
  private String distrito;
  private String direccionExacta;
  
  /**
   * Metodo constructor de la clase Inmueble
   * @param pNumeroFinca es el numero de finca
   * @param pModalidad es la modalidad del inmueble
   * @param pAreaTerreno es el area del terreno
   * @param pvalorMetroCuadrado es el valor por metro cuadrado
   * @param pValorFiscal es el valor fiscal
   * @param pProvincia es la provincia
   * @param pCanton es el canton
   * @param pDistrito es el distrito
   * @param pDireccionExacta es la direccion exacta
   */
  public Inmueble(int pNumeroFinca, String pModalidad, double pAreaTerreno,
          double pValorMetroCuadrado, double pValorFiscal, String pProvincia,
          String pCanton, String pDistrito, String pDireccionExacta){
    
    setNumeroFinca(pNumeroFinca);
    setModalidad(pModalidad);
    setAreaTerreno(pAreaTerreno);
    setValorMetroCuadrado(pValorMetroCuadrado);
    setValorFiscal(pValorFiscal);
    setProvincia(pProvincia);
    setCanton(pCanton);
    setDistrito(pDistrito);
    setDireccionExacta(pDireccionExacta);
  }
  
/**
 * 
 * @param pNumeroFinca Es el numero de finca
 */
  public void setNumeroFinca(int pNumeroFinca){
    numeroFinca = pNumeroFinca;
  }

  /**
   * 
   * @param pModalidad es la modalidad del inmueble
   */
  public void setModalidad(String pModalidad){
    modalidad = pModalidad;
  }  
  
  /**
   * 
   * @param pAreaTerreno es el area del terreno
   */
  public void setAreaTerreno(double pAreaTerreno){
    areaTerreno = pAreaTerreno;
  } 
  
  /**
   * 
   * @param pvalorMetroCuadrado es el valor por metro cuadrado
   */
  public void setValorMetroCuadrado(double pValorMetroCuadrado){
    valorMetroCuadrado = pValorMetroCuadrado;
  }

  /**
   * 
   * @param pValorFiscal Es el valor fiscal
   */
  public void setValorFiscal(double pValorFiscal){
    valorFiscal = pValorFiscal;
  }
  
  /**
   * 
   * @param pProvincia Es la provincia
   */
  public void setProvincia(String pProvincia){
    provincia = pProvincia;
  }  

  /**
   * 
   * @param pCanton Es el canton
   */
  public void setCanton(String pCanton){
    canton = pCanton;
  } 

  /**
   * 
   * @param pDistrito Es el distrito
   */
  public void setDistrito(String pDistrito){
    distrito = pDistrito;
  } 

  /**
   * 
   * @param pDireccionExacta Es la direccion exacta
   */
  public void setDireccionExacta(String pDireccionExacta){
    direccionExacta = pDireccionExacta;
  } 

  /**
   * 
   * @return el numero de finca
   */
  public int getNumeroFinca(){
    return numeroFinca;
  }
  
  /**
   * 
   * @return la modalidad
   */
  public String getModalidad(){
    return modalidad;
  }
  
  /**
   * 
   * @return el area del terreno
   */
  public double getAreaTerreno(){
    return areaTerreno;
  }
  
  /**
   * 
   * @return el valor por metro cuadrado
   */
  public double getValorMetroCuadrado(){
    return valorMetroCuadrado;
  }
  
  /**
   * 
   * @return el valor fiscal
   */
  public double getValorFiscal(){
    return valorFiscal;
  }
  
  /**
   * 
   * @return la provincia
   */
  public String getProvincia(){
    return provincia;
  }
  
  /**
   * 
   * @return el canton
   */
  public String getCanton(){
    return canton;
  }
  
  /**
   * 
   * @return el distrito
   */
  public String getDistrito(){
    return distrito;
  }
  
  /**
   * 
   * @return la direccion exacta
   */
  public String getDireccionExacta(){
    return direccionExacta;
  }
}
