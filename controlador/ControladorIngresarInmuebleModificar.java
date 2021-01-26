package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.IngresarInmuebleModificar;

/**
 * Controlador para la clase de RegistrarCasa
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorIngresarInmuebleModificar implements ActionListener{
  IngresarInmuebleModificar ventana = new IngresarInmuebleModificar();
  
  public ControladorIngresarInmuebleModificar(IngresarInmuebleModificar pVentana){
    ventana = pVentana; 
    
    ventana.btnCancelar.addActionListener(this);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnCancelar){
      ventana.dispose();
    }
  }
    
}