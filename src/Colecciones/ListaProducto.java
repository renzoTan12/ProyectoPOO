package Colecciones;
import java.util.*;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Interfaces.*;

public class ListaProducto implements RecursosTablaAdministrador{
    ArrayList<Productos> Lista;
    public ListaProducto(){       
       Lista = new ArrayList<Productos>();
    }
    //metodo que agraga un objeto
    public void AgregarObj(Productos prod){
        Lista.add(prod);
    }
    //metodo que actualiza un objeto
    public void ActualizarObj(Productos prod, int posicion){
        Lista.set(posicion, prod);
    }
    //metodo que elimina un objeto
    public void EliminarObj(int posicion){
        Lista.remove(posicion);
    }
    //metodo que recuepera un objeto
    public Productos RecuperarObj(int posicion){
        return Lista.get(posicion);        
    }
    //metodo que busca un objeto y retorna la posicion
    // del objeto encontrado
    public int BuscarObj(String codbuscado){
        for(int indice=0;indice<Lista.size();indice++){
          if(codbuscado.equals(Lista.get(indice).getCod()))  
              return indice;
        }
        return -1;
    }
    
    //metodo que muestra todos los registros de la lista en un JTable
    public void MostrarEnTabla(JTable tabla){
        DefaultTableModel modelo = new DefaultTableModel
                                (null,titulos);
        tabla.setModel(modelo);
        for(int indice=0;indice<Lista.size();indice++){
            modelo.addRow(Lista.get(indice).Registro());
        }
    }
}//fin de la tabla
