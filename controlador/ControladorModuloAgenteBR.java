package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ConsultarCatalogo;
import vista.ConsultarInteresados;
import vista.EliminarInmueble;
import vista.IngresarInmuebleModificar;
import vista.ModuloAgenteBR;
import vista.RegistrarCasa;
import vista.SeleccionarInmuebleAgregar;

/**
 * Controlador para la clase de ModuloAgenteBR
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorModuloAgenteBR implements ActionListener {
    ModuloAgenteBR ventana = new ModuloAgenteBR();
    
    public ControladorModuloAgenteBR (ModuloAgenteBR pVentana){
        ventana = pVentana;
        ventana.btnRegistrar.addActionListener(this);
        ventana.btnEliminar.addActionListener(this);
        ventana.btnConsultar.addActionListener(this);
        ventana.btnModificar.addActionListener(this);
        ventana.btnInteresados.addActionListener(this);
        ventana.btnSalir.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == ventana.btnRegistrar){
        SeleccionarInmuebleAgregar ventanaNueva = new SeleccionarInmuebleAgregar();
        ControladorSeleccionarInmuebleAgregar controlador = new ControladorSeleccionarInmuebleAgregar(ventanaNueva);
        ventanaNueva.setVisible(true);
      }
      
      if (e.getSource() == ventana.btnEliminar){
        EliminarInmueble ventanaNueva = new EliminarInmueble();
        ControladorEliminarInmueble controlador = new ControladorEliminarInmueble(ventanaNueva);
        ventanaNueva.setVisible(true);
      }
      
      if (e.getSource() == ventana.btnConsultar){
        ConsultarCatalogo ventanaNueva = new ConsultarCatalogo();
        ControladorConsultarCatalogo controlador = new ControladorConsultarCatalogo(ventanaNueva);
        ventanaNueva.setVisible(true);
      }
      
      if (e.getSource() == ventana.btnModificar){
        IngresarInmuebleModificar ventanaNueva = new IngresarInmuebleModificar();
        ControladorIngresarInmuebleModificar controlador = new ControladorIngresarInmuebleModificar(ventanaNueva);
        ventanaNueva.setVisible(true);
      }
      
      if (e.getSource() == ventana.btnInteresados){
        ConsultarInteresados ventanaNueva = new ConsultarInteresados();
        ControladorConsultarInteresados controlador = new ControladorConsultarInteresados(ventanaNueva);
        ventanaNueva.setVisible(true);
      }
      
      if (e.getSource() == ventana.btnSalir){
        ventana.dispose();
      }
    }
    
}
