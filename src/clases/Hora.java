/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author user
 */
public class Hora {

    private int Horas;
    private int Minutos;
    private int Sg;

    public Hora() {
        this.Horas = 0;
        this.Minutos = 0;
        this.Sg = 0;
    }

    public Hora(int Horas, int Minutos, int Sg) {
        this.Horas = Horas;
        this.Minutos = Minutos;
        this.Sg = Sg;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getSg() {
        return Sg;
    }

    public void setSg(int Sg) {
        this.Sg = Sg;
    }

    public String ValidarHoras() {
        String res;
        if ((this.getHoras() <= 23) && (this.getMinutos() <= 59) && (this.getSg() <= 59)) {
            res = "La hora es correcta";
        } else {
            res = "La hora es incorrecta";
        }
        return res;
    }

    public String MostrarHora() {
        String res;
        res ="La hora es:" +this.getHoras()+":"+"Los minutos son:"+this.getMinutos() +":"+"Los segundos son:"+ this.getSg();
        return res;
    }

    
    public String HorasIguales(Hora hora2) {
        String res;
        if (this.getHoras() == hora2.getHoras() && this.getMinutos() == hora2.getMinutos() && this.getSg() == hora2.getSg()) {
            res = "Las horas son iguales";
        } else {
            res = "Las horas no son iguales";
          }
        return res;
          }
      
      
      public String CompararHoras(Hora hora2) {
        String res = null;
        if (this.getHoras() > hora2.getHoras()) {
            res = "La Primera hora es mayor que la segunda hora";
        } else if (this.getHoras() == hora2.Horas && this.getMinutos() > hora2.getMinutos()) {
            res = "La Primera hora es mayor que la segunda hora";
        } else if (this.getHoras() == hora2.Horas && this.getMinutos() == hora2.Minutos && this.getSg() > hora2.getSg()) {
            res = "La primera hora es mayor que la segunda hora";
        } else if (this.getHoras() < hora2.getHoras()) {
            res = "La primera hora es menor que la segunda hora";
        } else if (this.getHoras() == hora2.Horas && this.getMinutos() < hora2.getMinutos()) {
            res = "La primera hora es menor que la segura hora";
        } else if (this.getHoras() == hora2.Horas && this.getMinutos() == hora2.Minutos && this.getSg() < hora2.getSg()) {
            res = "La primera hora es menor que la segunda hora";
        }
        return res;
    }

}
