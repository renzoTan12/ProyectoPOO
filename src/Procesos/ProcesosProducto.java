package Procesos;
import Interfaces.*;
import Modelo.*;
import Vista.*;
public class ProcesosProducto {
    public static void LimpiarEntradas(frmRegistrarProducto fp){
        fp.txtCodigo.setText("");
        fp.txtNombre.setText("");
        fp.txtProveedor.setText("");
        fp.txtStock.setText("");
        fp.txtPrecio.setText("");
        fp.txtCodigo.requestFocus();
    }
    public static Productos LeerProductos(frmRegistrarProducto fp){
        Productos prod=new Productos() {};
        prod.setCod(Integer.parseInt(fp.txtCodigo.getText()));
        prod.setNom(fp.txtNombre.getText());
        prod.setProv(fp.txtProveedor.getText());
        prod.setS(fp.txtStock.getText());
        prod.setP(fp.txtPrecio.getText());
        return prod;
    }
    public static void PresentarForma(frmRegistrarProducto fp){
        fp.setTitle("Registro de Productos");
        fp.setVisible(true);
        fp.setLocation(0, 0);
    }
}
