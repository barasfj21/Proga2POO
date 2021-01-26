package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import vista.EliminarInmueble;

/**
 * Controlador para la clase de EliminarInmueble
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorEliminarInmueble implements ActionListener{
  EliminarInmueble ventana = new EliminarInmueble();
  
  public ControladorEliminarInmueble(EliminarInmueble pVentana){
    ventana = pVentana; 
    
    ventana.btnRegresar.addActionListener(this);
    ventana.btnEliminar.addActionListener(this);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnEliminar){
       String inmueble = ventana.txtNumeroFinca.getText();
       
       if (inmueble != null && !inmueble.isEmpty()){
         String query = "Select * from Inmueble"; 
         
         try{
           Conexion.connect();
           ResultSet resultado = Conexion.getSelectData(query);
           boolean bandera = false;
           
           while(resultado.next()){
             if(inmueble.equals(resultado.getString("numeroFinca"))){
               bandera = true;
               Conexion.closeConnection();
               String queryDelete = "Delete from Inmueble where numeroFinca='"+inmueble+"'";
               Conexion.executeQuery(queryDelete);  
               
               JOptionPane.showMessageDialog(null, "Inmueble eliminado satisfactoriamente!");
               ventana.txtNumeroFinca.setText("");
             }
           }
           if(bandera == false){
             JOptionPane.showMessageDialog(null,"El inmueble a eliminar no existe");
           }
           
         }catch(SQLException ex){
           Logger.getLogger(ControladorEliminarInmueble.class.getName()).log(Level.SEVERE, null, ex);  
         }
       }else{
         JOptionPane.showMessageDialog(null, "Por favor, ingrese un inmueble a eliminar");
       }
    }
    if(e.getSource() == ventana.btnRegresar){
      ventana.dispose();
    }
  }
    
}
