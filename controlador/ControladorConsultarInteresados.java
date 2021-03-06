package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ConsultarInteresados;

/**
 * Controlador para la clase de ConsultarInteresados
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorConsultarInteresados implements ActionListener{
  ConsultarInteresados ventana = new ConsultarInteresados();
  
  public ControladorConsultarInteresados(ConsultarInteresados pVentana){
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
