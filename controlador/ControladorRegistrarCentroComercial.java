package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import vista.RegistrarCentroComercial;

/**
 * Controlador para la clase de RegistrarCentroComercial
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorRegistrarCentroComercial implements ActionListener{
  RegistrarCentroComercial ventana = new RegistrarCentroComercial();
  
  public ControladorRegistrarCentroComercial(RegistrarCentroComercial pVentana){
    ventana = pVentana; 
    
    ventana.btnRegresar.addActionListener(this);
    ventana.btnRegistrar.addActionListener(this);
  }
  
  public void insertInmueble(String query) throws SQLException{
    Conexion.executeQuery(query);
    
  }
  
  public void insertCentroComercial(String query) throws SQLException{
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
      String pEstilo = ventana.ComboboxEstilos.getSelectedItem().toString();
      int pCantidadTiendas =  Integer.parseInt(ventana.txtTiendas.getText());
      int pCantidadSalas =  Integer.parseInt(ventana.txtSalas.getText());
      String pCadenaCIne = ventana.txtCadenaCine.getText();
      int pCantidadHotspots =  Integer.parseInt(ventana.txtHotspots.getText());
      int pCantidadEscaleras =  Integer.parseInt(ventana.txtEscaleras.getText());
      int pCantidadZonas =  Integer.parseInt(ventana.txtZonasDiscapacitados.getText());
     
      String queryInmueble;
      String queryCentroComercial;
      
      queryInmueble = "Insert into Inmueble(numeroFinca, modalidad, areaTerreno,"
              + "valorMetroCuadrado, valorFiscal, provincia, canton, distrito,"
              + "direccionExacta) values ("+pNumeroFinca+",'"+pModalidad+"',"
              + pAreaTerreno+","+pValorMetroCuadrado+","+pValorFiscal+",'"+
              pProvincia+"','"+pCanton+"','"+pDistrito+"','"+pDireccionExacta+"')";
      
      queryCentroComercial = "Insert into CentroComercial(idCentro,area,estilo,cantidadTiendas,"
              + "cantidadSalasCine,nombreCadenaCine,cantidadHotspot,cantidadEscaleras,cantidadZonasDiscapacitados) "
              + "values('"+pID+"',"+pArea+",'"+pEstilo+"',"+pCantidadTiendas+","+pCantidadSalas+
              ",'"+pCadenaCIne+"',"+pCantidadHotspots+","+pCantidadEscaleras+","+pCantidadZonas+")";
      
      try {
        insertInmueble(queryInmueble);
      } catch (SQLException ex) {
        Logger.getLogger(ControladorRegistrarCasa.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      try {
        insertCentroComercial(queryCentroComercial);
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
