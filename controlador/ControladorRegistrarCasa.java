package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import vista.RegistrarCasa;

/**
 * Controlador para la clase de RegistrarCasa
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorRegistrarCasa implements ActionListener{
  RegistrarCasa ventana = new RegistrarCasa();
  
  public ControladorRegistrarCasa(RegistrarCasa pVentana){
    ventana = pVentana; 
    
    ventana.btnRegresar.addActionListener(this);
  }

  public void insertInmueble(String query) throws SQLException{
    Conexion.executeQuery(query);
    
  }
  
  public void insertCasa(String query) throws SQLException{
    Conexion.executeQuery(query);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnRegistrar){
      int pNumeroFinca =  Integer.parseInt(ventana.txtNumeroFinca.getText());
      String pModalidad = ventana.ComboBoxModalidad.getSelectedItem().toString();
      double pAreaTerreno = Double.parseDouble(ventana.txtAreaTerreno.getText());
      double pValorMetroCuadrado = Double.parseDouble(ventana.txtValorMetroCuad.getText());
      double pValorFiscal = Double.parseDouble(ventana.txtValorFiscal.getText());
      String pProvincia = ventana.txtProvincia.getText();
      String pCanton = ventana.txtCanton.getText();
      String pDistrito = ventana.txtDistrito.getText();
      String pDireccionExacta = ventana.txtDireccion.getText();
      String pID = ventana.txtID.getText();
      double pArea = Double.parseDouble(ventana.txtArea.getText());
      String pEstilo = ventana.ComboboxEstilo.getSelectedItem().toString();
      int pCantNiveles = Integer.parseInt(ventana.txtCantNIveles.getText());
      String pColor = ventana.txtColor.getText();
      String pAnio = ventana.txtAnio.getText();
     
      String queryInmueble;
      String queryCasa;
      
      queryInmueble = "Insert into Inmueble(numeroFinca, modalidad, areaTerreno,"
              + "valorMetroCuadrado, valorFiscal, provincia, canton, distrito,"
              + "direccionExacta) values ("+pNumeroFinca+",'"+pModalidad+"',"
              + pAreaTerreno+","+pValorMetroCuadrado+","+pValorFiscal+",'"+
              pProvincia+"','"+pCanton+"','"+pDistrito+"','"+pDireccionExacta+"')";
      
      queryCasa = "Insert into Casa(idCasa,area,estilo,cantidadNiveles,color,anioConstruccion)"
              + " values('"+pID+"',"+pArea+",'"+pEstilo+"',"+pCantNiveles+",'"+pColor+
              "','"+pAnio+"')";
      
      try {
        insertInmueble(queryInmueble);
      } catch (SQLException ex) {
        Logger.getLogger(ControladorRegistrarCasa.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      try {
        insertCasa(queryCasa);
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
