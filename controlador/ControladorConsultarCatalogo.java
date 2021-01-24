package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ConsultarCatalogo;

/**
 * Controlador para la clase de ConsultarCatalogo
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorConsultarCatalogo implements ActionListener{
  ConsultarCatalogo ventana = new ConsultarCatalogo();
  
  
  
  public ControladorConsultarCatalogo(ConsultarCatalogo pVentana){
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