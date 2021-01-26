package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.LogIn;
import vista.ModuloAgenteBR;

/**
 * Controlador para la clase de LogIn
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */

public class ControladorLogIn implements ActionListener {
    LogIn ventana = new LogIn();
    
    public ControladorLogIn (LogIn pVentana){
        ventana = pVentana;
        ventana.btnIngresar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == ventana.btnIngresar){
        ModuloAgenteBR ventanaNueva = new ModuloAgenteBR();
        ControladorModuloAgenteBR controlador = new ControladorModuloAgenteBR(ventanaNueva);
        ventanaNueva.setVisible(true);
        ventana.dispose();
      }
    }
    
    
}
