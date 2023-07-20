package Modelo;
import Interfaces.*;
import java.io.Serializable;
public abstract class Trabajadores implements
                                    Serializable{
    private int dni;
    private String nom;
    private String phone;

     
    public Trabajadores(){}
    
    public int getDni() {        return dni;    }    
    public void setDni(int dni) {        this.dni = dni;    }
    public String getNom() {        return nom;    }
    public void setNom(String nom) {        this.nom = nom;    }    
    public String getPhone() {        return phone;    }
    public void setPhone(String phone) {        this.phone = phone;    }

    public abstract double SueldoBase();
    public abstract double Bonificacion();
    public abstract double Descuentos();
    
   
    public double SueldoFinal(){
        return SueldoBase()+Bonificacion()-Descuentos();
    }

   // public Object[] Registrot(int num){
    //   Object[] fila={this.getDni(),this.getNom(),this.getPhone(),
     //                 turno,"S/."+this.getSueldo()};
     //   return fila;
  // }
}
