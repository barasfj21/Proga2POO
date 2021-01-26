package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ModificarLote;

/**
 * Controlador para la clase de ModificarLote
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorModificarLote implements ActionListener{
  ModificarLote ventana = new ModificarLote();
  
  public ControladorModificarLote(ModificarLote pVentana){
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
