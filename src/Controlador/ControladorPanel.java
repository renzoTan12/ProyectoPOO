package Controlador;
//LIBRERIAS
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.JInternalFrame;
public class ControladorPanel implements ActionListener {
    frmPanelAdministrador vista;
    public ControladorPanel(frmPanelAdministrador vista){
        this.vista = vista;
        vista.btnRegistrarProducto.addActionListener(this);
        vista.btnRegistrarTrabajador.addActionListener(this);        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnRegistrarProducto){
            frmRegistrarProducto frp = new frmRegistrarProducto();
            ControladorRegistrarProducto crp = new ControladorRegistrarProducto(frp);
            AgregarFrame(frp);
            frp.setTitle("Registro de Productos ");
            frp.setVisible(true);
        }
        if (e.getSource()==vista.btnRegistrarTrabajador){
        frmRegistrarTrabajador frt = new frmRegistrarTrabajador();
        ControladorRegistrarTrabajador crt = new ControladorRegistrarTrabajador(frt);
        AgregarFrame(frt);
        frt.setTitle("Registro de Trabajador ");
        frt.setVisible(true);
        }
    }

    private void AgregarFrame(JInternalFrame frame) {
        vista.dspEscritorioA.removeAll();
        vista.dspEscritorioA.add(frame);
        vista.dspEscritorioA.repaint();
    }
    
}
