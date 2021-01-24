package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.RegistrarCasa;
import vista.RegistrarCentroComercial;
import vista.RegistrarEdificio;
import vista.RegistrarLote;
import vista.SeleccionarInmuebleAgregar;

/**
 * Controlador para la clase de SeleccionarInmuebleAgregar
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorSeleccionarInmuebleAgregar implements ActionListener{
  SeleccionarInmuebleAgregar ventana = new SeleccionarInmuebleAgregar();
  
  public ControladorSeleccionarInmuebleAgregar(SeleccionarInmuebleAgregar pVentana){
    ventana = pVentana;
    
    ventana.btnOk.addActionListener(this);
    ventana.btnCancelar.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnOk){
      //extrayendo el tipo de inmueble a agregar
      String tipoAgregar = ventana.ComboBoxTipos.getSelectedItem().toString();

      //abriendo la ventana correspondiente al inmueble a agregar
      if(tipoAgregar == "Casa") {
        RegistrarCasa ventanaNueva = new RegistrarCasa();
        ControladorRegistrarCasa controlador = new ControladorRegistrarCasa(ventanaNueva);
        ventanaNueva.setVisible(true);
        
      }else if(tipoAgregar == "Edificio") { 
        RegistrarEdificio ventanaNueva = new RegistrarEdificio();
        ControladorRegistrarEdificio controlador = new ControladorRegistrarEdificio(ventanaNueva);
        ventanaNueva.setVisible(true);
          
      }else if(tipoAgregar == "Centro Comercial"){
        RegistrarCentroComercial ventanaNueva = new RegistrarCentroComercial();
        ControladorRegistrarCentroComercial controlador = new ControladorRegistrarCentroComercial(ventanaNueva);
        ventanaNueva.setVisible(true); 
          
      }else if(tipoAgregar == "Lote") {
        RegistrarLote ventanaNueva = new RegistrarLote();
        ControladorRegistrarLote controlador = new ControladorRegistrarLote(ventanaNueva);
        ventanaNueva.setVisible(true); 
      
      }else{
        JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de inmueble");
      }
      
    }
    if(e.getSource() == ventana.btnCancelar){
      ventana.dispose();
    }
  }
  
}
