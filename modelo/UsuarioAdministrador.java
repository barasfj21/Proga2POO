package modelo;

/**
 * UsuarioAdministrador es la clase que permite manejar los datos de un admin
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class UsuarioAdministrador extends Usuario {
  private String idAdmin;
  
  /**
   * Metodo constructor para la clase de UsuarioAdministrador
   * @param pNombreUsuario es el nombre de usuario
   * @param pContrasenia Es la contrasena del usuario
   * @param pIdAdmin Es el ID del admin
   */
  public UsuarioAdministrador(String pNombreUsuario, String pContrasenia,
          String pIdAdmin){
      
    super(pNombreUsuario,pContrasenia);
    setIdAdmin(pIdAdmin);
  }
  
  /**
   * 
   * @param pIdAdmin Es el ID del admin
   */
  public void setIdAdmin(String pIdAdmin){
    idAdmin = pIdAdmin;
  }
  
  /**
   * 
   * @return el ID del admin
   */
  public String getIdAdmin(){
    return idAdmin;
  }
}
