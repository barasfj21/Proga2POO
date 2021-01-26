package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import vista.RegistrarLote;

/**
 * Controlador para la clase de RegistrarLote
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorRegistrarLote implements ActionListener{
  RegistrarLote ventana = new RegistrarLote();
  
  public ControladorRegistrarLote(RegistrarLote pVentana){
    ventana = pVentana; 
    
    ventana.btnRegresar.addActionListener(this);
    ventana.btnRegistrar.addActionListener(this);
  }
  
  public void insertInmueble(String query) throws SQLException{
    Conexion.executeQuery(query);
    
  }
  
  public void insertLote(String query) throws SQLException{
    Conexion.executeQuery(query);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnRegistrar){
      int pNumeroFinca =  Integer.parseInt(ventana.txtNumeroFinca.getText());
      String pModalidad = ventana.ComboboxModalidad.getSelectedItem().toString();
      double pAreaTerreno = Double.parseDouble(ventana.txtAreaTerreno.getText());
      double pValorMetroCuadrado = Double.parseDouble(ventana.txtValorMetroCuad.getText());
      double pValorFiscal = Double.parseDouble(ventana.txtValorFiscal.getText());
      String pProvincia = ventana.txtProvincia.getText();
      String pCanton = ventana.txtCanton.getText();
      String pDistrito = ventana.txtDistrito.getText();
      String pDireccionExacta = ventana.txtDireccion.getText();
      String pID = ventana.txtID.getText();
      double pArea = Double.parseDouble(ventana.txtArea.getText());
     
      String queryInmueble;
      String queryLote;
      
      queryInmueble = "Insert into Inmueble(numeroFinca, modalidad, areaTerreno,"
              + "valorMetroCuadrado, valorFiscal, provincia, canton, distrito,"
              + "direccionExacta) values ("+pNumeroFinca+",'"+pModalidad+"',"
              + pAreaTerreno+","+pValorMetroCuadrado+","+pValorFiscal+",'"+
              pProvincia+"','"+pCanton+"','"+pDistrito+"','"+pDireccionExacta+"')";
      
      queryLote = "Insert into Lote(idLote,area) values('"+pID+"',"+pArea+")";
      
      try {
        insertInmueble(queryInmueble);
      } catch (SQLException ex) {
        Logger.getLogger(ControladorRegistrarCasa.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      try {
        insertLote(queryLote);
      } catch (SQLException ex) {
        Logger.getLogger(ControladorRegistrarCasa.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      JOptionPane.showMessageDialog(null,"Inmueble registrado satisfactoriamente!");
      
    }
    if(e.getSource() == ventana.btnRegresar){
      ventana.dispose();
    }
  }
    
}
