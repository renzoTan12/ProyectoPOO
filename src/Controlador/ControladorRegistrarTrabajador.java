package Controlador;
//libreria
import BaseDatos.*;
import Formatos.Mensajes;
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Procesos.ProcesosTrabajador;

public class ControladorRegistrarTrabajador implements ActionListener{
    frmRegistrarTrabajador vista;
    CRUDtrabajador crudt;
    TrabajadoresCargos trabC;
    
    public ControladorRegistrarTrabajador(frmRegistrarTrabajador formB){
        vista = formB;
        formB.btnAgregar.addActionListener(this);
        formB.btnBuscarT.addActionListener(this);
        formB.btnEditarT.addActionListener(this);
        formB.btnEliminarT.addActionListener(this);
        ActualizarTabla();
        ProcesosTrabajador.PresentarForma(vista);
    }//fin del constructor
    private void ActualizarTabla(){
       frmLoginAdministrador.Listat.MostrarEnTabla(vista.tblDatosTrabajador);
       ProcesosTrabajador.CargarCombos(vista);
            crudt = new CRUDtrabajador();
            crudt.MostrarEnTabla(vista.tblDatosTrabajador);        
   }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== vista.btnAgregar){
            Trabajadores t = ProcesosTrabajador.LeerTrabajador(vista);
            crudt = new CRUDtrabajador();
            crudt.InsertarTrabajador((TrabajadoresCargos) t);
            
            ProcesosTrabajador.LimpiarEntradastr(vista);
            ActualizarTabla();
        }//fin de agregar
        if(e.getSource()==vista.btnBuscarT){
            int dni = Integer.parseInt(vista.txtDni.getText());
            crudt = new CRUDtrabajador();
            trabC = crudt.BuscarTrabajador(dni);
            if(trabC==null){
                Mensajes.M1("El DNI: "+dni+" no existe en la tabla");
            }else{
                vista.txtNombre.setText(trabC.getNom());
                vista.txtTelefono.setText(trabC.getPhone());
                vista.cbxTurno.setSelectedItem(trabC.getTurno());
                vista.cbxCargo.setSelectedItem(trabC.getCargo());                
            }
        }if(e.getSource()== vista.btnEditarT){
            trabC = ProcesosTrabajador.LeerTrabajador(vista);
            trabC.setDni(Integer.parseInt(vista.txtDni.getText()));
            crudt = new CRUDtrabajador();
            crudt.ActualizarTrabajador(trabC);
            ActualizarTabla();
            ProcesosTrabajador.LimpiarEntradastr(vista);
        }
        if(e.getSource()==vista.btnEliminarT){
            int respuesta = Mensajes.M3("CONFIRMAR!!", "¿Desea eliminar el trabajador");
            if(respuesta==0){
                int dni = Integer.parseInt(vista.txtDni.getText());
                crudt = new CRUDtrabajador();
                crudt.EliminarTrabajador(dni);;
                ActualizarTabla();
                ProcesosTrabajador.LimpiarEntradastr(vista);
            }
        }
    }
    
}
