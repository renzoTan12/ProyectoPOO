package Modelo;
public class Productos{
  private String nom;
  private int cod;
  private String prov;
  private String s;
  private String p;
  public Productos(){}
  public String getNom() {        return nom;    }
  public void setNom(String nom) {        this.nom = nom;    }
  public int getCod() {        return cod;    }
  public void setCod(int cod) {        this.cod = cod;    }
  public String getProv(){        return prov;   }
  public void setProv(String prov){       this.prov = prov;  }
  public String getS() {        return s;    }
  public void setS(String s) {        this.s = s;    }
  public String getP() {        return p;    }
  public void setP(String p) {        this.p = p;    } 
  
  public Object[] Registro(){
    Object[] fila={this.getCod(), this.getNom(),this.getProv(),
                   this.getS(),"S/."+getP()};
    return fila;  
    }
}
