package BaseDatos;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CRUDproducto extends ConectarBD {
    public CRUDproducto(){}
    public CRUDproducto(JTextField txtCodigo) {}
    public void MostrarEnTabla(JTable tabla){
        String[] titulos={"ID_Producto","Nombre","Proveedor","Stock","PrecioUnitario"};
        DefaultTableModel modelo = new  DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        //metodo que muestra los datos
        String consProduc="select ID_producto,Nombre,Proveedor,Stock,PrecioUnitario from producto";
        try{            
            rs = st.executeQuery(consProduc);            
            while(rs.next()){
            Productos pro = new Productos(){};
            pro.setCod(rs.getInt(1));
            pro.setNom(rs.getString(2));
            pro.setProv(rs.getString(3));
            pro.setS(rs.getString(4));
            pro.setP(rs.getString(5));
            modelo.addRow(pro.Registro());
            }//fin del while            
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede recuperar consulta"+ex);
        }//fin del metodo
    }
    //metodo para insertar producto
    public void InsertarProducto (Productos pro){
        try {
        //preparar conuslta
            ps = conexion.prepareStatement(
            " insert into Producto values(?,?,?,?,?);");
        //actualizndo los parametros
            ps.setInt(1, pro.getCod());
            ps.setString(2, pro.getNom());
            ps.setString(3, pro.getProv());
            ps.setString(4, pro.getS());
            ps.setString(5, pro.getP());
            ps.executeUpdate();//alcutalizacion y ejecucion del insert
            Mensajes.M1("Registro insertado");
            conexion.close();
        }catch(Exception ex){
        Mensajes.M1("ERROR no se puede insertar.."+ex);
        }
    }//fin del metodo
    //Metodo para recuperar  un producto por el codigo, nombre o proveedor
    public Productos BuscarProducto (int codpro){
        Productos cod=null;
        try{
            rs = st.executeQuery("select * from producto where ID_producto ="+codpro+";");
            if(rs.next()){
                cod = new Productos();
                cod.setCod(rs.getInt(1));
                cod.setNom(rs.getString(2));
                cod.setProv(rs.getString(3));
                cod.setS(rs.getString(4));
                cod.setP(rs.getString(5));               
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede consultar el registro.."+ex);
        }
        return cod;
    }//fin del metodo buscar
    //metodo que actualiza el registro
    public void ActualizarProducto(Productos pro){
        try{
            ps = conexion.prepareStatement("update Producto set Nombre=?,"
            + "Proveedor=?,Stock=?,PrecioUnitario=? where ID_Producto=?");
            ps.setString(1, pro.getNom());
            ps.setString(2, pro.getProv());
            ps.setString(3, pro.getS());
            ps.setString(4, pro.getP());
            ps.setInt(5, pro.getCod());
            ps.executeUpdate();
            Mensajes.M1("Datos actualizados correctamente..");
            ps.close();
        }catch(Exception ex){
            Mensajes.M1("ERROR no se puede actualizar el registro.."+ex);
        }
    }//fin del metodo actualizar
    //metodo que elimina un producto
    public void EliminarProducto(int codpro){
        try{
            ps = conexion.prepareStatement("DELETE FROM producto"
                    + " WHERE ID_Producto = ?");
            ps.setInt(1, codpro);
            ps.executeUpdate();
            Mensajes.M1("Datos eliminado correctamente..");
            ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede eliminar el registro..");
        }
    }//fin del metodo
}//fin de la clase
