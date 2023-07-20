package Modelo;
import Interfaces.*;
import Interfaces.Constantes;


public class TrabajadoresCargos extends Trabajadores implements Constantes{
    
    private String turno;
    private String cargo;
    public TrabajadoresCargos(){}
    public String getTurno() {        return turno;    }
    public void setTurno(String turno) {        this.turno = turno;    }
    public String getCargo() {        return cargo;    }
    public void setCargo(String cargo) {        this.cargo = cargo;    }
    
    @Override
public double SueldoBase() {
    if (turno.equals(Turnos[1]) && cargo.equals(Cargo[1])) return Sueldos[0];
    if (turno.equals(Turnos[1]) && cargo.equals(Cargo[2])) return Sueldos[1];
    if (turno.equals(Turnos[1]) && cargo.equals(Cargo[3])) return Sueldos[2];
    if (turno.equals(Turnos[2]) && cargo.equals(Cargo[1])) return Sueldos[0];
    if (turno.equals(Turnos[2]) && cargo.equals(Cargo[2])) return Sueldos[1];
    if (turno.equals(Turnos[2]) && cargo.equals(Cargo[3])) return Sueldos[2];
    if (turno.equals(Turnos[3]) && cargo.equals(Cargo[1])) return Sueldos[1];
    if (turno.equals(Turnos[3]) && cargo.equals(Cargo[2])) return Sueldos[2];
    if (turno.equals(Turnos[3]) && cargo.equals(Cargo[3])) return Sueldos[3];
    return 0;
}

@Override
public double Bonificacion() {
    if (cargo.equals(Cargo[1])) return Bonificaciones[0] * SueldoBase();
    if (cargo.equals(Cargo[2])) return Bonificaciones[1] * SueldoBase();
    if (cargo.equals(Cargo[3])) return Bonificaciones[2] * SueldoBase();

  return 0;
    
}
    @Override
    public double Descuentos() {
        return SueldoBase()*(AFP+ESSALUD);
    }
    
    public Object[] Registrot(){
        Object[] fila={this.getDni(),this.getNom(),this.getPhone(),this.getTurno(),this.getCargo(),"S/."+this.SueldoFinal()};
        return fila;
    }
}
