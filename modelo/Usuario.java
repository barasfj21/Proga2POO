package modelo;

/**
 * Usuario es la clase que permite manejar los datos de un usuario
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class Usuario {
  private String nombreUsuario;
  private String contrasenia;
  
  /**
   * Metodo constructor de la clase Usuario
   * @param pNombreUsuario es el nombre de usuario
   * @param pContrasenia es la contraseña del usuario
   */
  public Usuario(String pNombreUsuario, String pContrasenia){
    setNombreUsuario(pNombreUsuario);
    setContrasenia(pContrasenia);
  }
  
  /**
   * 
   * @param pNombreUsuario Es el nombre del usuario 
   */
  public void setNombreUsuario(String pNombreUsuario){
    nombreUsuario = pNombreUsuario;
  }
  
  /**
   * 
   * @param pContrasenia Es la contraseña del usuario
   */
  public void setContrasenia(String pContrasenia){
    contrasenia = pContrasenia;
  }

  /**
   * 
   * @return el nombre de usuario
   */
  public String getNombreUsuario(){
    return nombreUsuario;
  }
  
  /**
   * 
   * @return la contraseña del usuario
   */
  public String getContrasenia(){
    return contrasenia;
  }
}
