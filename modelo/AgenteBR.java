package modelo;

/**
 * AgenteBR es la clase que permite manejar los datos de un agente
 * de bienes raices.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class AgenteBR extends Usuario{
  private String idAgente;
  private int telefono;
  private String nombre;
  private String primerApellido;
  private String correo;
  
  /**
   * Metodo constructor para la clase AgenteBR
   * @param pNombreUsuario es el nombre de usuario
   * @param pContrasenia es la contrasena
   * @param pIdAgente es el ID del agente
   * @param pTelefono es el telefono
   * @param pNombre es el nombre del agente
   * @param pPrimerApellido es el primer apellido del agente
   * @param pCorreo Es el correo electronico
   */
  public AgenteBR(String pNombreUsuario, String pContrasenia, String pIdAgente,
          int pTelefono, String pNombre, String pPrimerApellido, String pCorreo){
      
    super(pNombreUsuario,pContrasenia);
    setIdAgente(pIdAgente);
    setTelefono(pTelefono);
    setNombre(pNombre);
    setPrimerApellido(pPrimerApellido);
    setCorreo(pCorreo);
  }
  
  /**
   * 
   * @param pIdAgente es el ID del agente
   */
  public void setIdAgente(String pIdAgente){
    idAgente = pIdAgente;
  }
  
  /**
   * 
   * @param pTelefono el numero de telefono
   */
  public void setTelefono(int pTelefono){
    telefono = pTelefono;
  }
  
  /**
   * 
   * @param pNombre el nombre del agente 
   */
  public void setNombre(String pNombre){
    nombre = pNombre;
  }
  
  /**
   * 
   * @param pPrimerApellido el primer apellido
   */
  public void setPrimerApellido(String pPrimerApellido){
    primerApellido = pPrimerApellido;
  }
  
  /**
   * 
   * @param pCorreo el correo electronico
   */
  public void setCorreo(String pCorreo){
    correo = pCorreo;
  }
  
  /**
   * 
   * @return el ID del agente
   */
  public String getIdAgente(){
    return idAgente;
  }
  
  /**
   * 
   * @return el telefono
   */
  public int getTelefono(){
    return telefono;
  }
  
  /**
   * 
   * @return el nombre
   */
  public String getNombre(){
    return nombre;
  }
  
  /**
   * 
   * @return el primer apellido
   */
  public String getPrimerApellido(){
    return primerApellido;
  }
  
  /**
   * 
   * @return el correo
   */
  public String getCorreo(){
    return correo;
  }
}
