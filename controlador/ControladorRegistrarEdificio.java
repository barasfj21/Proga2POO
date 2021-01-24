package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import vista.RegistrarEdificio;

/**
 * Controlador para la clase de RegistrarEdificio
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorRegistrarEdificio implements ActionListener{
  RegistrarEdificio ventana = new RegistrarEdificio();
  
  public ControladorRegistrarEdificio(RegistrarEdificio pVentana){
    ventana = pVentana; 
    
    ventana.btnRegresar.addActionListener(this);
  }
  
  public void insertInmueble(String query) throws SQLException{
    Conexion.executeQuery(query);
    
  }
  
  public void insertEdificio(String query) throws SQLException{
    Conexion.executeQuery(query);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnRegistrar){
      int pNumeroFinca =  Integer.parseInt(ventana.txtNumeroFinca.getText());
      String pModalidad = ventana.ComboboxModalidad.getSelectedItem().toString();
      double pAreaTerreno = Double.parseDouble(ventana.txtAreaTerreno.getText());
      double pValorMetroCuadrado = Double.parseDouble(ventana.txtValorMetroCuad.getText());
      double pValorFiscal = Double.parseDouble(ventana.txtvalorFiscal.getText());
      String pProvincia = ventana.txtProvincia.getText();
      String pCanton = ventana.txtCanton.getText();
      String pDistrito = ventana.txtDistrito.getText();
      String pDireccionExacta = ventana.txtDireccion.getText();
      String pID = ventana.txtID.getText();
      double pArea = Double.parseDouble(ventana.txtArea.getText());
      String pEstilo = ventana.ComboboxEstilos.getSelectedItem().toString();
      double pAltura = Double.parseDouble(ventana.txtAltura.getText());
      int pCantNiveles = Integer.parseInt(ventana.txtCantNiveles.getText());
      String pPiscina = ventana.ComboboxPiscina.getSelectedItem().toString();
      String pRancho = ventana.ComboboxRancho.getSelectedItem().toString();
      int piscinaBoolean;
      int ranchoBoolean;
      if(pPiscina.equals("Si")){
        piscinaBoolean = 1;
      }else{
        piscinaBoolean = 0;
      }
      if(pRancho.equals("Si")){
        ranchoBoolean = 1;
      }else{
        ranchoBoolean = 0; 
      }
      int pEspaciosParqueo = Integer.parseInt(ventana.txtEspaciosParqueo.getText());
      
      String queryInmueble;
      String queryEdificio;
      
      queryInmueble = "Insert into Inmueble(numeroFinca, modalidad, areaTerreno,"
              + "valorMetroCuadrado, valorFiscal, provincia, canton, distrito,"
              + "direccionExacta) values ("+pNumeroFinca+",'"+pModalidad+"',"
              + pAreaTerreno+","+pValorMetroCuadrado+","+pValorFiscal+",'"+
              pProvincia+"','"+pCanton+"','"+pDistrito+"','"+pDireccionExacta+"')";
      
      queryEdificio = "Insert into Edificio(idEdificio,area,estilo,altura,cantidadNiveles,"
              + "piscina,rancho,espaciosParqueo) values('"+pID+"',"+pArea+",'"+pEstilo+"',"+
              pAltura+","+pCantNiveles+","+piscinaBoolean+","+ranchoBoolean+","+pEspaciosParqueo+")";
      
      try {
        insertInmueble(queryInmueble);
      } catch (SQLException ex) {
        Logger.getLogger(ControladorRegistrarCasa.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      try {
        insertEdificio(queryEdificio);
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
