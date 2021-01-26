package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.GestionarNivelesEdificio;

/**
 * Controlador para la clase de GestionarNivelesEdificio
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorGestionarNivelesEdificio implements ActionListener{
  GestionarNivelesEdificio ventana = new GestionarNivelesEdificio();
  
  public ControladorGestionarNivelesEdificio(GestionarNivelesEdificio pVentana){
    ventana = pVentana; 
    
    ventana.btnRegresar.addActionListener(this);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == ventana.btnRegresar){
      ventana.dispose();
    }
  }
    
}
