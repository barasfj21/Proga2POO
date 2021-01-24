package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ModificarEdificio;

/**
 * Controlador para la clase de ModificarEdificio
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorModificarEdificio implements ActionListener{
  ModificarEdificio ventana = new ModificarEdificio();
  
  public ControladorModificarEdificio(ModificarEdificio pVentana){
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
