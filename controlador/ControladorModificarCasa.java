package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ModificarCasa;

/**
 * Controlador para la clase de ModificarCasa
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorModificarCasa implements ActionListener{
  ModificarCasa ventana = new ModificarCasa();
  
  public ControladorModificarCasa(ModificarCasa pVentana){
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