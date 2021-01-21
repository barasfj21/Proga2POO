package modelo;

/**
 * Cliente es la clase que permite manejar los datos de un agente
 * de un cliente.
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */
public class Cliente extends Usuario{
  private String idCliente;
  private int telefono;
  private String nombre;
  private String primerApellido;
  private String segundoApellido;
  
  /**
   * Metodo constructor para la clase Cliente
   * @param pNombreUsuario es el nombre de usuario
   * @param pContrasenia es la contrasena
   * @param pIdCliente es el ID del cliente
   * @param pTelefono es el telefono
   * @param pNombre es el nombre del cliente
   * @param pPrimerApellido es el primer apellido del cliente
   * @param pSegundoApellido es el primer apellido del cliente
   */
  public Cliente(String pNombreUsuario, String pContrasenia, String pIdCliente,
          int pTelefono, String pNombre, String pPrimerApellido,
          String pSegundoApellido, String pCorreo){
      
    super(pNombreUsuario,pContrasenia);
    setIdCliente(pIdCliente);
    setTelefono(pTelefono);
    setNombre(pNombre);
    setPrimerApellido(pPrimerApellido);
    setSegundoApellido(pSegundoApellido);
  }
  
  /**
   * 
   * @param pIdCliente es el ID del cliente
   */
  public void setIdCliente(String pIdCliente){
    idCliente = pIdCliente;
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
   * @param pNombre el nombre del cliente 
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
   * @param pSegundoApellido el segundo apellido
   */
  public void setSegundoApellido(String pSegundoApellido){
    segundoApellido = pSegundoApellido;
  }
  
  /**
   * 
   * @return el ID del cliente
   */
  public String getIdCliente(){
    return idCliente;
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
   * @return el segundo apellido
   */
  public String getSegundoApellido(){
    return segundoApellido;
  }
}
