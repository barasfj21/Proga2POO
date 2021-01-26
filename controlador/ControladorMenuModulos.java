
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.MenuModulos;
import vista.ModuloAgenteBR;

/**
 * Controlador para la clase de MenuModulos
 * 
 * @author AndresGutierrez_AndresBarahona_JosePabloBarrantes
 * @version 1.0
 */
public class ControladorMenuModulos implements ActionListener {
    MenuModulos ventana = new MenuModulos();
    
    public ControladorMenuModulos (MenuModulos pVentana){
        ventana = pVentana;
        ventana.btnAgenteModuloBR.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == ventana.btnAgenteModuloBR){
        ModuloAgenteBR ventanaNueva = new ModuloAgenteBR();
        ControladorModuloAgenteBR controlador = new ControladorModuloAgenteBR(ventanaNueva);
        ventanaNueva.setVisible(true);
      }
    }
}
