package BaseDatos;
import Formatos.Mensajes;
import Interfaces.*;
import Interfaces.Constantes;
import Procesos.ProcesosTrabajador;
import Procesos.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class CRUDtrabajador extends ConectarBD{                      
    public CRUDtrabajador(){}
    public CRUDtrabajador(JTextField txtDni) {}
    public void MostrarEnTabla(JTable tabla){
        String[] titulos={"DNI","Nombre","Telefono","Turno","Cargo","Sueldo"}; 
        DefaultTableModel modelot = new  DefaultTableModel(null,titulos);
        tabla.setModel(modelot);
        //metodo que muestra los datos
        String consTraba="select DNI,Nombre,Telefono,Turno,Cargo,Sueldo from Trabajador";
        try{            
            rs = st.executeQuery(consTraba);
            while(rs.next()){
                // Crear una instancia de la clase Trabajadores
            TrabajadoresCargos tra = new TrabajadoresCargos();
            tra.setDni(rs.getInt(1));
            tra.setNom(rs.getString(2));
            tra.setPhone(rs.getString(3));
            tra.setTurno(rs.getString(4));
            tra.setCargo(rs.getString(5));
            tra.SueldoFinal();
            
            modelot.addRow(tra.Registrot());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede recuperar la consulta: " + ex);
        }
    }
    //metodo para insertar producto
    public void InsertarTrabajador (TrabajadoresCargos tra){
    try {
        //preparar conuslta
        ps = conexion.prepareStatement(
        " insert into Trabajador(DNI,Nombre,Telefono,Turno,Cargo,Sueldo) values(?,?,?,?,?,?);");
        //actualizndo los parametros
            ps.setInt(1, tra.getDni());
            ps.setString(2, tra.getNom());
            ps.setString(3, tra.getPhone());
            ps.setString(4,tra.getTurno());
            ps.setString(5,tra.getCargo());
            ps.setDouble(6,tra.SueldoFinal());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro insertado");
            conexion.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede insertar: " + ex);
        }
    }
    //Metodo para recuperar  un producto por el codigo, nombre o proveedor
    public TrabajadoresCargos BuscarTrabajador(int dni) {
        TrabajadoresCargos tra = null;
        try {
            rs = st.executeQuery("SELECT * FROM Trabajador WHERE DNI = '" + dni + "'");
            if (rs.next()) {
                tra = new TrabajadoresCargos();
                tra.setDni(rs.getInt(1));
                tra.setNom(rs.getString(2));
                tra.setPhone(rs.getString(3));
                tra.setTurno(rs.getString(4));
                tra.setCargo(rs.getString(5));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede consultar el registro: " + ex);
        }
        return tra;
    }//fin del metodo
    //metodo que actualiza el registro
    public void ActualizarTrabajador(TrabajadoresCargos tra ) {
        try {
            ps = conexion.prepareStatement("UPDATE Trabajador SET Nombre = ?, Telefono = ?, Turno = ?, Cargo = ? WHERE DNI = ?");
            ps.setString(1, tra.getNom());
            ps.setString(2, tra.getPhone());
            ps.setString(3, tra.getTurno());
            ps.setString(4, tra.getCargo());
            ps.setInt(5, tra.getDni());
           // ps.setDouble(6,tra.SueldoFinal());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: No se puede actualizar el registro: " + ex);
        }
        
    }
    //metodo que elimina un producto
    public void EliminarTrabajador(int dni){
        try{
            ps = conexion.prepareStatement("DELETE FROM Trabajador"
                    + " WHERE DNI = ?");
            ps.setInt(1, dni);
            ps.executeUpdate();
         Mensajes.M1("Datos eliminado correctamente..");
         ps.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,
                    "ERROR no se puede eliminar el registro..");
             

        }
    }//fin del metodo
}//fin de la clase