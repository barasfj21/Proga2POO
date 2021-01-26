package modelo;


/**
 * Lote es la clase que permite manejar los datos de un agente
 * de un lote.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class Lote extends Inmueble{
  private String idLote;
  private double area;
  private byte[] fotos;
  
  /**
   * Metodo constructor para la clase Lote
   * @param pNumeroFinca el numero de finca
   * @param pModalidad la modalidad
   * @param pAreaTerreno el area del terreno
   * @param pValorMetroCuadrado el valor por metro cuadrado
   * @param pValorFiscal el valor fiscal
   * @param pProvincia la provincia
   * @param pCanton el canton
   * @param pDistrito el distrito
   * @param pDireccionExacta la direccion exacta
   * @param pIdLote el ID del lote
   * @param pArea el area de construccion
   */
  public Lote (int pNumeroFinca, String pModalidad, double pAreaTerreno,
          double pValorMetroCuadrado, double pValorFiscal, String pProvincia,
          String pCanton, String pDistrito, String pDireccionExacta, String pIdLote,
          double pArea){
      
    super(pNumeroFinca, pModalidad, pAreaTerreno, pValorMetroCuadrado,
            pValorFiscal, pProvincia, pCanton, pDistrito, pDireccionExacta);
    setIdLote(pIdLote);
    setArea(pArea);
  }

  /**
   * 
   * @param pIdLote el ID del lote
   */
  public void setIdLote(String pIdLote) {
    idLote = pIdLote;
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
   * @return el ID del lote
   */
  public String getIdLote(){
    return idLote;
  }
  
  /**
   * 
   * @return el area de construccion
   */
  public double getArea(){
    return area;
  }

}
