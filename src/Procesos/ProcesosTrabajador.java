package Procesos;
import Interfaces.*;
import Modelo.*;
import Vista.*;
public class ProcesosTrabajador implements Constantes{
    public static void LimpiarEntradastr(frmRegistrarTrabajador ft){
        ft.txtDni.setText("");
        ft.txtNombre.setText("");
        ft.txtTelefono.setText("");
        ft.cbxCargo.setSelectedIndex(0);
        ft.cbxTurno.setSelectedIndex(0);
        ft.txtDni.requestFocus();
    }
    public static TrabajadoresCargos LeerTrabajador(frmRegistrarTrabajador ft){
        TrabajadoresCargos trabC = new TrabajadoresCargos(){};
        trabC.setDni(Integer.parseInt(ft.txtDni.getText()));
        trabC.setNom(ft.txtNombre.getText());
        trabC.setPhone(ft.txtTelefono.getText());
        trabC.setTurno(ft.cbxTurno.getSelectedItem().toString());
        trabC.setCargo(ft.cbxCargo.getSelectedItem().toString());
        return trabC;
    }
    //metodo que complea los combos
      public static void CargarCombos(frmRegistrarTrabajador ft){    
    ft.cbxTurno.removeAllItems();
    ft.cbxCargo.removeAllItems();
    for(int i=0;i<Turnos.length;i++)
        ft.cbxTurno.addItem(Turnos[i]);
    for(int i=0;i<Cargo.length;i++)
        ft.cbxCargo.addItem(Cargo[i]);
   
    }
    public static void PresentarForma(frmRegistrarTrabajador ft){
        ft.setTitle("Registro de Trabajador");
        ft.setVisible(true);
        ft.setLocation(0, 0);
    }
   }