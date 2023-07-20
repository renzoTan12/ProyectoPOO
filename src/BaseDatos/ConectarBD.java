package BaseDatos;
//libreri
import java.sql.*;
import Formatos.*;

public class ConectarBD implements Parametros{
    public Connection conexion;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement ps;
    public ConectarBD(){ //constructor
        try{
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL,USER,CLAVE);
            st = conexion.createStatement();       
        }catch(Exception ex){
            Mensajes.M1("ERROR: no se puede conectar a la BD..."+ex);
        }        
    }    
}//fin del class
