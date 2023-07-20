package Controlador;
//LIBRERIA
import BaseDatos.*;
import Formatos.Mensajes;
import Modelo.*;
import Procesos.ProcesosProducto;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistrarProducto implements ActionListener{
    frmRegistrarProducto vista;
    CRUDproducto crudt;
    Productos pro;
    public ControladorRegistrarProducto(frmRegistrarProducto formA){
        vista = formA;
        formA.btnAgregar.addActionListener(this);
        formA.btnBuscarA.addActionListener(this);
        formA.btnEditarA.addActionListener(this);
        formA.btnEliminarA.addActionListener(this);
        ProcesosProducto.PresentarForma(vista);
        ActualizarTabla();
    }//fin del constructor
    private void ActualizarTabla(){
         crudt = new CRUDproducto();
         crudt.MostrarEnTabla(vista.tblDatosProductos);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.btnAgregar){
            Productos p = ProcesosProducto.LeerProductos(vista);
            crudt = new CRUDproducto();
            crudt.InsertarProducto(p);
            
            ProcesosProducto.LimpiarEntradas(vista);
            ActualizarTabla();
        }//fin de agregar
        if(e.getSource()==vista.btnBuscarA){
            int codpro = Integer.parseInt(vista.txtCodigo.getText());
            crudt = new CRUDproducto();
            pro = crudt.BuscarProducto(codpro);
            if(pro==null) {
                Mensajes.M1("El ID: "+codpro+" no existe en la tabla");
            }else{
                vista.txtNombre.setText(pro.getNom());
                vista.txtProveedor.setText(pro.getProv());
                vista.txtStock.setText(pro.getS());
                vista.txtPrecio.setText(pro.getP());
            }
        }//fin de buscar
        if(e.getSource()== vista.btnEditarA){
            pro = ProcesosProducto.LeerProductos(vista);
            pro.setCod(Integer.parseInt(vista.txtCodigo.getText()));
            crudt = new CRUDproducto();
            crudt.ActualizarProducto(pro);
            ActualizarTabla();
             ProcesosProducto.LimpiarEntradas(vista);
        }//fin de editar
        if(e.getSource()==vista.btnEliminarA){
            int respuesta = Mensajes.M3("CONFIRMAR!!", "¿Desea elimimar el produto");
            if(respuesta==0){
                int codpro = Integer.parseInt(vista.txtCodigo.getText());
                crudt = new CRUDproducto();
                crudt.EliminarProducto(codpro);
                ActualizarTabla();
                ProcesosProducto.LimpiarEntradas(vista);
            }//fin de eliminar
        }
    }
}
