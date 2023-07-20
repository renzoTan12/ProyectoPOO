package Colecciones;
import java.util.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Interfaces.*;
import java.io.Serializable;

public class ListaTrabajador implements RecursosTablaTrabajador,Serializable{
    ArrayList<TrabajadoresCargos> Listat;
    public ListaTrabajador(){       
       Listat = new ArrayList<TrabajadoresCargos>();
    }
    //metodo que agraga un objeto
    public void AgregarObj(TrabajadoresCargos trabC){
        Listat.add(trabC);
    }
    //metodo que actualiza un objeto
    public void ActualizarObj(TrabajadoresCargos trabC, int posicion){
        Listat.set(posicion, trabC);
    }
    //metodo que elimina un objeto
    public void EliminarObj(int posicion){
        Listat.remove(posicion);
    }
    //metodo que recuepera un objeto
    public Trabajadores RecuperarObj(int posicion){
        return Listat.get(posicion);        
    }
    //metodo que busca un objeto y retorna la posicion
    // del objeto encontrado
    public int BuscarObj(String codbuscado){
        for(int indice=0;indice<Listat.size();indice++){
          if(codbuscado.equals(Listat.get(indice).getDni()))  
              return indice;
        }
        return -1;
    }
    
    //metodo que muestra todos los registros de la lista en un JTable
    public void MostrarEnTabla(JTable tabla){
        DefaultTableModel modelot = new DefaultTableModel
                                (null,titulos);
        tabla.setModel(modelot);
        for(int indice=0;indice<Listat.size();indice++){
            modelot.addRow(Listat.get(indice).Registrot());
        }
    }
}//fin de la tabla
