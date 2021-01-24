package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ModificarCentroComercial;

/**
 * Controlador para la clase de ModificarEdificio
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorModificarCentroComercial implements ActionListener{
  ModificarCentroComercial ventana = new ModificarCentroComercial();
  
  public ControladorModificarCentroComercial(ModificarCentroComercial pVentana){
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
